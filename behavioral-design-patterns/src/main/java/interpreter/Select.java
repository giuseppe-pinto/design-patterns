package interpreter;

import java.util.List;

//we define the first expression, the Select class:
/*It gets the column name to be selected and another concrete Expression of type From as parameters in the constructor.
Note that in the overridden interpret() method it sets the state of the context and passes the interpretation further to another expression along with the context.
That way, we see that it's a NonTerminalExpression.*/
public class Select implements Expression
{
  private String column;
  private From from;

  public Select(String column, From from)
  {
    this.column = column;
    this.from = from;
  }

  public List<String> interpret(Context ctx)
  {
    ctx.setColumn(column);
    return from.interpret(ctx);
  }
}
