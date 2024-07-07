package com.machinemindinnovation.basicspringboot.controller;


// Get Appliance
// POST Appliance
// Delete Appliance {applianceId}

import com.machinemindinnovation.basicspringboot.dto.ApplianceDTO;
import com.machinemindinnovation.basicspringboot.services.ApplianceService;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="/appliance")
public class ApplianceController {

    @Autowired
    final ApplianceService applianceService;


    public ApplianceController(ApplianceService applianceService) {
        this.applianceService = applianceService;
    }

    @GetMapping(path="/{id}")
    public ApplianceDTO getApplianceBySaid(@PathVariable("id") int id){
        return applianceService.getApplianceByID(id);
    }

    @PostMapping
    public ApplianceDTO createNewAppliance(@RequestBody ApplianceDTO applianceDTO){
        return applianceService.createNewAppliance(applianceDTO);
    }

    @GetMapping
    public List<ApplianceDTO> getAllAppliance(){
        return applianceService.getAllAppliance();
    }

    @PostMapping(path="{id}")
    public boolean deleteApplianceById(Integer id){
        return applianceService.deleteApplianceById(id);
    }
}
