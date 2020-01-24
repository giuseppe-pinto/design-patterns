package decorator.windowsdecorator;

public class VerticalScrollBarDecorator extends WindowDecorator
{
  public VerticalScrollBarDecorator(Window windowToBeDecorated)
  {
    super(windowToBeDecorated);
  }

  @Override
  public void draw(){
    super.draw();
    drawVerticalScrollBar();
  }

  @Override
  public String getDescription(){
    return super.getDescription() + ", including vertical scrollbars";
  }

  private void drawVerticalScrollBar()
  {
    System.out.println("I draw a vertical scroll bar");
  }
}