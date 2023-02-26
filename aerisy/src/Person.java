public class Person {
    String fullName = "Default";
    int age;

    public Person(String fullName, int age)
    {
        this.fullName = fullName;
        this.age = age;
    }

    public Person()
    {

    }

    public void move()
    {
        System.out.println(this.fullName + " говорит");
    }
    public void talk()
    {
        System.out.println(this.fullName + " говорит");
    }


}
