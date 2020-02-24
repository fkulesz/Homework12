package shapes;

public abstract class Shape3D extends  Shape implements Calc3D {
    @Override
    public  double ballVolume(Ball ball){
        double volume = (4 * ball.getPI() * Math.pow(ball.getR(),3))/3;
        return volume;
    }
    @Override
    public double cubeVolume(Cube cube){
        double volume = Math.pow(cube.getA(),3);
        return volume;
    }
}
