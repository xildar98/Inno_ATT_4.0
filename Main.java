import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // write your code here
        test();

    }

    static void test(){
        User user1 = new User("1","Arsen 1", " pidor", "a.kuzmin@innopolis.ru");
        User user2 = new User("1","Arsen 2", " pidor", "a.kuzmin@innopolis.ru");
        User user3 = new User("1","Arsen 3", " pidor", "a.kuzmin@innopolis.ru");
    /*    ArrayList<User> group1 = new ArrayList<>();
        group1.add(user1);
        group1.add(user2);
        group1.add(user3);
        ArrayList<String> attendance = new ArrayList<>();
        attendance.add(user1.getId());


        Group group = new Group("group1",group1);

        Classes classes = new Classes(123,"ya",new Course(1,"asd",new Subject(),"2015"));

        Event event = new Event(1, "here ","414 room" ,"15.05.2018",group,attendance);

        event.print();

        event.changePresenceByName(user2.getFullName());
        System.out.println();

        event.print();

        event.changePresenceById("1");
        event.print();*/
    }
}
