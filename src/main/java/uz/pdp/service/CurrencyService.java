package uz.pdp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uz.pdp.dto.ApiResponse;
import uz.pdp.entity.Currency;
import uz.pdp.repositoy.CurrencyRepository;

import java.util.List;

@Service
public class CurrencyService {
    @Autowired
    CurrencyRepository currencyRepository;

    public ApiResponse getAll() {
        List<Currency> all = currencyRepository.findAll();
        return new ApiResponse("All Currency",true,all);
    }
}
