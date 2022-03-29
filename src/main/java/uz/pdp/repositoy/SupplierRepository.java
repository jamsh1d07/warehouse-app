package uz.pdp.repositoy;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import uz.pdp.entity.Supplier;

//@Repository
@RepositoryRestResource(path = "supplier")
public interface SupplierRepository extends JpaRepository<Supplier, Integer> {
//    boolean existsByPhoneNumber(String phone);
}
