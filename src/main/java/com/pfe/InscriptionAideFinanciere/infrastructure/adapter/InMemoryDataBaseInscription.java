package com.pfe.InscriptionAideFinanciere.infrastructure.adapter;

import com.pfe.InscriptionAideFinanciere.core.spi.InscriptionRepository;
import com.pfe.InscriptionAideFinanciere.infrastructure.entity.UserInscriptionEntity;
import com.pfe.InscriptionAideFinanciere.infrastructure.repository.InscriptionUserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class InMemoryDataBaseInscription implements InscriptionRepository {
    private  final InscriptionUserRepository inscriptionUserRepository;

    @Override
    public UserInscriptionEntity saveInscription(UserInscriptionEntity inscription) {
        return inscriptionUserRepository.save(inscription);
    }
}
