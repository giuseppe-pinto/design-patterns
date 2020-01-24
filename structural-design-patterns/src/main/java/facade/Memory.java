package facade;

import java.util.Arrays;

class Memory
{
  void load(long position, byte[] data) {
    System.out.println("Memory data "+ Arrays.toString(data) + "in position " + position);
  }
}
