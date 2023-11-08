package ie.atu.exam_product;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "warehouse",url = "http://localhost:8081")
public interface WarehouseInterface {
    @PostMapping("/addProduct")
    WarehouseObject addProduct(@RequestBody ProductObject productObject);
}
