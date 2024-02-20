package com.pfe.InscriptionAideFinanciere.api.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class UserInscriptionDto {

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
