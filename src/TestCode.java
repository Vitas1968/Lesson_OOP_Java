public class TestCode
{
    public static void main(String[] args)
    {
         boolean switch1 = false; //переключатель для тестирования первой и второй
        // частей задания: false - про животных, true-про сотрудников

        if (switch1)
        {
            // Задание 4 Создать массив из 5 сотрудников,

            // С помощью цикла вывести информацию только о сотрудниках старше 40 лет
            Employee[] employees = new Employee[5];

            employees[0] = new Employee("Раздолбаев", "Директор", "ra@mail.com", "89012345678", 90000, 47);
            employees[1] = new Employee("Криворуков", "Программист", "pro@mail.com", "89012342346", 70000, 27);
            employees[2] = new Employee("Сидоров", "Инженер", "ing@mail.com", "89014325678", 50000, 36);
            employees[3] = new Employee("Мешалкина", "Менеджер", "manager@mail.com", "86154325678", 30000, 24);
            employees[4] = new Employee("Грязнова", "Уборщица", "clean@mail.com", "86154329345", 15000, 60);

            for (Employee e : employees)
            {
                if (e.getAge() > 40)
                {
                    e.infoEmployee();
                }
            }
        } else
        {
            Cat cat = new Cat();
            Dog dog=new Dog();
            cat.run(160); // true
            cat.swim(10); //false
            cat.jump(3); //false

            dog.swim(50); //false
            dog.run(499); // true
            dog.jump(0.7); //false

        }

    }
}
