package behavioral.strategy2;
//TODO należy wykorzystać tę klasę - wyświetlanie wygaszacza
public class RenderScreenSaverStrategy implements RenderStrategy {

    @Override
    public void render() {
        System.out.println("Wyświetla wygaszacz");
    }
}
