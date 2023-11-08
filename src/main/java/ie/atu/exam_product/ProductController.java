package ie.atu.exam_product;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    private final WarehouseInterface warehouseInterface;
    public ProductController(WarehouseInterface warehouseInterface){
        this.warehouseInterface = warehouseInterface;
    }
@PostMapping("/addProduct")
    public String addProduct(@RequestBody ProductObject productObject){
        if(warehouseInterface.addProduct(productObject).getWarehouseId() > 0){
            return "Product added";
        }
        else{
            return "No space available";
        }

}
@GetMapping("/Test")
    public String Test(){
    return warehouseInterface.Test();
    }
}
