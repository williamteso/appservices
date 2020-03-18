package co.com.claro.appservices.app.models.repository;

import co.com.claro.appservices.app.models.entity.Metodo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface MetodoRepository extends PagingAndSortingRepository<Metodo, Long> {

    @Query("SELECT m FROM Metodo m WHERE m.servicio.idServicio=?1")
    public List<Metodo> encontrarMetodoPorIdServicio(Long idServicio);

    @Query("SELECT m FROM Metodo m WHERE m.servicio.idServicio=?1")
    public Page<Metodo> encontrarMetodoPorIdServicioPageable(Long idServicio, Pageable pageable);

}
