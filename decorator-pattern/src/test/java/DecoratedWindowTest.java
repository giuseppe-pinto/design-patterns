import decoratorofdomain.HorizontalScrollBarDecorator;
import decoratorofdomain.VerticalScrollBarDecorator;
import domain.SimpleWindow;
import domain.Window;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DecoratedWindowTest
{
  @Test
  public void descriptionOfDecoratorWindowWithHorizontalAndVerticalScrollBars()
  {
    Window decoratorWindow =
      new HorizontalScrollBarDecorator(
        new VerticalScrollBarDecorator(
          new SimpleWindow()));

    System.out.println(decoratorWindow.getDescription());
  }

  @Test
  public void descriptionOfDecoratorWithHorizontalScrollBar()
  {
    Window decoratorWindow = new HorizontalScrollBarDecorator(new SimpleWindow());
    System.out.println(decoratorWindow.getDescription());
  }

  @Test
  public void descriptionOfDecoratorWithVerticalScrollBar()
  {
    Window decoratorWindow = new VerticalScrollBarDecorator( new SimpleWindow());
    System.out.println(decoratorWindow.getDescription());
  }

  @Test
  public void drawDecoratorWindowWithHorizontalScrollBar()
  {
    Window decoratedWindow = new HorizontalScrollBarDecorator(new SimpleWindow());
    decoratedWindow.draw();
  }

  @Test
  public void drawDecoratorWindowWithVerticalScrollBar()
  {
    Window decoratedWindow = new VerticalScrollBarDecorator(new SimpleWindow());
    decoratedWindow.draw();
  }

  @Test
  public void drawDecoratorWindowWithHorizontalAndVerticalScrollBar()
  {
    Window decoratedWindow = new HorizontalScrollBarDecorator(
      new VerticalScrollBarDecorator(new SimpleWindow()));
    decoratedWindow.draw();
  }

  @Test
  public void testWindowDecoratorTest() {
    Window decoratedWindow = new HorizontalScrollBarDecorator(new VerticalScrollBarDecorator(new SimpleWindow()));
    assertEquals("Simple window, including vertical scrollbars, including horizontal scrollbars", decoratedWindow.getDescription());
  }
}