package uz.pdp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserDTO {

    private String fistName;
    private String lastName;
    private String phoneNumber;
    private String password;
    private List<Integer> warehouseIds;

    public UserDTO(String phoneNumber, String password) {
        this.phoneNumber = phoneNumber;
        this.password = password;
    }

    public UserDTO(String phoneNumber, String password, List<Integer> warehouseIds) {
        this.phoneNumber = phoneNumber;
        this.password = password;
        this.warehouseIds = warehouseIds;
    }
}
