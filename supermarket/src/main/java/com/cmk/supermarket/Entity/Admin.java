package com.cmk.supermarket.Entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Admin {

    @Id
    private Integer id;
    private String usr;
    private String pwd;
}
