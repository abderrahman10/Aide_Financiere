package com.pfe.InscriptionAideFinanciere.infrastructure.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class UserInscriptionEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    String firstName;
    String  lastName;
    String  email;
    Long phone;
    String  token;

    String  civility;
    String status;
    String dcrName;
    String dcrDepartement;
}
