package uz.pdp.repositoy;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.pdp.entity.User;
import uz.pdp.entity.Warehouse;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {

}
