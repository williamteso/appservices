package co.com.claro.appservices.app.services.impl;

import co.com.claro.appservices.app.exceptions.NotFoundException;
import co.com.claro.appservices.app.models.entity.Metodo;
import co.com.claro.appservices.app.models.entity.Servicio;
import co.com.claro.appservices.app.models.repository.MetodoRepository;
import co.com.claro.appservices.app.models.repository.ServicioRepository;
import co.com.claro.appservices.app.services.IMetodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class MetodoService implements IMetodoService {

    @Autowired
    private MetodoRepository metodoRepository;

    @Autowired
    private ServicioRepository servicioRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Metodo> obtenerMetodosPorIdServicio(Long idServicio) throws NotFoundException {
        List<Metodo> lMetodo = new ArrayList<>();
        lMetodo = metodoRepository.encontrarMetodoPorIdServicio(idServicio);

        if (lMetodo.isEmpty()) {
            throw new NotFoundException("No se encontraron métodos con el idServicio".concat(idServicio.toString()));
        }
        return lMetodo;

    }

    @Override
    @Transactional
    public Metodo guardarMetodoPorIdServicio(Long idServicio, Metodo metodo) throws NotFoundException {
        Optional<Servicio> o = servicioRepository.findById(idServicio);

        if (!(o.isPresent())) {
            throw new NotFoundException("El idServicio ".concat(idServicio.toString()).concat(" No existe!!!"));
        }
        metodo.setServicio(o.get());

        return metodoRepository.save(metodo);
    }

    @Override
    @Transactional
    public Metodo actualizarMetodo(Long idMetodo, Metodo metodo) throws NotFoundException {
        Optional<Metodo> o = metodoRepository.findById(idMetodo);
        if (!(o.isPresent())) {
            throw new NotFoundException("No se encontraró método con el id ".concat(idMetodo.toString()));
        }

        Metodo metodoBd = o.get();
        metodoBd.setDescripcion(metodo.getDescripcion());
        metodoBd.setNombreMetodo(metodo.getNombreMetodo());

        return metodoRepository.save(metodoBd);
    }

    @Override
    @Transactional(readOnly = true)
    public Metodo obtenerMetodoPorIdMetodo(Long idMetodo) throws NotFoundException {
        Optional<Metodo> o = metodoRepository.findById(idMetodo);
        if (!(o.isPresent())) {
            throw new NotFoundException("El método con id ".concat(idMetodo.toString()).concat(" No existe!!!"));
        }
        return o.get();
    }

    @Override
    @Transactional
    public void elimiarMetodoPorId(Long idMetodo) throws NotFoundException {
        Optional<Metodo> o = metodoRepository.findById(idMetodo);
        if (!(o.isPresent())) {
            throw new NotFoundException("El método con id ".concat(idMetodo.toString()).concat(" No existe!!!"));
        }
        metodoRepository.deleteById(o.get().getIdMetodo());
    }
}
