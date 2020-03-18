package co.com.claro.appservices.app.models.repository;

import co.com.claro.appservices.app.models.entity.Servicio;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ServicioRepository extends PagingAndSortingRepository<Servicio, Long> {

    @Query(value = "SELECT s FROM Servicio s WHERE LOWER(s.nombreServicio) LIKE %:termino%")
    public Page<Servicio> findServicioLikeNombreServicio(String termino, Pageable pageable);

}
