package decorator.windowsdecorator;

public class DecoratorWindowsDemo
{

  public static void main(String[] args) {
    // Create a decorated Window with horizontal and vertical scrollbars
    Window decoratedWindow = new HorizontalScrollBarDecorator (
      new VerticalScrollBarDecorator(new SimpleWindow()));

    decoratedWindow.draw();
    
    // Print the Window's description
    System.out.println(decoratedWindow.getDescription());
  }

}
