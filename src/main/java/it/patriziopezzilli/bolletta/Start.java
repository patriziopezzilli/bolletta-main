package it.patriziopezzilli.bolletta;

import it.patriziopezzilli.bolletta.configuration.BollettaConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(BollettaConfiguration.class)
public class Start {
}
