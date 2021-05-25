package creational.factoryMethod.tanksGame;

public class TankLeft extends Tank{

    @Override
    public Barrel createBarrel() {
        return new BarrelLeft();
    }

   /* public TankLeft(){
        barrel = new BarrelLeft();
    }*/


}
