package it.patriziopezzilli.bolletta.database.entity;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

/**
 * @author Patrizio Pezzilli
 * <p>
 * Service: bolletta-main
 * Date:    16/07/2019
 */
@Document(collection = "token")
public class Token {

    @Id
    public ObjectId _id;

    private String value;
    private List<Device> devices;

    public Token() {

    }

    // ObjectId needs to be converted to string
    public String get_id() {
        return _id.toHexString();
    }

    public void set_id(ObjectId _id) {
        this._id = _id;
    }

    public List<Device> getDevices() {
        return devices;
    }

    public void setDevices(List<Device> devices) {
        this.devices = devices;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
