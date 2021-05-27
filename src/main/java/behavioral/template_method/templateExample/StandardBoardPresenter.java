package behavioral.template_method.templateExample;

public class StandardBoardPresenter  extends BoardPresenter{


    StandardBoardPresenter(Player player) {
        super(player);
    }

    @Override
    protected String getGround() {
        return ".";
    }

    @Override
    protected String getPlayerView() {
        return player.getName().charAt(0) + "";
    }
}
