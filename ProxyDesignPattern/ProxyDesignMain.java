package ProxyDesignPattern;

public class ProxyDesignMain {
    public static void main(String[] args) {
        try{
            EmployeeDao empTableObj = new EmployeeDaoProxy();
            empTableObj.create("ADMIN",new EmployeeDaoImpl());
            System.out.println("Operation Successfull");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
