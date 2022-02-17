package uz.pdp.dto;

import lombok.Data;

@Data
public class InputProductDTO {


    private double amount;
    private double price;
    private String expireDate;
    private Integer productId;
    private Integer inputId;
}
