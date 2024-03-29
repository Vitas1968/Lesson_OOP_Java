// Задание 1 Создать класс «Сотрудник» с полями: ФИО, должность, email, телефон, зарплата, возраст;
public class Employee
{
    // Задание 1
   private String name;
    private String email;
    private String position;
    private String phone;
    private int salary;
    private int age;

    // Задание 2  Конструктор класса должен заполнять эти поля при создании объекта;
    public Employee(String name, String position, String email, String phone
    , int salary,int age )
    {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getPosition()
    {
        return position;
    }

    public void setPosition(String position)
    {
        this.position = position;
    }

    public String getPhone()
    {
        return phone;
    }

    public void setPhone(String phone)
    {
        this.phone = phone;
    }

    public int getSalary()
    {
        return salary;
    }

    public void setSalary(int salary)
    {
        this.salary = salary;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    // Задание 3 Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль
    public void infoEmployee()
    {
        System.out.println("Employee: Name "+name+" Position: "+position+" Email: "
        +email+" Phone: "+phone+" Salary: "+salary+" Age: "+age);
    }


}
