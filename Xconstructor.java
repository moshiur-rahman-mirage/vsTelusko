class Human{
    String name;
    int age;

    public Human(String name, int age) {
        System.out.println("Inside constructor");
        this.name = name;
        this.age = age;
    }

    public Human() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class Xconstructor {
    public static void main(String[] args) {
        Human h = new Human("Rakib",3);
        h.setAge(5);
    }
}
