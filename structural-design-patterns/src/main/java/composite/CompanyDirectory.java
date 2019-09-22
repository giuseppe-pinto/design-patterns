package composite;

import java.util.ArrayList;
import java.util.List;

public class CompanyDirectory implements Employee
{
  private List<Employee> employees = new ArrayList<>();

  public void add(Employee employee){
    employees.add(employee);
  }

  public void remove(Employee employee){
    employees.remove(employee);
  }

  @Override
  public void showEmployeeDetails()
  {
    employees.forEach(Employee::showEmployeeDetails);
  }
}