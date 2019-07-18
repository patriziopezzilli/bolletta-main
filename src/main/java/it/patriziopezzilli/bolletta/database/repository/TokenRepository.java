package it.patriziopezzilli.bolletta.database.repository;

import it.patriziopezzilli.bolletta.database.entity.Token;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author Patrizio Pezzilli
 * <p>
 * Service: bolletta-main
 * Date:    16/07/2019
 */
public interface TokenRepository extends MongoRepository<Token, String> {

    Token findByValue(String tokenValue);
}
