package uz.pdp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uz.pdp.dto.ApiResponse;
import uz.pdp.service.CurrencyService;

@RestController
@RequestMapping("/api/currency")
public class CurrencyController {
//    @Autowired
//    CurrencyService currencyService;
//
//    @GetMapping
//    public HttpEntity<?> getAll(){
//        ApiResponse response = currencyService.getAll();
//        return ResponseEntity.ok(response);
//    }
}
