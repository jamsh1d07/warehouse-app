package uz.pdp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uz.pdp.dto.ApiResponse;
import uz.pdp.dto.ProductDTO;
import uz.pdp.entity.Product;
import uz.pdp.repositoy.CategoryRepository;
import uz.pdp.repositoy.MeasurementRepository;
import uz.pdp.repositoy.ProductRepository;

import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;
    @Autowired
    MeasurementRepository measurementRepository;
    @Autowired
    CategoryRepository categoryRepository;
    public ApiResponse getAll() {
        return new ApiResponse("All Product",true,productRepository.findAll());
    }

    public Optional<Product> getOne(Integer id) {
        return null;
    }

    public ApiResponse save(ProductDTO productDTO) {

        return null;
    }

    public ApiResponse edit(Integer id, ProductDTO productDTO) {
        return null;
    }

    public ApiResponse delete(Integer id) {
        return null;
    }
}
