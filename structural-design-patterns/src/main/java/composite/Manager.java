package composite;

import java.util.Objects;

public class Manager implements Employee
{
  private String name;
  private long empId;
  private String position;

  @Override
  public void showEmployeeDetails()
  {
    System.out.println(this.toString());
  }

  public Manager(String name, long empId, String position)
  {
    this.name = name;
    this.empId = empId;
    this.position = position;
  }

  public String getName()
  {
    return name;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public long getEmpId()
  {
    return empId;
  }

  public void setEmpId(long empId)
  {
    this.empId = empId;
  }

  public String getPosition()
  {
    return position;
  }

  public void setPosition(String position)
  {
    this.position = position;
  }

  @Override
  public boolean equals(Object o)
  {
    if (this == o)
    {
      return true;
    }
    if (o == null || getClass() != o.getClass())
    {
      return false;
    }
    Manager manager = (Manager) o;
    return empId == manager.empId &&
      Objects.equals(name, manager.name) &&
      Objects.equals(position, manager.position);
  }

  @Override
  public int hashCode()
  {
    return Objects.hash(name, empId, position);
  }

  @Override
  public String toString()
  {
    return "Manager{" +
      "name='" + name + '\'' +
      ", empId=" + empId +
      ", position='" + position + '\'' +
      '}';
  }
}
