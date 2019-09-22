package composite;

public class CompanyDemo
{
  public static void main(String[] args)
  {
    Developer developerOne = new Developer("Giuseppe Pinto", 1, "Full stack developer");
    Developer developerTwo = new Developer("Vincenzo Franco", 2, "Front End Developer");

    CompanyDirectory engDirectory = new CompanyDirectory();
    engDirectory.add(developerOne);
    engDirectory.add(developerTwo);

    Manager managerOne = new Manager("Giovanni Tirabboshi", 3, "CRO");
    Manager managerTwo = new Manager("Amico Ilario", 4, "CTO");

    CompanyDirectory manDirectory = new CompanyDirectory();
    manDirectory.add(managerOne);
    manDirectory.add(managerTwo);

    CompanyDirectory directory = new CompanyDirectory();
    directory.add(engDirectory);
    directory.add(manDirectory);
    directory.showEmployeeDetails();
  }
}