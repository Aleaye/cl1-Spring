package pe.edu.i202210494.cl1_jpa_data_gutierrez_alex.repository;

import pe.edu.i202210494.cl1_jpa_data_gutierrez_alex.entity.Country;
import org.springframework.data.repository.CrudRepository;

public interface CountryRepository extends CrudRepository<Country, String> {
}
