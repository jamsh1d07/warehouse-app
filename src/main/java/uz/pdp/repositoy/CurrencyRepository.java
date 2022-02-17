package uz.pdp.repositoy;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.pdp.entity.Currency;
import uz.pdp.entity.User;

@Repository
public interface CurrencyRepository extends JpaRepository<Currency,Integer> {

}
