package decorator.component;


// Abstract Pizza class (All classes extend from this) Component
public abstract class Pizza
{
  protected String description = "Unknown Pizza";

  public String getDescription()
  {
    return description;
  }

  public abstract int getCost();

}
