package uz.pdp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uz.pdp.dto.ApiResponse;
import uz.pdp.dto.WarehouseDTO;
import uz.pdp.entity.Warehouse;
import uz.pdp.repositoy.WarehouseRepository;

import java.util.List;
import java.util.Optional;

@Service
public class WarehouseService {

//    @Autowired
//    WarehouseRepository warehouseRepository;
//
//    public List<Warehouse> getAll() {
//        return warehouseRepository.findAll();
//    }
//
//    public Optional<Warehouse> getOne(Integer id) {
//        return warehouseRepository.findById(id);
//    }
//
//    public ApiResponse save(WarehouseDTO dto) {
//        if (!warehouseRepository.existsByName(dto.getName())) {
//            Warehouse warehouse = new Warehouse();
//            warehouse.setName(dto.getName());
//            warehouseRepository.save(warehouse);
//            return new ApiResponse("Saved!", true);
//        }
//        return new ApiResponse("Bunday ombor bor!", false);
//    }
//
//    public ApiResponse edit(Integer id, WarehouseDTO dto) {
//        if (warehouseRepository.findById(id).isPresent()) {
//        Optional<Warehouse> optionalWarehouse = warehouseRepository.findById(id);
//        Warehouse warehouse = optionalWarehouse.get();
//            warehouse.setName(dto.getName());
//            warehouseRepository.save(warehouse);
//            return new ApiResponse("Updated!", true);
//        }
//        return new ApiResponse("Bunday id li ombor yo'q!", false);
//    }
//
//    public ApiResponse delete(Integer id) {
//        Optional<Warehouse> optionalWarehouse = warehouseRepository.findById(id);
//        if (optionalWarehouse.isPresent()){
//        Warehouse warehouse = optionalWarehouse.get();
//        warehouse.setActive(false);
//        warehouseRepository.save(warehouse);
//        return new ApiResponse("Deleted!", true);
//        }
//        return new ApiResponse("Bunday id li ombor yo'q!",false);
//    }


}
