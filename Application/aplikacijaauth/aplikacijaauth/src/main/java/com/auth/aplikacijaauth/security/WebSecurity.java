package com.auth.aplikacijaauth.security;

import com.auth.aplikacijaauth.model.Korisnik;
import com.auth.aplikacijaauth.service.KorisnikService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

@Component
public class WebSecurity {

    @Autowired
    private KorisnikService korisnikService;

    public boolean checkClubId(Authentication authentication, HttpServletRequest request, int id) {
        UserDetails userDetails = (UserDetails) authentication.getPrincipal();
        Korisnik korisnik = korisnikService.findByUsernameNew(userDetails.getUsername());
        if(id == korisnik.getId()) {
            return true;
        }
        return false;
    }
}