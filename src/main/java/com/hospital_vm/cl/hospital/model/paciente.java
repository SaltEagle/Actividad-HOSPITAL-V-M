package com.hospital_vm.cl.hospital.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "paciente")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class paciente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(unique = true, length = 13, nullable = false  )
    private String run;

    @Column(nullable = false  )
    private String nombre;

    @Column(nullable = false  )
    private String apellidos;

    @Column(nullable = true )
    private Date fechaNacimiento;

    @Column(nullable = false  )
    private String correo;



}
