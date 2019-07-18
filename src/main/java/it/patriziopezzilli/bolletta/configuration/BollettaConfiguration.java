package it.patriziopezzilli.bolletta.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author Patrizio Pezzilli
 * <p>
 * Service: bolletta-main
 * Date:    16/07/2019
 */
@Configuration
@ComponentScan({
        "it.patriziopezzilli.bolletta.audit",
        "it.patriziopezzilli.bolletta.controller",
        "it.patriziopezzilli.bolletta.database",
        "it.patriziopezzilli.bolletta.services"
})
public class BollettaConfiguration {
}
