package singleton;

public class SingletonClass
{
  private static SingletonClass instance;

  private SingletonClass()
  {
    // private constructor
  }

  public static SingletonClass getInstance()
  {
    if (instance == null)
    {
      //synchronized block to remove overhead
      synchronized (SingletonClass.class)
      {
        if(instance==null)
        {
          // if instance is null, initialize
          System.out.println("Instance will be created!");
          instance = new SingletonClass();
        }
      }
    }
    return instance;
  }
}
