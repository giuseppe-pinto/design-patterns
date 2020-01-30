package chainofresponsibility.processor;

import chainofresponsibility.provider.AuthenticationProvider;
import chainofresponsibility.provider.UsernameAndPasswordProvider;

public class UsernameAndPasswordProcessor extends AuthenticationProcessor
{
  public UsernameAndPasswordProcessor(AuthenticationProcessor nextProcessor)
  {
    super(nextProcessor);
  }

  @Override
  public boolean isAuthorized(AuthenticationProvider authenticationProvider)
  {
    if(authenticationProvider instanceof UsernameAndPasswordProvider){
      System.out.println("UsernameAndPassword is authorized");
      return true;
    } else if(nextProcessor != null){
      return nextProcessor.isAuthorized(authenticationProvider);
    }
    return false;
  }
}