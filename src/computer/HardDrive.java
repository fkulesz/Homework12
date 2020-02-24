package computer;

public class HardDrive extends Device{
    private int capacity;


    public HardDrive(String model, String producent, String serialNumber, int capacity) {
        super(model, producent, serialNumber);
        this.capacity = capacity;
    }


}
