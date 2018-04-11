import javax.swing.tree.ExpandVetoException;
import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;

public class Attendance {
    ArrayList<User> students;
    ArrayList<String> attendedId;

    Attendance(ArrayList<User> students, ArrayList<String> attendedId){
        this.students = students;
        this.attendedId = attendedId;
    }



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
        for (User user: students ) {
            if(name.equals(user.getFullName())){
                return user.getId();
            }
        }
        return null;
    }

    void print(){
        for (String id: attendedId
                ) {
            System.out.println(id);
        }
        System.out.println("");
    }

    String getAllId(){
        String result = "";
        for(String id:attendedId){
            result+=id+";";
        }
        return result;
    }


}
