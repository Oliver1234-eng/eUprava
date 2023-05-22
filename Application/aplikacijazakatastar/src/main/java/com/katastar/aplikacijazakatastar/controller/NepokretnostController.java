package com.katastar.aplikacijazakatastar.controller;

import com.katastar.aplikacijazakatastar.dto.IstorijaPromenaDTO;
import com.katastar.aplikacijazakatastar.dto.KatastarDTO;
import com.katastar.aplikacijazakatastar.dto.NepokretnostDTO;
import com.katastar.aplikacijazakatastar.model.Gradjanin;
import com.katastar.aplikacijazakatastar.model.IstorijaPromena;
import com.katastar.aplikacijazakatastar.model.Katastar;
import com.katastar.aplikacijazakatastar.model.Nepokretnost;
import com.katastar.aplikacijazakatastar.service.GradjaninService;
import com.katastar.aplikacijazakatastar.service.KatastarService;
import com.katastar.aplikacijazakatastar.service.NepokretnostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@RestController
@RequestMapping(value = "api/katastar/nepokretnosti")
public class NepokretnostController {

    @Autowired
    private NepokretnostService nepokretnostService;

    @Autowired
    private KatastarService katastarService;

    @Autowired
    private GradjaninService gradjaninService;

    @GetMapping
    public ResponseEntity<List<NepokretnostDTO>> getNepokretnosti() {

        List<Nepokretnost> nepokretnosti = nepokretnostService.findAll();

        List<NepokretnostDTO> nepokretnostiDTO = new ArrayList<>();
        for (Nepokretnost n : nepokretnosti) {
            nepokretnostiDTO.add(new NepokretnostDTO(n));
        }

        return new ResponseEntity<>(nepokretnostiDTO, HttpStatus.OK);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<NepokretnostDTO> getNepokretnost(@PathVariable Integer id) {

        Nepokretnost nepokretnost = nepokretnostService.findOne(id);

        if (nepokretnost == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(new NepokretnostDTO(nepokretnost), HttpStatus.OK);
    }

    @PostMapping(consumes = "application/json")
    public ResponseEntity<NepokretnostDTO> saveNepokretnost(@RequestBody NepokretnostDTO nepokretnostDTO) {

        if (nepokretnostDTO.getKatastar() == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        Katastar katastar = katastarService.findOneWithNepokretnosti(nepokretnostDTO.getKatastar().getKorisnickoIme());

        if (katastar == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        if (nepokretnostDTO.getGradjanin() == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        Gradjanin gradjanin = gradjaninService.findOneWithNepokretnosti(nepokretnostDTO.getGradjanin().getKorisnickoIme());

        if (gradjanin == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        Nepokretnost nepokretnost = new Nepokretnost();
        nepokretnost.setAdresa(nepokretnostDTO.getAdresa());
        nepokretnost.setBrojParcele(nepokretnostDTO.getBrojParcele());
        nepokretnost.setBrojDelaParcele(nepokretnostDTO.getBrojDelaParcele());
        nepokretnost.setPovrsina(nepokretnostDTO.getPovrsina());
        nepokretnost.setPotes(nepokretnostDTO.getPotes());
        nepokretnost.setNacinKoriscenjaZemljista(nepokretnostDTO.getNacinKoriscenjaZemljista());
        nepokretnost.setNacinKoriscenjaObjekta(nepokretnostDTO.getNacinKoriscenjaObjekta());
        nepokretnost.setKatastar(katastar);
        nepokretnost.setGradjanin(gradjanin);

        nepokretnost = nepokretnostService.save(nepokretnost);
        return new ResponseEntity<>(new NepokretnostDTO(nepokretnost), HttpStatus.CREATED);
    }

    @PutMapping(consumes = "application/json")
    public ResponseEntity<NepokretnostDTO> updateNepokretnost(@RequestBody NepokretnostDTO nepokretnostDTO) {

        Nepokretnost nepokretnost = nepokretnostService.findOne(nepokretnostDTO.getId());

        if (nepokretnost == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        nepokretnost.setAdresa(nepokretnostDTO.getAdresa());
        nepokretnost.setBrojParcele(nepokretnostDTO.getBrojParcele());
        nepokretnost.setBrojDelaParcele(nepokretnostDTO.getBrojDelaParcele());
        nepokretnost.setPovrsina(nepokretnostDTO.getPovrsina());
        nepokretnost.setPotes(nepokretnostDTO.getPotes());
        nepokretnost.setNacinKoriscenjaZemljista(nepokretnostDTO.getNacinKoriscenjaZemljista());
        nepokretnost.setNacinKoriscenjaObjekta(nepokretnostDTO.getNacinKoriscenjaObjekta());

        nepokretnost = nepokretnostService.save(nepokretnost);
        return new ResponseEntity<>(new NepokretnostDTO(nepokretnost), HttpStatus.OK);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> deleteNepokretnost(@PathVariable Integer id) {

        Nepokretnost nepokretnost = nepokretnostService.findOne(id);

        if (nepokretnost != null) {
            nepokretnostService.remove(id);
            return new ResponseEntity<>(HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping(value = "/{nepokretnostId}/istorijePromena")
    public ResponseEntity<List<IstorijaPromenaDTO>> getNepokretnostIstorijePromena(@PathVariable Integer nepokretnostId) {

        Nepokretnost nepokretnost = nepokretnostService.findOneWithIstorijePromena(nepokretnostId);

        if (nepokretnost == null) {
            return new ResponseEntity<>(new ArrayList<>(), HttpStatus.OK);
        }

        Set<IstorijaPromena> istorijePromena = nepokretnost.getIstorijePromena();
        List<IstorijaPromenaDTO> istorijePromenaDTO = new ArrayList<>();

        for (IstorijaPromena ip: istorijePromena) {
            IstorijaPromenaDTO istorijaPromenaDTO = new IstorijaPromenaDTO();
            istorijaPromenaDTO.setId(ip.getId());
            istorijaPromenaDTO.setDatumPromene(ip.getDatumPromene());
            istorijaPromenaDTO.setNepokretnost(new NepokretnostDTO(ip.getNepokretnost()));
            istorijaPromenaDTO.setKatastar(new KatastarDTO(ip.getKatastar()));

            istorijePromenaDTO.add(istorijaPromenaDTO);
        }

        return new ResponseEntity<>(istorijePromenaDTO, HttpStatus.OK);
    }
}
