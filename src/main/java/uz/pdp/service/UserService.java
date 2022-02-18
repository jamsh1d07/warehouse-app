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

import java.util.List;

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
}
