import java.util.Random;

public class Cat extends Animals
{

    public Cat()
    {
        // Задание 9  * Добавить животным разброс в ограничениях.
        // То есть у одной собаки ограничение на бег может быть 400 м., у другой – 600 м.
        { // генерирует случайное число в дипапазоне от 100 до 300 при создании объекта Cat и
            // задает его как предел бега - maxRun - создаваемого объекта.
            int min = 100;
            int max = 300;
            int diff = max - min;
            Random random = new Random();
            int i = random.nextInt(diff + 1);
            i += min;
            maxRun = i;
        }
        maxJump = 2;
        maxSwim = 10; // без разницы какое число,
        // в методе swim стоит проверка на 0 метров )) кошки не любят плавать ))
    }

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
