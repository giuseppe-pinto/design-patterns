package interpreter;

import java.util.List;

//Now, in SQL the where clause is optional, therefore this class is either a terminal or a non-terminal expression.
//If the user decides not to use a where clause, the From expression it's going to be terminated with the ctx.search() call and return the result.
// Otherwise, it's going to be further interpreted.
public class From implements Expression
{
  private String table;
  private Where where;

  public From(String table, Where where)
  {
    this.table = table;
    this.where = where;
  }

  public From(String table)
  {
    this.table = table;
  }

  public List<String> interpret(Context ctx)
  {
    ctx.setTable(table);
    if (where == null) {
      return ctx.search();
    }
    return where.interpret(ctx);
  }
}
