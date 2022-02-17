package uz.pdp.repositoy;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.pdp.entity.Supplier;

@Repository
public interface SupplierRepository extends JpaRepository<Supplier,Integer> {

}
