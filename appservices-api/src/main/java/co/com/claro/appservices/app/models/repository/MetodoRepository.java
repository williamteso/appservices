package co.com.claro.appservices.app.models.repository;

import co.com.claro.appservices.app.models.entity.Metodo;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MetodoRepository extends CrudRepository<Metodo, Long> {

    @Query("SELECT m FROM Metodo m WHERE m.servicio.idServicio=?1")
    public List<Metodo> encontrarMetodoPorIdServicio(Long idServicio);

}
