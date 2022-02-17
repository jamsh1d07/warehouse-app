package uz.pdp.repositoy;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.pdp.entity.Measurement;

@Repository
public interface MeasurementRepository extends JpaRepository<Measurement,Integer> {

}
