package ProxyDesignPattern;

public class EmployeeDaoProxy implements EmployeeDao{
    EmployeeDao employeeDaoObj;
    EmployeeDaoProxy(){
        employeeDaoObj = new EmployeeDaoImpl();
    }

    @Override
    public void create(String client,EmployeeDao obj) throws Exception{
        if(client == "ADMIN"){
            employeeDaoObj.create(client,obj);
            return;
        }
        throw new Exception("Access Denied");
    }

    @Override
    public void delete(String client,int employeeId) throws Exception{
        if(client == "ADMIN"){
            employeeDaoObj.delete(client,employeeId);
            return;
        }
        throw new Exception("Access Denied");
    }

    @Override
    public EmployeeDaoImpl get(String client,int employeeId) throws Exception{
        if(client == "ADMIN" || client == "USER"){
            return employeeDaoObj.get(client,employeeId);
        }
        throw new Exception("Access Denied");
    }
}
