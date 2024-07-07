package com.machinemindinnovation.basicspringboot.services;

import com.machinemindinnovation.basicspringboot.dto.ApplianceDTO;
import com.machinemindinnovation.basicspringboot.entity.ApplianceEntity;
import com.machinemindinnovation.basicspringboot.repositories.ApplianceRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ApplianceService {


    final ApplianceRepository applianceRepository;
    final ModelMapper modelMapper;

    public ApplianceService(ApplianceRepository applianceRepository, ModelMapper modelMapper) {
        this.applianceRepository = applianceRepository;
        this.modelMapper = modelMapper;
    }

    public ApplianceDTO getApplianceByID(int id){
        ApplianceEntity applianceEntity = applianceRepository.getReferenceById(id);
        return modelMapper.map(applianceEntity, ApplianceDTO.class);
    }

    public ApplianceDTO createNewAppliance(ApplianceDTO applianceDTO) {

        ApplianceEntity applianceEntity = modelMapper.map(applianceDTO, ApplianceEntity.class);
        return modelMapper.map(applianceRepository.save(applianceEntity), ApplianceDTO.class);
    }

    public List<ApplianceDTO> getAllAppliance() {

        return applianceRepository.findAll()
                .stream()
                .map(applianceEntity ->
                    modelMapper.map(applianceEntity, ApplianceDTO.class)
                )
                .collect(Collectors.toList());
    }

    public boolean deleteApplianceById(Integer id) {
        boolean isPersist = applianceRepository.existsById(id);

        if(isPersist) {
            applianceRepository.deleteById(id);
            return true;
        }
        else
            return false;
    }
}
