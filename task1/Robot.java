package task1;

public class Robot implements Runner{
    private String name;
    private int maxRun;
    private int maxJump;

    public Robot(String name, int maxRun, int maxJump) {
        this.name = name;
        this.maxRun = maxRun;
        this.maxJump = maxJump;
    }

    @Override
    public boolean jump(int height) {
        if (height<=maxJump){
            System.out.printf("%s has jumped over the wall %d meters high." +
                    "\n", name, height);
            return true;
        }
        else {System.out.printf("%s has failed jump over the wall %d meters high." +
                "\n", name, height);
            return false;}
    }

    @Override
    public boolean run(int length) {
        if (length<=maxRun){
            System.out.printf("%s has run whole %d meters distance." +
                    "\n", name, length);
            return true;
        }
        else{System.out.printf("%s has failed run %d meters distance." +
                "\n", name, length);
            return false;}
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getMaxRun() {
        return maxRun;
    }

    @Override
    public int getMaxJump() {
        return maxJump;
    }
}
