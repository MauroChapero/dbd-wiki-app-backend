/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mchapero.dbdwiki.service;

import com.mchapero.dbdwiki.exceptions.ResourceNotFoundException;
import com.mchapero.dbdwiki.model.Killer;
import com.mchapero.dbdwiki.repository.KillerRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author chape
 */
@Service
public class KillerServiceImpl implements KillerService{
    
    @Autowired
    private KillerRepository killerRepository;

    
    // handle get list of all killers on DB
    @Override
    public List<Killer> getAllKillers() {
        return killerRepository.findAll();
    }
    
    // handle save killer method
    @Override
    public Killer saveKiller(Killer killer) {
        return killerRepository.save(killer);
    }

    @Override
    public Killer getKillerById(int id) {
        return killerRepository
                .findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Killer not exist with id " + id));
    }

    @Override
    public Killer updateKiller(int id, Killer updatedData) {
        Killer killerOnDB = killerRepository
                .findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Killer not exist with id " + id));
        
        killerOnDB.setName(updatedData.getName());
        killerOnDB.setAlias(updatedData.getAlias());
        killerOnDB.setGender(updatedData.getGender());
        killerOnDB.setNationality(updatedData.getNationality());
        killerOnDB.setRealm(updatedData.getRealm());
        killerOnDB.setPower(updatedData.getPower());
        killerOnDB.setTerrorRadiusOnMeters(updatedData.getTerrorRadiusOnMeters());
        
        return killerRepository.save(killerOnDB);
    }
    
    @Override
    public void deleteKillerById(int id) {
        Killer killerOnDB = killerRepository
                .findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Killer not exist with id " + id));
        
        killerRepository.delete(killerOnDB);
    }
}
