package co.com.claro.appservices.app.services;

import co.com.claro.appservices.app.exceptions.NotFoundException;
import co.com.claro.appservices.app.models.entity.Servicio;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IServicioService {

    public List<Servicio> findAllServicios();

    public Servicio obtenerServicioPorId(Long idServicio);

    public Page<Servicio> findAllServicios(Pageable pageable);

    public Servicio saveServicio(Servicio servicio);

    public Servicio updateServicio(Long idServicio, Servicio servicio)  throws NotFoundException;

    public void deleteServicio(Long idServicio);

    public Page<Servicio> findServicioLikeNombreServicio(String termino, Pageable pageable);
}
