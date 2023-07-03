package com.auth.aplikacijaauth.service;

import com.auth.aplikacijaauth.model.Korisnik;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Primary
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private KorisnikService korisnikService;

    @Override
    public UserDetails loadUserByUsername(String korisnickoIme) throws UsernameNotFoundException {

        Korisnik korisnik = korisnikService.findByUsernameNew(korisnickoIme);

        if(korisnik == null){
            throw new UsernameNotFoundException("There is no user with username " + korisnik);
        } else {
            List<GrantedAuthority> grantedAuthorities = new ArrayList<>();
            String role = "ROLE_" + korisnik.getUloge().toString();
            grantedAuthorities.add(new SimpleGrantedAuthority(role));

            return new org.springframework.security.core.userdetails.User(
                    korisnik.getKorisnickoIme().trim(),
                    korisnik.getLozinka().trim(),
                    grantedAuthorities);
        }
    }
}