package composite;

import java.util.Objects;

public class Developer implements Employee
{
  private String name;
  private long empId;
  private String position;

  public void showEmployeeDetails()
  {
    System.out.println(this.toString());
  }

  public Developer(String name, long empId, String position)
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
    Developer developer = (Developer) o;
    return empId == developer.empId &&
      Objects.equals(name, developer.name) &&
      Objects.equals(position, developer.position);
  }

  @Override
  public int hashCode()
  {
    return Objects.hash(name, empId, position);
  }

  @Override
  public String toString()
  {
    return "Developer{" +
      "name='" + name + '\'' +
      ", empId=" + empId +
      ", position='" + position + '\'' +
      '}';
  }
}
