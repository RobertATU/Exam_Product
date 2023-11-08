package ie.atu.exam_product;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WarehouseObject {
    @JsonProperty("warehouseId")
    private int warehouseId;

    @JsonProperty("location")
    private String location;

    @JsonProperty("capacity")
    private int capacity;
}
