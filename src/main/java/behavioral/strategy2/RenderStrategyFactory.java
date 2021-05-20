package behavioral.strategy2;

class RenderStrategyFactory {

    private RenderStrategy screen = new RenderScreenStrategy();
    private RenderStrategy saver = new RenderScreenSaverStrategy();
    private RenderStrategy nothing = new RenderNothingStrategy();

    public RenderStrategy getProperStrategy (String strategyType){
        switch (strategyType) {
            case "screen":
                return screen;
            case "saver":
                return saver;
            case "nothing":
                return nothing;
            default:
                return screen;
        }
    }



}
