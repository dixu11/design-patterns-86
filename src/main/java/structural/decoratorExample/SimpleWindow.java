package structural.decoratorExample;

class SimpleWindow implements Window{
    @Override
    public void display() {
        System.out.println("Wyświetlam proste okno");
    }
}
