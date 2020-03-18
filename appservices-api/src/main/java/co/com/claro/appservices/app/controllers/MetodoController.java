package co.com.claro.appservices.app.controllers;

import co.com.claro.appservices.app.commons.Utilidades;
import co.com.claro.appservices.app.exceptions.NotFoundException;
import co.com.claro.appservices.app.models.entity.Metodo;
import co.com.claro.appservices.app.services.IMetodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("metodo")
public class MetodoController {

    @Autowired
    private IMetodoService service;

    @PostMapping("/servicio/{idServicio}")
    public ResponseEntity<?> guardarMetodo(@Valid @RequestBody Metodo metodo, BindingResult result,
                                           @PathVariable Long idServicio) throws NotFoundException {
        if (result.hasErrors()) {
            return Utilidades.validar(result);
        }
        return ResponseEntity.status(HttpStatus.CREATED).body(service.guardarMetodoPorIdServicio(idServicio, metodo));
    }

    @GetMapping("/servicio/{idServicio}")
    public ResponseEntity<?> obtenerMetodosPorIdServicio(@PathVariable Long idServicio) throws NotFoundException {
        return ResponseEntity.ok(service.obtenerMetodosPorIdServicio(idServicio));
    }

    @GetMapping("/servicio/{idServicio}/pagina")
    public ResponseEntity<?> obtenerMetodosPorIdServicio(@PathVariable Long idServicio, Pageable pageable) throws NotFoundException {
        return ResponseEntity.ok(service.obtenerMetodosPorIdServicioPageable(idServicio, pageable));
    }

    @GetMapping("/{idMetodo}")
    public ResponseEntity<?> obtenerMetodoPorIdMetodo(@PathVariable Long idMetodo) throws NotFoundException {
        return ResponseEntity.ok(service.obtenerMetodoPorIdMetodo(idMetodo));
    }

    @PutMapping("/{idMetodo}")
    public ResponseEntity<?> actualizarMetodoPorId(@Valid @RequestBody Metodo metodo, BindingResult result,
                                                   @PathVariable Long idMetodo) throws NotFoundException {
        if (result.hasErrors()) {
            return Utilidades.validar(result);
        }
        return ResponseEntity.status(HttpStatus.CREATED).body(service.actualizarMetodo(idMetodo, metodo));
    }

    @DeleteMapping("/{idMetodo}")
    public ResponseEntity<?> eliminarMetodoPorId(@PathVariable Long idMetodo) throws NotFoundException {
        service.elimiarMetodoPorId(idMetodo);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

}
