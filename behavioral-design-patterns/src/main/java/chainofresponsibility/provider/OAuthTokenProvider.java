package chainofresponsibility.provider;

public class OAuthTokenProvider extends AuthenticationProvider
{
  private String token;

  public OAuthTokenProvider(String token)
  {
    super();
    this.token = token;
  }

  public String getToken()
  {
    return token;
  }
}
