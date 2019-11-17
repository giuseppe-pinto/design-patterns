package singleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo
{
  public static void main(String[] args)
  {
    //asList(new Th1(), new Th2()).parallelStream().forEach(Runnable::run);
    ExecutorService executor = Executors.newFixedThreadPool(2);
    executor.submit(() -> new Th1().run());
    executor.submit(() -> new Th1().run());
    executor.shutdown();
  }

  public static class Th1 implements Runnable
  {
    @Override
    public void run()
    {
      System.out.println(System.currentTimeMillis());
      SingletonClass.getInstance();
      System.out.println("Finish");
    }
  }

  public static class Th2 implements Runnable
  {
    @Override
    public void run()
    {
      System.out.println(System.currentTimeMillis());
      SingletonClass.getInstance();
      System.out.println("Finish");
    }
  }
}