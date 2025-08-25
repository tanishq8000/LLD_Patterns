package ProxyDesignPattern;

public interface EmployeeDao {
    public void create(String client,EmployeeDao obj) throws Exception;
    public void delete(String client,int employeeId) throws Exception;
    public EmployeeDaoImpl get(String client,int employeeId) throws Exception;
}
