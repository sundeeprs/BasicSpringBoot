package com.machinemindinnovation.basicspringboot.entity;


import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name="appliance")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ApplianceEntity {


    @Id
    @Column(name="id")
    private Integer id;
    @Column(name="name")
    private String name;
    @Column(name="brand")
    private String brand;
    @Column(name="type")
    private String type;
    @Column(name="firmware")
    private String firmware;
    @JsonProperty("isBle")
    @Column(name="ble")
    private boolean ble;
}
