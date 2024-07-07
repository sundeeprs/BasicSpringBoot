package com.machinemindinnovation.basicspringboot.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ApplianceDTO {

    private Integer id;
    private String name;
    private String brand;
    private String type;
    private String firmware;
    private boolean Ble;
}
