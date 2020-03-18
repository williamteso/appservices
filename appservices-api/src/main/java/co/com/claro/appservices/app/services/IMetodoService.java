package co.com.claro.appservices.app.services;

import co.com.claro.appservices.app.exceptions.NotFoundException;
import co.com.claro.appservices.app.models.entity.Metodo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IMetodoService {

    public List<Metodo> obtenerMetodosPorIdServicio(Long idServicio) throws NotFoundException;

    public Page<Metodo> obtenerMetodosPorIdServicioPageable(Long idServicio, Pageable pageable) throws NotFoundException;

    public Metodo guardarMetodoPorIdServicio(Long idServicio, Metodo metodo) throws NotFoundException;

    public Metodo actualizarMetodo(Long idMetodo, Metodo metodo) throws NotFoundException;

    public Metodo obtenerMetodoPorIdMetodo(Long idMetodo) throws NotFoundException;

    public void elimiarMetodoPorId(Long idMetodo) throws NotFoundException;

}
