package interpreter;

import java.util.List;

//The Expression interface will have the interpret method
public interface Expression
{
  List<String> interpret(Context ctx);
}
