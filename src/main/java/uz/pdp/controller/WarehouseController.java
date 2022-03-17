package uz.pdp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import uz.pdp.dto.ApiResponse;
import uz.pdp.dto.WarehouseDTO;
import uz.pdp.entity.Warehouse;
import uz.pdp.service.WarehouseService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/warehouse")
public class WarehouseController {

    @Autowired
    WarehouseService warehouseService;

    @GetMapping
    public HttpEntity<?> getAll() {
        List<Warehouse> warehouseList = warehouseService.getAll();
        return ResponseEntity.status(HttpStatus.OK).body(warehouseList);
    }

    @GetMapping("/{id}")
    public HttpEntity<?> getOne(@PathVariable Integer id) {
        Optional<Warehouse> optionalWarehouse = warehouseService.getOne(id);
        if (optionalWarehouse.isPresent()) {
            return ResponseEntity.status(HttpStatus.OK).body(optionalWarehouse.get());
        }
        return ResponseEntity.status(404).body("Bunday id li ombor yo'q");
    }

    @PostMapping
    public HttpEntity<?> save(@RequestBody WarehouseDTO warehouseDTO) {
        ApiResponse response = warehouseService.save(warehouseDTO);
        return ResponseEntity.status(response.isSuccess() ? 201 : 409).body(response);
    }

    @PutMapping("/{id}")
    public HttpEntity<?> edit(@PathVariable Integer id, @RequestBody WarehouseDTO warehouseDTO) {
        ApiResponse response = warehouseService.edit(id, warehouseDTO);
        return ResponseEntity.status(response.isSuccess() ? 201 : 409).body(response);
    }

    @DeleteMapping("/{id}")
    public HttpEntity<?> delete(@PathVariable Integer id){
        ApiResponse response = warehouseService.delete(id);
        return ResponseEntity.status(response.isSuccess()?HttpStatus.OK:HttpStatus.CONFLICT).body(response);
    }


}
