package co.com.claro.appservices.app.controllers;

import co.com.claro.appservices.app.commons.Utilidades;
import co.com.claro.appservices.app.exceptions.NotFoundException;
import co.com.claro.appservices.app.models.entity.Servicio;
import co.com.claro.appservices.app.services.IServicioService;
import co.com.claro.appservices.app.services.impl.ServicioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("servicio")
public class ServicioController {

    @Autowired
    private IServicioService service;

    @PostMapping
    public ResponseEntity<?> guardarServicio(@Valid @RequestBody Servicio servicio, BindingResult result) {
        if (result.hasErrors()) {
            return Utilidades.validar(result);
        }
        return ResponseEntity.status(HttpStatus.CREATED).body(service.saveServicio(servicio));
    }

    @GetMapping
    public ResponseEntity<?> obtenerServicios() {
        return ResponseEntity.ok(service.findAllServicios());
    }

    @GetMapping("/{idServicio}")
    public ResponseEntity<?> obtenerServicioPorId(@PathVariable Long idServicio) {
        return ResponseEntity.ok(service.obtenerServicioPorId(idServicio));
    }

    @GetMapping("/termino/{termino}")
    public ResponseEntity<?> obtenerServicioLikeNombreServicio(@PathVariable String termino, Pageable pageable) {
        return ResponseEntity.ok(service.findServicioLikeNombreServicio(termino, pageable));
    }

    @GetMapping("/pagina")
    public ResponseEntity<?> obtenerServicios(Pageable pageable) {
        return ResponseEntity.ok(service.findAllServicios(pageable));
    }

    @PutMapping("/{idServicio}")
    public ResponseEntity<?> actualizarServicio(@Valid @RequestBody Servicio servicio, BindingResult result,
                                             @PathVariable Long idServicio) throws NotFoundException {
        if (result.hasErrors()) {
            return Utilidades.validar(result);
        }
        return ResponseEntity.status(HttpStatus.CREATED).body(service.updateServicio(idServicio, servicio));
    }

    @DeleteMapping("/{idServicio}")
    public ResponseEntity<?> eliminarServicio(@PathVariable Long idServicio) throws NotFoundException {
        service.deleteServicio(idServicio);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

}
