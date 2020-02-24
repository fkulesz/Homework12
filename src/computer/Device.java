package computer;

public abstract class Device {
    private String model;
    private String producent;
    private String serialNumber;

    public Device(String model, String producent, String serialNumber) {
        this.model = model;
        this.producent = producent;
        this.serialNumber = serialNumber;
    }
}
