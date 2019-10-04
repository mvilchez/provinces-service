package es.sinvied.provinces.repository;

import es.sinvied.provinces.model.Province;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProvincesRepository extends CrudRepository<Province, Long> {
}
