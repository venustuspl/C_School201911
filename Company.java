import java.util.ArrayList;
import java.util.List;

public class Company {

    private String name;
    private String address;
    private int numberOfEmployees;
    private List<Employee> employeeList;

    public Company(String name, String address, int numberOfEmployees) {
        this.name = name;
        this.address = address;
        this.numberOfEmployees = numberOfEmployees;
        this.employeeList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    public void addEmployee(Employee employee){
        this.employeeList.add(employee);
    }

    public void removeEmployee(Employee employee){
        this.employeeList.remove(employee);
    }

}
