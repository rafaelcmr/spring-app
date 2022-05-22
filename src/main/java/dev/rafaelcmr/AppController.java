package dev.rafaelcmr;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @GetMapping()
    @ResponseStatus(HttpStatus.OK)
    public String defaultMethod() {
        return "ok";
    }

    @GetMapping("/ping")
    public ResponseEntity<JsonEntity> ping() {
        JsonEntity entity = new JsonEntity(1, "Ping");
        return new ResponseEntity<>(entity,  HttpStatus.OK);
    }

    @GetMapping("/pong")
    public ResponseEntity<JsonEntity> pong() {
        return new ResponseEntity<>(new JsonEntity(2, "Pong"), HttpStatus.OK);
    }
}
