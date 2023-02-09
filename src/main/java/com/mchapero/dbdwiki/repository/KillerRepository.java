/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mchapero.dbdwiki.repository;

import com.mchapero.dbdwiki.model.Killer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author chape
 */
@Repository
public interface KillerRepository extends JpaRepository<Killer, Integer>{
    
}
