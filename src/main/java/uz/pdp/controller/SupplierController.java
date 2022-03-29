package uz.pdp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.pdp.dto.ApiResponse;
import uz.pdp.dto.SupplierDTO;
import uz.pdp.entity.Supplier;
import uz.pdp.service.SupplierService;

import java.util.Optional;

@RestController
@RequestMapping("/api/supplier")
public class SupplierController {
//
//    @Autowired
//    SupplierService supplierService;
//
//    @GetMapping
//    public HttpEntity<?> getAll(){
//        ApiResponse response = supplierService.getAll();
//        return ResponseEntity.ok().body(response);
//    }
//
//    @GetMapping("/{id}")
//    public HttpEntity<?> getOne(@PathVariable Integer id){
//        Optional<Supplier> optionalSupplier = supplierService.getOne(id);
//        if (optionalSupplier.isPresent()){
//            return ResponseEntity.ok().body(optionalSupplier.get());
//        }
//        return ResponseEntity.status(404).body("Bunday Supplier yo'q!");
//    }
//
//    @PostMapping
//    public HttpEntity<?> save(@RequestBody SupplierDTO supplierDTO){
//        ApiResponse response = supplierService.save(supplierDTO);
//        return ResponseEntity.status(response.isSuccess()? HttpStatus.OK:HttpStatus.CONFLICT).body(response);
//    }
//
//    @PutMapping("/{id}")
//    public HttpEntity<?> edit(@PathVariable Integer id,@RequestBody SupplierDTO supplierDTO){
//        ApiResponse response = supplierService.edit(id, supplierDTO);
//        return ResponseEntity.status(response.isSuccess()?HttpStatus.OK:HttpStatus.CONFLICT).body(response);
//    }
//
//    @DeleteMapping("/{id}")
//    public HttpEntity<?> delete(@PathVariable Integer id){
//        ApiResponse response = supplierService.delete(id);
//        return ResponseEntity.status(response.isSuccess()?HttpStatus.OK:HttpStatus.CONFLICT).body(response);
//    }
}
