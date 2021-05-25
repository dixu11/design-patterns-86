package creational.factoryMethod.tanksGame;

public abstract class Tank {

    Barrel barrel;

    Tank() {
        barrel = createBarrel();
    }

    public abstract Barrel createBarrel();

    public  void shoot(){
        barrel.shoot();
    }

}
