package proxy.virtual;

public class VirtualProxyDemo
{

  public static void main(String[] args)
  {
    ExpensiveObject proxyObject = new ExpensiveProxyObject();
    proxyObject.process();
    proxyObject.process();
  }

}
