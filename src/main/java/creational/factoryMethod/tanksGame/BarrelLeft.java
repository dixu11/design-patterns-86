package creational.factoryMethod.tanksGame;

public class BarrelLeft extends Barrel{
    @Override
    void shoot() {
        System.out.println("Strzelam w prawo!");
    }
}
