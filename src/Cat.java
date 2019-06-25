public class Cat extends Animals
{
    static final int maxRun = 200;
    static final int maxJump = 2;

    @Override
    public void run(int distance)
    {
        System.out.println("Cat run: " + (distance<=maxRun ? true : false));
    }

    @Override
    public void jump(double height)
    {
        System.out.println("Cat jump: " + (height<=maxJump ? true : false));
    }

    @Override
    public void swim(int distance)
    {
        System.out.println("Cat swim: " + (distance==0));
    }
}
