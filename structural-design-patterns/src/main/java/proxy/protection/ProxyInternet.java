package proxy.protection;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements Internet
{

  private Internet internet = new RealInternet();
  private static List<String> bannedSites;

  static {
    bannedSites = new ArrayList<>();
    bannedSites.add("www.abc.com");
    bannedSites.add("www.fake.com");
    bannedSites.add("www.banned.com");
  }

  @Override
  public void connectTo(String serverHost) throws Exception
  {

    if(bannedSites.contains(serverHost.toLowerCase())){
      throw new Exception("Access Denied!");
    } else {
      internet.connectTo(serverHost);
    }

  }
}
