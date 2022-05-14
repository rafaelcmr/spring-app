package dev.rafaelcmr;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @GetMapping("/ping")
    public ResponseEntity<JsonEntity> ping() {
        JsonEntity entity = new JsonEntity(1, "Ola Json");
        return new ResponseEntity<>(entity,  HttpStatus.OK);
    }
}
