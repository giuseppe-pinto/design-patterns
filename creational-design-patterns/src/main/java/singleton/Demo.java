package singleton;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.Collectors;

public class Demo
{
  public static void main(String[] args)
  {
    //asList(new Th1(), new Th2()).parallelStream().forEach(Runnable::run);
    ExecutorService executor = Executors.newFixedThreadPool(2);

    List<Th1> xx = Arrays.asList(new Th1(), new Th1());
    List<Future<?>> collectors = xx.stream().map(executor::submit).collect(Collectors.toList());
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