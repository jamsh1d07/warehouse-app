package uz.pdp.repositoy;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.pdp.entity.Client;
import uz.pdp.entity.User;

@Repository
public interface ClientRepository extends JpaRepository<Client,Integer> {

}
