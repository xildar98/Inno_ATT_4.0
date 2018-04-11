import java.util.ArrayList;

public class Event {

    /*
    events (id INT AUTO_INCREMENT NOT NULL,
		class INT NOT NULL,
		name VARCHAR(255) NOT NULL,
		place VARCHAR(255) NOT NULL,
		attended TEXT NOT NULL,
		date VARCHAR(255) NOT NULL,
		PRIMARY KEY(id),
		FOREIGN KEY (class) REFERENCES classes(id) ON DELETE CASCADE)
     */
    private int id;
    private String name;
    private String place;
    private String attendedId;
    private String date;
    private int classId;

    Event(int id, String name, String place, String date, int classesId,  String attendedId){
        this.id = id;
        this.name = name;
        this.place = place;
        this.attendedId = attendedId;
        this.date = date;
        this.classId = classId;
    }

    int getClassId(){
        return classId;
    }

    int getId(){
        return id;
    }
    String getName(){
        return name;
    }
    String getPlace(){
        return place;
    }
    String getDate(){
        return date;
    }

/*
    void changePresenceById(String studentsId){
        if(attendedId.contains(studentsId)){
            attendedId.remove(studentsId);
        } else{
            attendedId.add(studentsId);
        }
    }
    void changePresenceByName(String name){
        String studentsId = getIdByName(name);
        changePresenceById(studentsId);
    }


    String getIdByName(String name){
        for (User user: group.getListOfStudents() ) {
            if(name.equals(user.getFullName())){
                return user.getId();
            }
        }
        return null;
    }

    String getJson(){
        String result = new String();
        for (String studentsId: attendedId
             ) {
            result = result + studentsId+";";
        }
        return result;
    }

    void print(){
        System.out.println("Group id : "+ group.getId());
        for (String id: attendedId
                ) {
            System.out.println(id);
        }
        System.out.print("JSON : "  + getJson());
        System.out.println("");
    }
*/

}
