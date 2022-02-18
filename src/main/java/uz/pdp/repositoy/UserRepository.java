package uz.pdp.repositoy;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.pdp.entity.User;
import uz.pdp.entity.Warehouse;

import javax.swing.text.StyledEditorKit;
import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
Boolean existsByPhoneNumber(String phone);
Boolean existsByPhoneNumberAndPassword(String phone,String password);
}
