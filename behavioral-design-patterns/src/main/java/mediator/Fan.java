package mediator;

public class Fan
{
  private Mediator mediator;
  private boolean isOn;

  public Fan(Mediator mediator, boolean isOn)
  {
    this.mediator = mediator;
    this.isOn = isOn;
  }

  public boolean isOn()
  {
    return isOn;
  }

  public void setOn(boolean on)
  {
    isOn = on;
  }

  public void turnOn() {
    mediator.start();
    isOn = true;
  }

  public void turnOff() {
    isOn = false;
    mediator.stop();
  }

}
