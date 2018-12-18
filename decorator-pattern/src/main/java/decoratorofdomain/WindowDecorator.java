package decoratorofdomain;

import domain.Window;

public abstract class WindowDecorator implements Window
{
  private Window windowToBeDecorated;

  WindowDecorator(Window windowToBeDecorated)
  {
    this.windowToBeDecorated = windowToBeDecorated;
  }

  @Override
  public void draw() {
    windowToBeDecorated.draw(); //Delegation
  }
  @Override
  public String getDescription() {
    return windowToBeDecorated.getDescription(); //Delegation
  }

}