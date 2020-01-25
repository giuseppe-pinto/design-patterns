package flyweight;

import java.util.Objects;

public class Color
{

  private String code;
  private String description;

  public Color(String code, String description)
  {
    this.code = code;
    this.description = description;
  }

  public String getCode()
  {
    return code;
  }

  public void setCode(String code)
  {
    this.code = code;
  }

  public String getDescription()
  {
    return description;
  }

  public void setDescription(String description)
  {
    this.description = description;
  }

  @Override
  public boolean equals(Object o)
  {
    if (this == o)
    {
      return true;
    }
    if (o == null || getClass() != o.getClass())
    {
      return false;
    }
    Color color = (Color) o;
    return Objects.equals(code, color.code) &&
      Objects.equals(description, color.description);
  }

  @Override
  public int hashCode()
  {
    return Objects.hash(code, description);
  }

  @Override
  public String toString()
  {
    return "Color{" +
      "code='" + code + '\'' +
      ", description='" + description + '\'' +
      '}';
  }
}
