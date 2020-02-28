package mediator;

public class Button
{
  Mediator mediator;

  public Button(Mediator mediator)
  {
    this.mediator = mediator;
  }

  public void press() {
    mediator.press();
  }

}
