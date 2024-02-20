package com.pfe.InscriptionAideFinanciere.core.spi;

import com.pfe.InscriptionAideFinanciere.infrastructure.entity.UserInscriptionEntity;

public interface InscriptionRepository {


    public UserInscriptionEntity saveInscription(UserInscriptionEntity inscription);

}
