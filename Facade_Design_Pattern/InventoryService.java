package Facade_Design_Pattern;

public class InventoryService {
    public boolean checkStock(String productId){
        System.out.println("Checking Stock for Product : " + productId);
        return true;
    }
}
