package notar.controller;


import notar.model.dto.NepokretnostDTO;
import notar.model.entity.Nepokretnost;
import notar.service.functionality.NepokretnostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "api/katastar/nepokretnosti")
public class NepokretnostController {

    @Autowired
    private NepokretnostService nepokretnostService;

    @GetMapping
    public ResponseEntity<List<NepokretnostDTO>> getNepokretnosti() {

        List<Nepokretnost> nepokretnosti = nepokretnostService.findAll();

        List<NepokretnostDTO> nepokretnostiDTO = new ArrayList<>();
        for (Nepokretnost n : nepokretnosti) {
            nepokretnostiDTO.add(new NepokretnostDTO(n));
        }

        return new ResponseEntity<>(nepokretnostiDTO, HttpStatus.OK);
    }

    @GetMapping(value = "/{brojParcele}")
    public ResponseEntity<NepokretnostDTO> getNepokretnost(@PathVariable String brojParcele) {

        Nepokretnost nepokretnost = nepokretnostService.findOne(brojParcele);

        if (nepokretnost == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(new NepokretnostDTO(nepokretnost), HttpStatus.OK);
    }

    @PostMapping(consumes = "application/json")
    public ResponseEntity<NepokretnostDTO> saveNepokretnost(@RequestBody NepokretnostDTO nepokretnostDTO) {

        Nepokretnost nepokretnost = new Nepokretnost();
        nepokretnost.setAdresa(nepokretnostDTO.getAdresa());
        nepokretnost.setBrojParcele(nepokretnostDTO.getBrojParcele());
        nepokretnost.setBrojDelaParcele(nepokretnostDTO.getBrojDelaParcele());
        nepokretnost.setPovrsina(nepokretnostDTO.getPovrsina());
        nepokretnost.setPotes(nepokretnostDTO.getPotes());
        nepokretnost.setNacinKoriscenjaZemljista(nepokretnostDTO.getNacinKoriscenjaZemljista());
        nepokretnost.setNacinKoriscenjaObjekta(nepokretnostDTO.getNacinKoriscenjaObjekta());
        nepokretnost.setKatastar(nepokretnostDTO.getKatastar());
        nepokretnost.setStariVlasnik(nepokretnostDTO.getStariVlasnik());
        nepokretnost.setNoviVlasnik(nepokretnostDTO.getNoviVlasnik());

        nepokretnost = nepokretnostService.save(nepokretnost);
        return new ResponseEntity<>(new NepokretnostDTO(nepokretnost), HttpStatus.CREATED);
    }

    @PutMapping(consumes = "application/json", value = "/izmena")
    public ResponseEntity<NepokretnostDTO> updateNepokretnost(@RequestBody NepokretnostDTO nepokretnostDTO) {

        Nepokretnost nepokretnost = nepokretnostService.findOne(nepokretnostDTO.getBrojParcele());

        if (nepokretnost == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        nepokretnost.setStariVlasnik(nepokretnostDTO.getStariVlasnik());
        nepokretnost.setNoviVlasnik(nepokretnostDTO.getNoviVlasnik());

        nepokretnost = nepokretnostService.save(nepokretnost);
        return new ResponseEntity<>(new NepokretnostDTO(nepokretnost), HttpStatus.OK);
    }

    @PutMapping(consumes = "application/json", value = "/izmenaDva")
    public ResponseEntity<NepokretnostDTO> updateNepokretnostTwo(@RequestBody NepokretnostDTO nepokretnostDTO) {

        Nepokretnost nepokretnost = nepokretnostService.findOne(nepokretnostDTO.getBrojParcele());

        if (nepokretnost == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        nepokretnost.setStariVlasnik(nepokretnostDTO.getStariVlasnik());

        nepokretnost = nepokretnostService.save(nepokretnost);
        return new ResponseEntity<>(new NepokretnostDTO(nepokretnost), HttpStatus.OK);
    }

    @DeleteMapping(value = "/{brojParcele}")
    public ResponseEntity<Void> deleteNepokretnost(@PathVariable String brojParcele) {

        Nepokretnost nepokretnost = nepokretnostService.findOne(brojParcele);

        if (nepokretnost != null) {
            nepokretnostService.remove(brojParcele);
            return new ResponseEntity<>(HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
