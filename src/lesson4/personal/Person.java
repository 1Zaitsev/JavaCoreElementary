package lesson4.personal;

public class Person {
    private String fullName;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Person(String fullName, String position, String email, String phone, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public void info(){
        System.out.println("Full name: " + this.fullName + "; \nposition: " + this.position + "; \nemail: " + this.email + "; \nphone number: " + this.phone + "; \nsalary: " + this.salary + "; \nage: " + this.age + ".");
    }
}
