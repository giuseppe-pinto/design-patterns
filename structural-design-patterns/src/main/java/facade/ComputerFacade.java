package facade;

class ComputerFacade
{
  private static final int BOOT_SECTOR = 10;
  private static final int SECTOR_SIZE = 10;
  private static final int BOOT_ADDRESS = 1;

  private final CPU processor;
  private final Memory ram;
  private final HardDrive hd;

  public ComputerFacade() {
    this.processor = new CPU();
    this.ram = new Memory();
    this.hd = new HardDrive();
  }

  public void start() {
    processor.freeze();
    ram.load(BOOT_ADDRESS, hd.read(BOOT_SECTOR, SECTOR_SIZE));
    processor.jump(BOOT_ADDRESS);
    processor.execute();
  }

}