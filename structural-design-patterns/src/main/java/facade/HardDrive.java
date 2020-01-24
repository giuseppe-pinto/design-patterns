package facade;

class HardDrive
{

  byte[] read(long lba, int size) {
    System.out.println("Hard Drive lba " + lba + " size " + size);
    return new byte[2];
  }

}
