package behavioral.template_method.templateExample;

public class ForestBoardPresenter extends BoardPresenter{
    ForestBoardPresenter(Player player) {
        super(player);
    }

    @Override
    protected String getGround() {
        return "/\\";
    }

    @Override
    protected String getPlayerView() {
        return "*"+ player.getName()+"*";
    }
}
