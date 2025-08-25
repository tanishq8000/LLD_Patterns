package ProxyDesignPattern;

public class EmployeeDaoImpl implements EmployeeDao{
    @Override
    public void create(String client,EmployeeDao obj) throws Exception{
        System.out.println("Created new row in Employee table");
    }

    @Override
    public void delete(String client,int employeeId){
        System.out.println("Deleted row with Employee Id : " + employeeId);
    }

    @Override
    public EmployeeDaoImpl get(String client,int employeeId) throws Exception{
        System.out.println("Fetching data from DB");
        return new EmployeeDaoImpl();
    }
}
