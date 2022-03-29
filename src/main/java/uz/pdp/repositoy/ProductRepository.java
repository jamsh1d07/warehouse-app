package uz.pdp.repositoy;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import uz.pdp.entity.Product;

import java.util.List;

//@Repository
@RepositoryRestResource(path = "product")
public interface ProductRepository extends JpaRepository<Product,Integer> {
//    boolean existsByCode(String code);
//    boolean existsByName(String name);
//    List<Product> findByCategory_Id(Integer category_id);
}
