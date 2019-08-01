package lesson4.personal;

public class PersonTest {
    public static void main(String[] args) {

        Person [] personal = new Person[5];
        personal[0] = new Person("Ivanov Ivan", "CEO", "IvanovI@mail.ru", "+7(926)123-44-55", 500000, 50);
        personal[1] = new Person("Petrov Petr", "accountant", "PetrovP@mail.ru", "+7(903)321-11-00",300000, 45);
        personal[2] = new Person("Sidorov Sidor", "security guard", null, "+7(903)-987-65-43",30000, 35);
        personal[3] = new Person("Gulnarova Gulnara","janitor",null,"+7(926)765-43-21",15000,25);
        personal[4] = new Person("Zaitsev Igor", "eengineer", "Zaitsev@mail.ru", "+7(926)123-56-78", 100000, 31);

        for (int i = 0; i < personal.length; i++) {
            if(personal[i].getAge()>=40){
                personal[i].info();
            }
        }
    }
}
