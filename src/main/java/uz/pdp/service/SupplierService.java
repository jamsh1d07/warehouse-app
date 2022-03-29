package uz.pdp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uz.pdp.dto.ApiResponse;
import uz.pdp.dto.SupplierDTO;
import uz.pdp.entity.Supplier;
import uz.pdp.repositoy.SupplierRepository;

import java.util.Optional;

@Service
public class SupplierService {
//
//    @Autowired
//    SupplierRepository supplierRepository;
//    public ApiResponse getAll() {
//        return new ApiResponse("All Supplier",true,supplierRepository.findAll());
//    }
//
//    public Optional<Supplier> getOne(Integer id) {
//        return supplierRepository.findById(id);
//    }
//
//    public ApiResponse save(SupplierDTO supplierDTO) {
//        if (!supplierRepository.existsByPhoneNumber(supplierDTO.getPhoneNumber())) {
//            Supplier supplier=new Supplier();
//            supplier.setFullName(supplierDTO.getFullName());
//            supplier.setPhoneNumber(supplierDTO.getPhoneNumber());
//            supplierRepository.save(supplier);
//            return new ApiResponse("Added!",true);
//        }
//        return new ApiResponse("Bunday tel raqamli supplier bor!",false);
//    }
//
//    public ApiResponse edit(Integer id, SupplierDTO supplierDTO) {
//            Optional<Supplier> optionalSupplier = supplierRepository.findById(id);
//        if (optionalSupplier.isPresent()) {
//            Supplier supplier = optionalSupplier.get();
//            supplier.setFullName(supplierDTO.getFullName());
//            supplier.setPhoneNumber(supplierDTO.getPhoneNumber());
//            supplierRepository.save(supplier);
//            return new ApiResponse("Edited!",true);
//        }
//        return new ApiResponse("Bunday id li Supplier topilmadi!",false);
//    }
//
//    public ApiResponse delete(Integer id) {
//        Optional<Supplier> optionalSupplier = supplierRepository.findById(id);
//        if (optionalSupplier.isPresent()) {
//            Supplier supplier = optionalSupplier.get();
//            supplier.setActive(false);
//            Supplier save = supplierRepository.save(supplier);
//            return new ApiResponse("Deleteted!",true,save);
//        }
//        return new ApiResponse("Bunday id li supplier yo'q",false);
//    }
}
