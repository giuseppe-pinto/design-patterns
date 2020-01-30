package chainofresponsibility.processor;

import chainofresponsibility.provider.AuthenticationProvider;
import chainofresponsibility.provider.OAuthTokenProvider;

public class OAuthProcessor extends AuthenticationProcessor
{

  public OAuthProcessor(AuthenticationProcessor nextProcessor)
  {
    super(nextProcessor);
  }

  @Override
  public boolean isAuthorized(AuthenticationProvider authenticationProvider)
  {
    if(authenticationProvider instanceof OAuthTokenProvider){
      System.out.println("OAuthToken is authorized");
      return true;
    }else if(nextProcessor != null){
      return nextProcessor.isAuthorized(authenticationProvider);
    }
    return false;
  }
}
