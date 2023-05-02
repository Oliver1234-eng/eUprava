package notar.controller;

import notar.model.dto.OsobaDTO;
import notar.model.entity.Notar;
import notar.model.entity.Svedok;
import notar.service.functionality.NotarService;
import notar.service.functionality.SvedokService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("api/svedok/")
public class SvedokController {
    @Autowired
    private SvedokService svedokService;

    //add svedok to db
    @PostMapping(value="add/", consumes = "application/json")
    public ResponseEntity<Svedok> saveCommunity(@RequestBody OsobaDTO svedokDTO) {
        Svedok newSvedok = svedokService.createSvedok(svedokDTO);
        return new ResponseEntity<Svedok>(newSvedok, HttpStatus.CREATED);
    }

    //get all svedok

    @GetMapping(value = "all/")
    public ResponseEntity<List<Svedok>> findAll() {
        return new ResponseEntity<>(svedokService.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "{id}/")
    public ResponseEntity<Svedok> findById(@PathVariable("id") Long id) {
        Svedok svedok = svedokService.findById(id);
        return new ResponseEntity<Svedok>(svedok, HttpStatus.OK);
    }


}
