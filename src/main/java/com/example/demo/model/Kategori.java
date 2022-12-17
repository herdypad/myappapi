package com.example.demo.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Entity
@Data
public class Kategori implements Serializable {

    @Id
//    @JsonIgnore
    private String id;
    private String nama;
    private String type;
    private String harga;
    private String deskripsi;

}
