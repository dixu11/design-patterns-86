package creational.factoryMethod.tanksGame;

public class TankRight extends Tank{

   /* public TankRight() {
        barrel = new BarrelRight();
    }*/
   @Override
   public Barrel createBarrel() {
       return new BarrelRight();
   }
}
