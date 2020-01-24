package facade;

public class CPU
{
  public void freeze() {
    System.out.println("Cpu freeze");
  }

  public void jump(long position) {
    System.out.println("Cpu jump to " + position);
  }

  public void execute() {
    System.out.println("Cpu execute");
  }
}