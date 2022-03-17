package uz.pdp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import uz.pdp.dto.ApiResponse;
import uz.pdp.dto.UserDTO;
import uz.pdp.entity.User;
import uz.pdp.entity.Warehouse;
import uz.pdp.repositoy.UserRepository;
import uz.pdp.repositoy.WarehouseRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    WarehouseRepository warehouseRepository;
    @Autowired
    UserRepository userRepository;

    public ApiResponse register(UserDTO dto) {
        if (userRepository.existsByPhoneNumber(dto.getPhoneNumber())) {

            return new ApiResponse("Bunday nomerli odam bor", false);
        }
        User user = new User();
        user.setFistName(dto.getFistName());
        user.setLastName(dto.getLastName());
        user.setPhoneNumber(dto.getPhoneNumber());
        user.setPassword(dto.getPassword());
        List<Warehouse> allById = warehouseRepository.findAllById(dto.getWarehouseIds());
        user.setWarehouseList(allById);
        User save = userRepository.save(user);

        return new ApiResponse("Ro'yxatdan o'tdingiz!", true);
    }

    public ApiResponse login(UserDTO dto) {
        if (userRepository.existsByPhoneNumberAndPassword(dto.getPhoneNumber(), dto.getPassword())) {
            return new ApiResponse("Xush kelibsiz", true);

        }
        return new ApiResponse("Parol yoki Nomer xato", false);
    }

    public ApiResponse getAll() {
        List<User> all = userRepository.findAll();

        return new ApiResponse("All User",true,all);
    }

    public Optional<User> getOne(Integer id) {
        return userRepository.findById(id);
    }

    public ApiResponse delete(Integer id) {
        Optional<User> optionalUser = userRepository.findById(id);
        if (optionalUser.isPresent()) {
            User user = optionalUser.get();
            user.setActive(false);
            User save = userRepository.save(user);
            return new ApiResponse("Deleted !",true,save);
        }

        return new ApiResponse("Bunday Id li user yo'q!",false);
    }

    public ApiResponse save(UserDTO dto) {
        if (!userRepository.existsByPhoneNumber(dto.getPhoneNumber())) {


        User user=new User();
        user.setFistName(dto.getFistName());
        user.setLastName(dto.getLastName());
        user.setPhoneNumber(dto.getPhoneNumber());
        user.setPassword(dto.getPassword());


        List<Integer> warehouseIds = dto.getWarehouseIds();
        List<Warehouse > warehouseList=new ArrayList<>();
        for (Integer warehouseId : warehouseIds) {
            Optional<Warehouse> optionalWarehouse = warehouseRepository.findById(warehouseId);
            warehouseList.add(optionalWarehouse.get());
        }
        user.setWarehouseList(warehouseList);
        userRepository.save(user);
        return new ApiResponse("Saved!",true);}
        return new ApiResponse("Bunday tel raqamli odam bor!",false);
    }

    public ApiResponse edit(Integer id, UserDTO dto) {

        if (userRepository.findById(id).isPresent()) {
            Optional<User> byId = userRepository.findById(id);
            User user = byId.get();

            List<Warehouse> warehouseRepositoryAllById = warehouseRepository.findAllById(dto.getWarehouseIds());

            user.setFistName(dto.getFistName());
            user.setLastName(dto.getLastName());
            user.setPassword(dto.getPassword());
            user.setPhoneNumber(dto.getPhoneNumber());
            user.setWarehouseList(warehouseRepositoryAllById);

            userRepository.save(user);
            return new ApiResponse("Edited!",true);
        }

        return new ApiResponse("Bunday id li user topilmadi!",false);
    }
}
