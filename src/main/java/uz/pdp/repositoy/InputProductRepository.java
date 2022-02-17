package uz.pdp.repositoy;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.pdp.entity.InputProduct;
import uz.pdp.entity.User;

@Repository
public interface InputProductRepository extends JpaRepository<InputProduct,Integer> {

}
