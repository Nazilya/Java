package lesson5;

public class Sotrudnik {
    private int id;
    private String FIO;
    private String email;
    private String telephone;
    private int salary;
    private int age;

    public Sotrudnik() {
    }

    public Sotrudnik(int id, String FIO, String email, String telephone, int salary, int age) {
        this.id = id;
        this.FIO = FIO;
        this.email = email;
        this.telephone = telephone;
        this.salary = salary;
        this.age = age;
    }
    public void info() {
        System.out.println("id: " + id + "; Имя пользователя: "+ FIO + ";Эл адрес: " + email + "; Телефон: " + telephone +
                "; Зарплата: " + salary +"; Возраст: " + age);
    }
    public void changetelephone(String telephone) {
        this.telephone = telephone;
        System.out.println("Пользователь " + FIO + " изменил телефон: " + telephone);
    }
}


