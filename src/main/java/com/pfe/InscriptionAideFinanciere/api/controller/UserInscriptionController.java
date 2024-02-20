package com.pfe.InscriptionAideFinanciere.api.controller;

import com.pfe.InscriptionAideFinanciere.api.dto.UserInscriptionDto;
import com.pfe.InscriptionAideFinanciere.core.api.InscriptionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/inscription")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class UserInscriptionController {
  private  final InscriptionService inscriptionService;

    @PostMapping(
            value = "/inscription",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)

    public ResponseEntity<Object> UserInscription(UserInscriptionDto userInscriptionDto) {


    return  null;
    }
}