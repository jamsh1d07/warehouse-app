package uz.pdp.repositoy;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import uz.pdp.entity.Measurement;

//@Repository
@RepositoryRestResource(path = "measurement")
public interface MeasurementRepository extends JpaRepository<Measurement,Integer> {

}
