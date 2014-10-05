package com.premaseem.interpreterPattern;

import java.util.Date;

public abstract class AbstractExpression {

	public abstract void evaluate(Context context);
}

class DayExpression extends AbstractExpression
{

  @Override
  public void evaluate( Context context )
  {
    String expression = context.getExpression();
    Date date = context.getDate();
    Integer day = new Integer(date.getDate());
    String tempExpression = expression.replaceAll("DD", day.toString());
    context.setExpression(tempExpression);
  }
}

class MonthExpression extends AbstractExpression
{

  @Override
  public void evaluate( Context context )
  {
    String expression = context.getExpression();
    Date date = context.getDate();
    Integer month = new Integer(date.getMonth()+1);
    String tempExpression = expression.replaceAll("MM", month.toString());
    context.setExpression(tempExpression);
  }

}

class YearExpression extends AbstractExpression
{

  @Override
  public void evaluate( Context context )
  {
    String expression = context.getExpression();
    Date date = context.getDate();
    Integer year = new Integer(date.getYear() + 1900);
    String tempExpression = expression.replaceAll("YYYY", year.toString());
    context.setExpression(tempExpression);
  }

}