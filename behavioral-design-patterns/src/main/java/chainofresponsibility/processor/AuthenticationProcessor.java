package chainofresponsibility.processor;

import chainofresponsibility.provider.AuthenticationProvider;

public abstract class AuthenticationProcessor
{

  public AuthenticationProcessor nextProcessor;

  public AuthenticationProcessor(AuthenticationProcessor nextProcessor)
  {
    this.nextProcessor = nextProcessor;
  }

  public abstract boolean isAuthorized(AuthenticationProvider authenticationProvider);

}
