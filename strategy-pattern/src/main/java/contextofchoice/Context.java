package contextofchoice;

import choices.IChoice;

public class Context
{
  IChoice myChoice;

  public void setChoice(IChoice choice){
    myChoice = choice;
  }

  public void showChoice(String s1, String s2){
    myChoice.myChoice(s1,s2);
  }

}