package creational.factoryMethod.tanksGame;

public class BarrelRight extends Barrel {
    @Override
    void shoot() {
        System.out.println("Strzelam w lewo!");
    }
}
