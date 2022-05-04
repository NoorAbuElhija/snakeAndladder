public class Die {
    private int lowest;
    private int highest;
    public Die(int lowest, int highest) {
        this.lowest = lowest;
        this.highest = highest;
    }

    public Die() {
        this(1, 6);
    }

    public int getLowest() {
        return lowest;
    }

    public int getHigher() {
        return highest;
    }
    public void setLowest(int lowest){this.lowest=lowest;}
    public void setHigher(int highest){this.highest=highest;}
    public static int roll(Die cube)
    {

        int bound=cube.highest- cube.lowest;
        int result=cube.lowest+Main.rnd.nextInt(bound+1);
        return result;


    }
}
