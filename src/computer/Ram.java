package computer;

public class Ram extends Device implements Improvements{
    private int memory;
    private int cpu;
    private int defaultTemperature;
    private int maxTemperature;
    private static final int TEMPERATURE_STEP = 15;
    private static final int CPU_STEP = 100;

    public int getCpu() {
        return cpu;
    }

    public int getDefaultTemperature() {
        return defaultTemperature;
    }

    public Ram(String model, String producent, String serialNumber, int memory, int cpu, int defaultTemperature, int maxTemperature) {
        super(model, producent, serialNumber);
        this.memory = memory;
        this.cpu = cpu;
        this.defaultTemperature = defaultTemperature;
        this.maxTemperature = maxTemperature;
    }

    @Override
    public void speedUpCpu() {
        cpu += CPU_STEP;
        defaultTemperature += TEMPERATURE_STEP;
        if(defaultTemperature > maxTemperature){
            throw new IllegalArgumentException("Przekroczono temperature dla ramu");
        }
    }

}
