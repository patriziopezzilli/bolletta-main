package it.patriziopezzilli.bolletta.database.entity;

import it.patriziopezzilli.bolletta.domain.Transazione;

import java.io.Serializable;
import java.util.List;

/**
 * @author Patrizio Pezzilli
 * <p>
 * Service: bolletta-main
 * Date:    16/07/2019
 */
public class Device implements Serializable {

    private String identifier;
    private List<Transazione> transazioni;

    public Device() {

    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public List<Transazione> getTransazioni() {
        return transazioni;
    }

    public void setTransazioni(List<Transazione> transazioni) {
        this.transazioni = transazioni;
    }
}
