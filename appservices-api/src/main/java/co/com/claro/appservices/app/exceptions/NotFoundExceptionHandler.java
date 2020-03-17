package co.com.claro.appservices.app.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class NotFoundExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<?> exceptionHandler(NotFoundException ex) {
        Map<String, String> respuesta = new HashMap<>();
        respuesta.put("mensaje", ex.getMessage());
        respuesta.put("fechaTransaccion", new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(new Date()));
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(respuesta);

    }

}
