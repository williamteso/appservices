package co.com.claro.appservices.app.services.impl;

import co.com.claro.appservices.app.exceptions.NotFoundException;
import co.com.claro.appservices.app.models.entity.Servicio;
import co.com.claro.appservices.app.models.repository.ServicioRepository;
import co.com.claro.appservices.app.services.IServicioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class ServicioService implements IServicioService {

    @Autowired
    private ServicioRepository repository;

    @Override
    @Transactional(readOnly = true)
    public List<Servicio> findAllServicios() {
        return (List<Servicio>) repository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Servicio obtenerServicioPorId(Long idServicio) {
        Optional<Servicio> o = repository.findById(idServicio);
        if (!(o.isPresent())) {
            throw new NotFoundException("Servicio no encontrado");
        }
        return o.get();
    }

    @Override
    @Transactional(readOnly = true)
    public Page<Servicio> findAllServicios(Pageable pageable) {
        return repository.findAll(pageable);
    }

    @Override
    @Transactional
    public Servicio saveServicio(Servicio servicio) {
        return repository.save(servicio);
    }

    @Override
    @Transactional
    public Servicio updateServicio(Long idServicio, Servicio servicio) throws NotFoundException {
        Optional<Servicio> o = repository.findById(idServicio);
        if (!(o.isPresent())) {
            throw new NotFoundException("Servicio no encontrado");
        }

        Servicio servicioDb = o.get();
        servicioDb.setDescripcion(servicio.getDescripcion());
        servicioDb.setNombreServicio(servicio.getNombreServicio());
        servicioDb.setUrlDes(servicio.getUrlDes());
        servicioDb.setUrlProd(servicio.getUrlProd());
        servicioDb.setUrlQa(servicio.getUrlQa());

        return repository.save(servicioDb);
    }

    @Override
    @Transactional
    public void deleteServicio(Long idServicio) {
        Optional<Servicio> o = repository.findById(idServicio);
        if (!(o.isPresent())) {
            throw new NotFoundException("Servicio no encontrado");
        }

        repository.deleteById(idServicio);
    }

    @Override
    @Transactional(readOnly = true)
    public Page<Servicio> findServicioLikeNombreServicio(String termino, Pageable pageable) {
        return repository.findServicioLikeNombreServicio(termino, pageable);
    }
}
