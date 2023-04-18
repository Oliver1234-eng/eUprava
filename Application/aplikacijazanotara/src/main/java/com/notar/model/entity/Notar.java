package com.notar.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@AllArgsConstructor
@Entity
@Table(name = "notari")
public class Notar extends RegistrovanKorisnik{
}
