package computer;

public class Procesor  extends Device implements Improvements {
    private int cpu;
    private int defaultTemperature;
    private int maxTemperature;
    private static final int TEMPERATURE_STEP = 10;
    private static final int CPU_STEP = 100;

    public int getCpu() {
        return cpu;
    }

    public int getDefaultTemperature() {
        return defaultTemperature;
    }

    public Procesor(String model, String producent, String serialNumber, int cpu, int defaultTemperature, int maxTemperature) {
        super(model, producent, serialNumber);
        this.cpu = cpu;
        this.defaultTemperature = defaultTemperature;
        this.maxTemperature = maxTemperature;
    }

    @Override
    public void speedUpCpu() {
        cpu += CPU_STEP;
        defaultTemperature += TEMPERATURE_STEP;
        if(defaultTemperature > maxTemperature){
            throw new IllegalArgumentException("Przekroczono temperature dla procesora");
        }
    }
}
