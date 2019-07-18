package it.patriziopezzilli.bolletta.controller;

import it.patriziopezzilli.bolletta.database.entity.Device;
import it.patriziopezzilli.bolletta.database.entity.Token;
import it.patriziopezzilli.bolletta.database.repository.TokenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author Patrizio Pezzilli
 * <p>
 * Service: bolletta-main
 * Date:    16/07/2019
 */
@RestController
public class TokenController {

    @Autowired
    private TokenRepository tokenRepository;

    @RequestMapping(value = "/bolletta/token/generate", method = RequestMethod.POST)
    public String generateToken(@RequestParam String deviceToken) {
        Random rnd = new Random();

        // generate random
        int n = 10000 + rnd.nextInt(90000);

        // create entry on db
        Token token = new Token();
        token.setValue(String.valueOf(n));
        token.setDevices(new ArrayList<>());

        // create first device of this token family
        Device device = new Device();
        device.setIdentifier(deviceToken);
        device.setTransazioni(new ArrayList<>());

        //merge and save
        token.getDevices().add(device);
        Token result = tokenRepository.save(token);

        return result.getValue();
    }

    @RequestMapping(value = "/bolletta/token/{token}/access", method = RequestMethod.POST)
    public String accessToFamily(@PathVariable String token, @RequestParam String deviceToken) {
        Token familyToken = tokenRepository.findByValue(token);

        if (null != familyToken) {
            if (null != familyToken.getDevices()) {
                // create device of this token given
                Device device = new Device();
                device.setIdentifier(deviceToken);
                device.setTransazioni(new ArrayList<>());

                familyToken.getDevices().add(device);
                tokenRepository.save(familyToken);
            }

            return "Benvenuto in famiglia!";
        } else {
            return "Token non esistente!";
        }
    }
}
