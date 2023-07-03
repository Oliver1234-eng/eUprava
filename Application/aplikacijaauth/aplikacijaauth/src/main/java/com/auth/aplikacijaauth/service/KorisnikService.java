package com.auth.aplikacijaauth.service;

import com.auth.aplikacijaauth.dto.KorisnikDTO;
import com.auth.aplikacijaauth.model.Korisnik;
import com.auth.aplikacijaauth.model.Uloge;
import com.auth.aplikacijaauth.repository.KorisnikRepository;
import com.auth.aplikacijaauth.security.SecurityProperties;
import com.auth.aplikacijaauth.security.TokenUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class KorisnikService {

    @Autowired
    private KorisnikRepository korisnikRepository;

    @Autowired
    private SecurityProperties securityProperties;

    private final TokenUtils tokenUtils;

    @Autowired
    public KorisnikService(KorisnikRepository korisnikRepository, TokenUtils tokenUtils) {
        this.korisnikRepository = korisnikRepository;
        this.tokenUtils = tokenUtils;
    }

    public Korisnik findOne(Integer id) {
        return korisnikRepository.findById(id).orElseGet(null);
    }

    public Korisnik findOneByKorisnickoIme(String korisnickoIme) {
        return korisnikRepository.findOneByKorisnickoIme(korisnickoIme);
    }

    public List<Korisnik> findAll() {
        return korisnikRepository.findAll();
    }

    public Page<Korisnik> findAll(Pageable page) {
        return korisnikRepository.findAll(page);
    }

    public Korisnik save(Korisnik korisnik) {
        return korisnikRepository.save(korisnik);
    }

    public void remove(Integer id) {
        korisnikRepository.deleteById(id);
    }

    public Korisnik findByKorisnickoIme(String korisnickoIme) {
        return korisnikRepository.findOneByKorisnickoIme(korisnickoIme);
    }

    public List<Korisnik> findByKorisnickoImeAndLozinka(String korisnickoIme, String lozinka) {
        return korisnikRepository.findByKorisnickoImeAndLozinkaAllIgnoringCase(korisnickoIme, lozinka);
    }

    public Korisnik findByUsernameNew(String korisnickoIme) {
        Optional<Korisnik> korisnik = korisnikRepository.findFirstByKorisnickoIme(korisnickoIme);
        if (!korisnik.isEmpty()) {
            return korisnik.get();
        }
        return null;
    }

    public Korisnik createUser(KorisnikDTO korisnikDTO) {

        Optional<Korisnik> korisnik = korisnikRepository.findFirstByKorisnickoIme(korisnikDTO.getKorisnickoIme());

        if(korisnik.isPresent()){
            return null;
        }

        Korisnik newUser = new Korisnik();
        newUser.setKorisnickoIme(korisnikDTO.getKorisnickoIme());
        newUser.setLozinka(securityProperties.createPasswordEncoder().encode(korisnikDTO.getLozinka()));
        newUser.setJmbg(korisnikDTO.getJmbg());
        newUser.setIme(korisnikDTO.getIme());
        newUser.setPrezime(korisnikDTO.getPrezime());
        newUser.setPrezime(korisnikDTO.getPol().toString());
        newUser.setDatumRodjenja(korisnikDTO.getDatumRodjenja());
        newUser.setMestoRodjenja(korisnikDTO.getMestoRodjenja());
        newUser.setImeRoditelja(korisnikDTO.getImeRoditelja());
        newUser.setPrezimeRoditelja(korisnikDTO.getPrezimeRoditelja());
        newUser.setAdresa(korisnikDTO.getAdresa());
        newUser.setZanimanjeRoditelja(korisnikDTO.getZanimanjeRoditelja());
        newUser.setUloge(Uloge.GRADJANIN);
        newUser = korisnikRepository.save(newUser);

        return newUser;
    }
}