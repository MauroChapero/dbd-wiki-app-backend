/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mchapero.dbdwiki.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

/**
 *
 * @author chape
 */
@Entity
@Table(name = "killers")
@Data
public class Killer {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column
    private String name;
    @Column
    private String alias;
    @Column
    private String gender;
    @Column
    private String nationality;
    @Column
    private String realm;
    @Column
    private String power;
    @Column(name = "terror_radius")
    private Double terrorRadiusOnMeters;
}
