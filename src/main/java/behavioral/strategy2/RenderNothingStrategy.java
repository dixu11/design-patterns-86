package behavioral.strategy2;

//TODO należy wykorzystać tę klasę - nie wyświetla niczego (możesz zrobić odpowiedniego souta :) )
public class RenderNothingStrategy implements RenderStrategy  {

    @Override
    public void render() {
        System.out.println("<ciemny ekran>");
    }
}
