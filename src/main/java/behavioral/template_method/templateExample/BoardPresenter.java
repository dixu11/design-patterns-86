package behavioral.template_method.templateExample;

public abstract class BoardPresenter {

    protected Player player;
    private int distance = 30;

    BoardPresenter(Player player) {
        this.player = player;
    }

    public void play() throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            clearScreen();
            drawGame();
            Thread.sleep(500);
            player.run();
        }
    }

    public void clearScreen() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }

    final public void drawGame() {
        System.out.print("S");
        for (int i = 0; i < distance; i++) {
            if (i == player.getDistance()) {
                System.out.print(getPlayerView());
            } else {
                System.out.print(getGround());
            }
        }
        System.out.print("M");
    }

    protected abstract String getGround();

    protected abstract String getPlayerView();


    public static void main(String[] args) throws InterruptedException {
        Player player = new Player("Piotr",0);
        BoardPresenter boardPresenter = new ForestBoardPresenter(player);
        boardPresenter.play();
    }



}
