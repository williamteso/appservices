package co.com.claro.appservices.app.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("recurso")
public class AppController {

    @GetMapping
    public ResponseEntity<?> saludo() {
        Map<String, String> respuesta = new HashMap<>();
        respuesta.put("respuesta", "Hola mundo!");
        return ResponseEntity.ok(respuesta);
    }


}
