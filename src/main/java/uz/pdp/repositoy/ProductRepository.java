package uz.pdp.repositoy;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.pdp.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer> {

}
