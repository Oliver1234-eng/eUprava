package com.notar.controller;

import com.notar.model.dto.JwtAuthRequestDTO;
import com.notar.model.dto.UserTokenDTO;
import com.notar.security.TokenUtils;
import com.notar.service.functionality.NotarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
@CrossOrigin
@RestController
@RequestMapping("api/reigstrovaniKorisnik/")
public class RegistrovaniKorisnikKontroler {

    @Autowired
    private NotarService userService;

    @Autowired
    AuthenticationManager authenticationManager;

    @Autowired
    TokenUtils tokenUtils;

    @Autowired
    UserDetailsService userDetailsService;


    @PostMapping("login/")
    public ResponseEntity<UserTokenDTO> createAuthenticationToken(@RequestBody JwtAuthRequestDTO authenticationRequest,
                                                                  HttpServletResponse response) {

        Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(
                authenticationRequest.getUsername(), authenticationRequest.getPassword()));

        SecurityContextHolder.getContext().setAuthentication(authentication);

        UserDetails user = (UserDetails) authentication.getPrincipal();
        String jwt = tokenUtils.generateToken(user);
        int expiresIn = tokenUtils.getExpiredIn();

        return ResponseEntity.ok(new UserTokenDTO(jwt, expiresIn));
    }
}
