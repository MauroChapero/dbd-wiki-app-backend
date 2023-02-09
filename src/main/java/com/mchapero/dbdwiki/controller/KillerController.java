/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mchapero.dbdwiki.controller;

import com.mchapero.dbdwiki.exceptions.ResourceNotFoundException;
import com.mchapero.dbdwiki.model.Killer;
import com.mchapero.dbdwiki.service.KillerService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author chape
 */
@RestController
@RequestMapping("/api/characters/killers")
public class KillerController {
    
    @Autowired
    private KillerService killerService;
    
    @GetMapping("/list")
    public List<Killer> getAllKillers() {
        return killerService.getAllKillers();
    }
    
    @PostMapping("/save")
    public Killer saveKiller(@RequestBody Killer killer) {
        return killerService.saveKiller(killer);
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Killer> getKillerById(@PathVariable int id) throws ResourceNotFoundException {
        return ResponseEntity.ok(killerService.getKillerById(id));
    }
    
    @PutMapping("/update/{id}")
    public ResponseEntity<Killer> updateKiller(@PathVariable int id, @RequestBody Killer updatedData) throws ResourceNotFoundException {
       return ResponseEntity.ok(killerService.updateKiller(id, updatedData));
    }
    
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<HttpStatus> deleteKiller(@PathVariable int id) throws ResourceNotFoundException {
        killerService.deleteKillerById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
