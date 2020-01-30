package chainofresponsibility;

import chainofresponsibility.processor.AuthenticationProcessor;
import chainofresponsibility.processor.OAuthProcessor;
import chainofresponsibility.processor.UsernameAndPasswordProcessor;
import chainofresponsibility.provider.OAuthTokenProvider;
import chainofresponsibility.provider.SamlTokenProvider;

public class ChainOfResponsibilityDemo
{
  public static final String TOKEN = "token";

  public static void main(String[] args)
  {
    AuthenticationProcessor authProcessorChain = getChainOfAuthProcessor();

    boolean authorized = authProcessorChain.isAuthorized(new OAuthTokenProvider(TOKEN));
    System.out.println("With the OAuthTokenProvider is authorized? " + authorized);

    authorized = authProcessorChain.isAuthorized(new SamlTokenProvider());
    System.out.println("With the SamlTokenProvider is authorized? " + authorized);
  }

  private static AuthenticationProcessor getChainOfAuthProcessor() {
    AuthenticationProcessor oAuthProcessor = new OAuthProcessor(null);
    return new UsernameAndPasswordProcessor(oAuthProcessor);
  }

}