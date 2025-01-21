public class Dice {
    private static final int MIN_VAL=1;
    private static final int MAX_VAL=6;

    public int getNumber(){
        return (int) (Math.random()*(MAX_VAL-MIN_VAL+1)+MIN_VAL);
    }
}
