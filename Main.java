import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // write your code here
        test();

    }

    static void test(){
        User user1 = new User("1","Arsen 1", " pidor", "a.kuzmin@innopolis.ru");
        User user2 = new User("2","Arsen 2", " pidor", "a.kuzmin@innopolis.ru");
        User user3 = new User("3","Arsen 3", " pidor", "a.kuzmin@innopolis.ru");

        Event event = new Event(1,"as","asd","asd",555,"ss");

        ArrayList<User> students = new ArrayList<>();
        students.add(user1);
        students.add(user2);
        students.add(user3);

        ArrayList<String> id = new ArrayList<>();
        id.add(user2.getId());

        Attendance attendance = new Attendance(students,id);

        attendance.print();

        attendance.changePresenceById(user1.getId());

        attendance.print();

        attendance.changePresenceById(user3.getId());
        attendance.changePresenceById(user2.getId());
        attendance.print();

        attendance.changePresenceById(user2.getId());
        attendance.print();




    }
}
