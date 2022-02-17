package uz.pdp.dto;

import lombok.Data;

import java.util.List;

@Data
public class InputDTO {

    private String date;
    private Integer warehouseId;
    private Integer currencyId;
    private String factureNumber;
    private Integer supplierId;

}
