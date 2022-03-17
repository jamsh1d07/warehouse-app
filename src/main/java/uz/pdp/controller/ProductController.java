package uz.pdp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.pdp.dto.ApiResponse;
import uz.pdp.dto.ProductDTO;
import uz.pdp.entity.Product;
import uz.pdp.service.ProductService;

import java.util.Optional;

@RestController
@RequestMapping("/api/product")
public class ProductController {

    @Autowired
    ProductService productService;
    @GetMapping
    public HttpEntity<?> getAll(){
        ApiResponse all = productService.getAll();
        return ResponseEntity.ok().body(all);
    }
    @GetMapping("/{id}")
    public HttpEntity<?> getOne(@PathVariable Integer id){
        Optional<Product> optionalProduct = productService.getOne(id);
        if (optionalProduct.isPresent()){
            return ResponseEntity.ok().body(optionalProduct.get());
        }
        return ResponseEntity.status(404).body(new Product());
    }
    @PostMapping
    public HttpEntity<?> save(@RequestBody ProductDTO productDTO){
        ApiResponse response = productService.save(productDTO);
        return ResponseEntity.status(response.isSuccess()?HttpStatus.OK:HttpStatus.CONFLICT).body(response);
    }
    @PutMapping("/{id}")
    public HttpEntity<?> edit(@PathVariable Integer id,@RequestBody ProductDTO productDTO){
        ApiResponse response = productService.edit(id, productDTO);
        return ResponseEntity.status(response.isSuccess()?HttpStatus.OK:HttpStatus.CONFLICT).body(response);
    }
    @DeleteMapping("/{id}")
    public HttpEntity<?> delete(@PathVariable Integer id){
        ApiResponse response = productService.delete(id);
        return ResponseEntity.status(response.isSuccess()?HttpStatus.OK:HttpStatus.CONFLICT).body(response);
    }
}
