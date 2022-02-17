package uz.pdp.repositoy;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.pdp.entity.OutputProduct;

@Repository
public interface OutputProductRepository extends JpaRepository<OutputProduct,Integer> {

}
