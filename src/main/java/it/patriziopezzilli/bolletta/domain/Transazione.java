package it.patriziopezzilli.bolletta.domain;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author Patrizio Pezzilli
 * <p>
 * Service: bolletta-main
 * Date:    16/07/2019
 */
public class Transazione implements Serializable {

    private String tipo;
    private String fornitore;
    private String data;
    private String importo;
    private String note;

    // TODO: capire come gestire
    private String file;

    private String status;

    public Transazione() {

    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getFornitore() {
        return fornitore;
    }

    public void setFornitore(String fornitore) {
        this.fornitore = fornitore;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getImporto() {
        return importo;
    }

    public void setImporto(String importo) {
        this.importo = importo;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Transazione)) return false;
        Transazione that = (Transazione) o;
        return Objects.equals(tipo, that.tipo) &&
                Objects.equals(fornitore, that.fornitore) &&
                Objects.equals(data, that.data) &&
                Objects.equals(importo, that.importo) &&
                Objects.equals(note, that.note) &&
                Objects.equals(file, that.file) &&
                Objects.equals(status, that.status);
    }

    @Override
    public int hashCode() {

        return Objects.hash(tipo, fornitore, data, importo, note, file, status);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Transazione{");
        sb.append("tipo='").append(tipo).append('\'');
        sb.append(", fornitore='").append(fornitore).append('\'');
        sb.append(", data='").append(data).append('\'');
        sb.append(", importo='").append(importo).append('\'');
        sb.append(", note='").append(note).append('\'');
        sb.append(", file='").append(file).append('\'');
        sb.append(", status='").append(status).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
