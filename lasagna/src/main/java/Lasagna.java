public class Lasagna {
    private final int EXPECTED_COOKING_TIME = 40;
    private final int LAYER_EXTRA_TIME = 2;
    public int expectedMinutesInOven(){
        return EXPECTED_COOKING_TIME;
    }
    public int remainingMinutesInOven(int elapsedMinutes){
        return EXPECTED_COOKING_TIME - elapsedMinutes;
    }
    public int preparationTimeInMinutes(int layers){
        return layers * LAYER_EXTRA_TIME;
    }
    public int totalTimeInMinutes(int layers, int elapsedMinutes){
        return preparationTimeInMinutes(layers) + elapsedMinutes;
    }
}
