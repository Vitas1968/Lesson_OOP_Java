import java.util.Random;

public class Dog extends Animals
{
    //int maxRun;
   // static final double maxJump = 0.5;
    //static final int maxSwim = 10;

    public Dog()
    {
            // Задание 9  * Добавить животным разброс в ограничениях.
        // То есть у одной собаки ограничение на бег может быть 400 м., у другой – 600 м.
        { // генерирует случайное число в дипапазоне от 400 до 600 при создании объекта Dog и
            // задает его как предел бега - maxRun - создаваемого объекта.
            int min = 400;
            int max = 600;
            int diff = max - min;
            Random random = new Random();
            int i = random.nextInt(diff + 1);
            i += min;
            maxRun = i;
        }
        maxJump = 0.5;
        maxSwim = 10;
    }
    @Override
    public void run(int distance)
    {
        System.out.println("Предел возможностей расстояния этой собаки: -> "+maxRun);

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
