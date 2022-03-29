package uz.pdp.repositoy;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import uz.pdp.entity.Warehouse;

//@Repository
@RepositoryRestResource(path = "warehouse")
public interface WarehouseRepository extends JpaRepository<Warehouse,Integer> {

//    boolean existsByName(String name);
}
