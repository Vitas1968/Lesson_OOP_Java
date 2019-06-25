public class Dog extends Animals
{
    static final int maxRun = 500;
    static final double maxJump = 0.5f;
    static final int maxSwim = 10;
    @Override
    public void run(int distance)
    {

        System.out.println("Dog run: " + (distance<=maxRun ? true : false));
    }

    @Override
    public void jump(double height)
    {
        System.out.println("Dog jump: " + (height<=maxJump ? true : false));
    }

    @Override
    public void swim(int distance)
    {
        System.out.println("Dog swim: " + (distance<=maxSwim ? true : false));
    }
}
