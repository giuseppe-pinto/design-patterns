package prototype;

import java.util.HashMap;
import java.util.Map;

public class ColorStore
{

  private static Map<String, Color> stringColorMap = new HashMap<>();

  static
  {
    stringColorMap.put("Black", new BlackColor());
    stringColorMap.put("Red", new RedColor());
  }

  public static Color getColor(String colorName)
  {
    return (Color) stringColorMap.get(colorName).clone();
  }

}
