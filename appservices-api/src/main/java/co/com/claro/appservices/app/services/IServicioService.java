package co.com.claro.appservices.app.services;

import co.com.claro.appservices.app.exceptions.NotFoundException;
import co.com.claro.appservices.app.models.entity.Servicio;

import java.util.List;

public interface IServicioService {

    public List<Servicio> findAllServicios();

    public Servicio saveServicio(Servicio servicio);

    public Servicio updateServicio(Long idServicio, Servicio servicio)  throws NotFoundException;

    public void deleteServicio(Long idServicio);
}
