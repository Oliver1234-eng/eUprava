package com.katastar.aplikacijazakatastar.controller;

import com.katastar.aplikacijazakatastar.dto.GradjaninDTO;
import com.katastar.aplikacijazakatastar.dto.IstorijaPromenaDTO;
import com.katastar.aplikacijazakatastar.dto.KatastarDTO;
import com.katastar.aplikacijazakatastar.dto.NepokretnostDTO;
import com.katastar.aplikacijazakatastar.model.IstorijaPromena;
import com.katastar.aplikacijazakatastar.model.Katastar;
import com.katastar.aplikacijazakatastar.model.Nepokretnost;
import com.katastar.aplikacijazakatastar.service.KatastarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@RestController
@RequestMapping(value = "api/katastar/katastar")
public class KatastarController {

    @Autowired
    private KatastarService katastarService;

    @GetMapping(value = "/all")
    public ResponseEntity<List<KatastarDTO>> getAllKatastri() {

        List<Katastar> katastri = katastarService.findAll();

        List<KatastarDTO> katastriDTO = new ArrayList<>();
        for (Katastar k : katastri) {
            katastriDTO.add(new KatastarDTO(k));
        }

        return new ResponseEntity<>(katastriDTO, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<KatastarDTO>> getKatastriPage(Pageable page) {

        Page<Katastar> katastri = katastarService.findAll(page);

        List<KatastarDTO> katastriDTO = new ArrayList<>();
        for (Katastar k : katastri) {
            katastriDTO.add(new KatastarDTO(k));
        }

        return new ResponseEntity<>(katastriDTO, HttpStatus.OK);
    }

    @GetMapping(value = "/{korisnickoIme}")
    public ResponseEntity<KatastarDTO> getKatastarByKorisnickoIme(@PathVariable String korisnickoIme) {

        Katastar katastar = katastarService.findOneByKorisnickoIme(korisnickoIme);

        if (katastar == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(new KatastarDTO(katastar), HttpStatus.OK);
    }

    @DeleteMapping(value = "/{korisnickoIme}")
    public ResponseEntity<Void> deleteKatastar(@PathVariable String korisnickoIme) {

        Katastar katastar = katastarService.findOne(korisnickoIme);

        if (katastar != null) {
            katastarService.remove(korisnickoIme);
            return new ResponseEntity<>(HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping(value = "/findJmbg")
    public ResponseEntity<List<KatastarDTO>> getKatastriByJmbg(@RequestParam String jmbg) {

        List<Katastar> katastri = katastarService.findByJmbg(jmbg);

        List<KatastarDTO> katastriDTO = new ArrayList<>();
        for (Katastar k : katastri) {
            katastriDTO.add(new KatastarDTO(k));
        }
        return new ResponseEntity<>(katastriDTO, HttpStatus.OK);
    }

    @GetMapping(value = "/jmbg")
    public ResponseEntity<List<KatastarDTO>> pronadjiKorisnikePoJmbg(@RequestParam String jmbg) {

        List<Katastar> katastri = katastarService.pronadjiPoJmbg(jmbg);

        List<KatastarDTO> katastriDTO = new ArrayList<>();
        for (Katastar k : katastri) {
            katastriDTO.add(new KatastarDTO(k));
        }
        return new ResponseEntity<>(katastriDTO, HttpStatus.OK);
    }

    @GetMapping(value = "/findKorisnickoImeLozinka")
    public ResponseEntity<List<KatastarDTO>> getUsersByKorisnickoImeAndLozinka(@RequestParam String korisnickoIme,
                                                                               @RequestParam String lozinka) {

        List<Katastar> katastri = katastarService.findByKorisnickoImeAndLozinka(korisnickoIme, lozinka);

        List<KatastarDTO> katastriDTO = new ArrayList<>();
        for (Katastar k : katastri) {
            katastriDTO.add(new KatastarDTO(k));
        }
        return new ResponseEntity<>(katastriDTO, HttpStatus.OK);
    }

    @GetMapping(value = "/{katastarKorisnickoIme}/nepokretnosti")
    public ResponseEntity<List<NepokretnostDTO>> getKatastarNepokretnosti(@PathVariable String katastarKorisnickoIme) {

        Katastar katastar = katastarService.findOneWithNepokretnosti(katastarKorisnickoIme);

        if (katastar == null) {
            return new ResponseEntity<>(new ArrayList<>(), HttpStatus.OK);
        }

        Set<Nepokretnost> nepokretnosti = katastar.getNepokretnosti();
        List<NepokretnostDTO> nepokretnostiDTO = new ArrayList<>();

        for (Nepokretnost n : nepokretnosti) {
            NepokretnostDTO nepokretnostDTO = new NepokretnostDTO();
            nepokretnostDTO.setId(n.getId());
            nepokretnostDTO.setAdresa(n.getAdresa());
            nepokretnostDTO.setBrojParcele(n.getBrojParcele());
            nepokretnostDTO.setBrojDelaParcele(n.getBrojDelaParcele());
            nepokretnostDTO.setPovrsina(n.getPovrsina());
            nepokretnostDTO.setPotes(n.getPotes());
            nepokretnostDTO.setNacinKoriscenjaZemljista(n.getNacinKoriscenjaZemljista());
            nepokretnostDTO.setNacinKoriscenjaObjekta(n.getNacinKoriscenjaObjekta());
            nepokretnostDTO.setKatastar(new KatastarDTO(n.getKatastar()));
            nepokretnostDTO.setGradjanin(new GradjaninDTO(n.getGradjanin()));

            nepokretnostiDTO.add(nepokretnostDTO);
        }

        return new ResponseEntity<>(nepokretnostiDTO, HttpStatus.OK);
    }

    @GetMapping(value = "/{katastarKorisnickoIme}/istorijePromena")
    public ResponseEntity<List<IstorijaPromenaDTO>> getKatastarIstorijePromena(@PathVariable String katastarKorisnickoIme) {

        Katastar katastar = katastarService.findOneWithIstorijePromena(katastarKorisnickoIme);

        if (katastar == null) {
            return new ResponseEntity<>(new ArrayList<>(), HttpStatus.OK);
        }

        Set<IstorijaPromena> istorijePromena = katastar.getIstorijePromena();
        List<IstorijaPromenaDTO> istorijePromenaDTO = new ArrayList<>();

        for (IstorijaPromena ip : istorijePromena) {
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
