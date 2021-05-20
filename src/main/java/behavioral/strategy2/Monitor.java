package behavioral.strategy2;

public class Monitor {

    private int secondsWithoutInput = 0;
    private final int secondsToScreenSaver; //po ilu sekundach uruchomić wygaszacz
    private final int secondsToShutdown; //po ilu sekundach wyłączyć ekran
    private RenderStrategy renderStrategy;
    private RenderStrategyFactory factory = new RenderStrategyFactory();


    public Monitor(int secondsToScreenSaver, int secondsToShutdown) {
        this.secondsToScreenSaver = secondsToScreenSaver;
        this.secondsToShutdown = secondsToShutdown;
        renderStrategy = new RenderScreenStrategy();
    }

    public void testMonitorFor(int seconds){
        for (int i = 0; i < seconds; i++) {
            secondsWithoutInput++;
            renderScreen();
            if (hasUserInteracted()) {
                secondsWithoutInput = 0; //resetujemy licznik wygaszacza jeśli była interakcja
                System.out.println("<INTERACTION DETECTED>");
            }
            updateRenderStrategy();
        }
    }

    private void renderScreen() {
        renderStrategy.render();
    }

    private boolean hasUserInteracted() {
        return Math.random() <= 0.02;  //2% szansa na to że w tej sekundzie testowania user wykonał interakcje
    }

    private void updateRenderStrategy() {
        if (secondsWithoutInput > secondsToShutdown) {
            renderStrategy = factory.getProperStrategy("nothing");
        } else if (secondsWithoutInput > secondsToScreenSaver) {
            renderStrategy = factory.getProperStrategy("saver");
        } else {
            renderStrategy = factory.getProperStrategy("screen");
        }
    }






}
