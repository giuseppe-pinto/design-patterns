package proxy.protection;

public class ProtectionProxyDemo
{

  public static void main(String[] args)
  {
    Internet internet = new ProxyInternet();

    try
    {
      internet.connectTo("www.giuseppe.com");
      internet.connectTo("www.fAke.com");
    }
    catch (Exception e)
    {
      System.out.println(e.getMessage());
    }
  }

}