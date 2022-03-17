package uz.pdp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.pdp.entity.Category;
import uz.pdp.entity.Measurement;

import javax.persistence.*;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class ProductDTO {

    private String name;

    private Integer categoryId;

    private Integer measurementId;


}
