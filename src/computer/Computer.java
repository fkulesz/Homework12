package computer;

public class Computer extends Device {
    Procesor procesor;
    Ram ram;
    HardDrive hardDrive;

    public Computer(String model, String producent, String serialNumber, Procesor procesor, Ram ram, HardDrive hardDrive) {
        super(model, producent, serialNumber);
        this.procesor = procesor;
        this.ram = ram;
        this.hardDrive = hardDrive;
    }

}
