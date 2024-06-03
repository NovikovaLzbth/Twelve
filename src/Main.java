interface User {
    void Login();
    void Password();
}

abstract class People implements User {
    String FIO;
    int Age;
    String Position;
    People(String fio, int Age, String position){
        FIO = fio;
        this.Age = Age;
        Position = position;
    }

}

class Teacher extends People {
    String Login;
    String Password;
    Teacher(String fio, int Age, String position, String login, String password) {
        super(fio, Age, position);
        Login = login;
        Password = password;
    }
    @Override
    public void Login() {

        System.out.println("Логин преподавателя " + "(" + FIO + ")" + ": " + Login);
    }

    @Override
    public void Password() {

        System.out.println("Пароль преподавателя " + "(" + FIO + ")" + ": " + Password);
    }
}

class Student extends People {
    String Login;
    String Password;
    Student(String fio, int Age, String position, String login, String password) {
        super(fio, Age, position);
        Login = login;
        Password = password;
    }
    @Override
    public void Login() {

        System.out.println("Логин студента " + "(" + FIO + ")" + ": " + Login);
    }

    @Override
    public void Password() {

        System.out.println("Пароль студента" + "(" + FIO + ")" + ": " + Password);
    }

}

public class Main {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Кабанов В.С.", 50, "Преподаватель", "Kaban", "22Rl09p");
        Teacher teacher2 = new Teacher("Кривозеров Ф.Ф.", 70, "Преподаватель", "User876549", "11111");
        Student student = new Student("Кузнецов О.Г.", 20, "Студент", "IceCream", "cc6Mz1l");
        Student student2 = new Student("Алексин С.А.", 35, "Студент", "Haker", "vvv4Rt");

        teacher.Login();
        teacher.Password();

        student.Login();
        student.Password();

    }
}
