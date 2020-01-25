package proxy.virtual;

public class ExpensiveObjectImpl implements ExpensiveObject
{

  public ExpensiveObjectImpl()
  {
    heavyInitialConfiguration();
  }

  private void heavyInitialConfiguration()
  {
    try
    {
      System.out.println("Loading initial configuration...");
      Thread.sleep(5000);
    }
    catch (InterruptedException e)
    {
      System.out.println("Error while load initial configuration.");
    }
  }

  @Override
  public void process()
  {
    System.out.println("Processing complete!");
  }
}