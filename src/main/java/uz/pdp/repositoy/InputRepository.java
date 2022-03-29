package uz.pdp.repositoy;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import uz.pdp.entity.Input;

//@Repository
@RepositoryRestResource(path = "input")
public interface InputRepository extends JpaRepository<Input,Integer> {

}
