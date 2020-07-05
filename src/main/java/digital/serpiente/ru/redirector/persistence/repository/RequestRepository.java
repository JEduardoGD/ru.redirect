package digital.serpiente.ru.redirector.persistence.repository;

import org.springframework.data.repository.CrudRepository;

import digital.serpiente.ru.redirector.persistence.entity.RequestLog;

public interface RequestRepository extends CrudRepository<RequestLog, Long> {

}