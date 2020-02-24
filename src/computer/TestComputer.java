package computer;

public class TestComputer {
    public static void main(String[] args) {
        HardDrive hardDrive = new HardDrive("XYZ", "Lenovo", "123", 128);
        Procesor procesor = new Procesor("XYZQ", "Lenovo", "2345", 1234, 30, 80);
        Ram ram = new Ram("XYZ", "lenovo", "3456", 1000, 1234, 30, 90);
        Computer computer = new Computer("XYZ", "lenovo", "4567", procesor, ram, hardDrive);

        int desiredprocesorCPU = 1500;
        System.out.println(" default cpu: " + procesor.getCpu());
        while(procesor.getCpu() <= desiredprocesorCPU ) {

            procesor.speedUpCpu();
            System.out.println("CPU procesora: " + procesor.getCpu() + " temperatura " + procesor.getDefaultTemperature());
        }

        int desiredRamCPU = 2000;
        System.out.println(" default cpu ramu: " + ram.getCpu());
        while(ram.getCpu() <= desiredRamCPU ) {

            ram.speedUpCpu();
            System.out.println("CPU ram: " + ram.getCpu() + " temperatura " + ram.getDefaultTemperature());
        }
    }
}
