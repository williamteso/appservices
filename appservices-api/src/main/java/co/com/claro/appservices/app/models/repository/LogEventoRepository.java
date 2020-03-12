package co.com.claro.appservices.app.models.repository;

import co.com.claro.appservices.app.models.entity.auth.LogEvento;
import org.springframework.data.repository.CrudRepository;

public interface LogEventoRepository extends CrudRepository<LogEvento, Long> {
}
