package HandleNullObjectPattern;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = VehicleFactory.getVehicleObject("Bike");
        printVehicleDetails(vehicle);
    }
    private static void printVehicleDetails(Vehicle vehicle){
        System.out.println("Seating Capacity is " + vehicle.getSeatingCapacity());
        System.out.println("Tank Capacity is "+vehicle.getTankCapacity());
    }
}
