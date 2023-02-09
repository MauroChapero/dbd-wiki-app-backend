/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mchapero.dbdwiki.service;

import com.mchapero.dbdwiki.model.Killer;
import java.util.List;

/**
 *
 * @author chape
 */
public interface KillerService {
    List<Killer> getAllKillers();
    Killer saveKiller(Killer killer);
    Killer getKillerById(int id);
    Killer updateKiller(int id, Killer updatedKiller);
    void deleteKillerById(int id);
}
