package chainofresponsibility.provider;

public class UsernameAndPasswordProvider extends AuthenticationProvider
{
  private String username;
  private String password;

  public UsernameAndPasswordProvider(String username, String password)
  {
    super();
    this.username = username;
    this.password = password;
  }

  public String getUsername()
  {
    return username;
  }

  public String getPassword()
  {
    return password;
  }
}