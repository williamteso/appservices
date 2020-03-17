package co.com.claro.appservices.app.commons;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Utilidades {

    public static ResponseEntity<?> validar(BindingResult result) {
        Map<String, Object> errores = new HashMap<>();
        result.getFieldErrors()
                .forEach(err -> {
                    errores.put(err.getField(), "El campo " + err.getField() + " " + err.getDefaultMessage());
                });
        errores.put("fechaTransaccion", new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(new Date()));
        return ResponseEntity.badRequest().body(errores);
    }

}
