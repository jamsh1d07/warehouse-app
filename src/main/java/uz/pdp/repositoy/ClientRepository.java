package uz.pdp.repositoy;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import uz.pdp.entity.Client;
import uz.pdp.entity.User;

//@Repository
@RepositoryRestResource(path = "client")
public interface ClientRepository extends JpaRepository<Client,Integer> {

}
