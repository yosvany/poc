package es.keytree.klockin.app1.api;

import io.swagger.annotations.Api;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@Api(value="Un controller de ejemplo para las entradas y salidas∫")
@RequestMapping("/api")
public class App1Controller {

    private final static Logger logger = LoggerFactory.getLogger(App1Controller.class);

    @PostMapping("/entrar/{id}")
    public ResponseEntity<String> checkin(@PathVariable Integer id) {
        LocalDateTime dateTime = LocalDateTime.now();
        return new ResponseEntity<>("El usuario " + id +" ha entrado a las " + dateTime, HttpStatus.ACCEPTED);
    }

    @PostMapping("/salir/{id}")
    public ResponseEntity<String> checkout(@PathVariable Integer id) {

        LocalDateTime dateTime = LocalDateTime.now();
        return new ResponseEntity<>("El usuario " + id +" ha salido a las " + dateTime, HttpStatus.ACCEPTED);
    }

}

