package digital.serpiente.ru.redirector.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import digital.serpiente.ru.redirector.persistence.entity.RequestRedirect;

public interface RequestRedirectRepository extends JpaRepository<RequestRedirect, Long> {

	@Query("SELECT RR.newUrl FROM RequestRedirect RR WHERE RR.callsign = :callsign")
	public String getActiveRedirectFor(@Param("callsign") String callsign);
}