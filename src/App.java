import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Schedules> schedule = new ArrayList<Schedules>();

        Schedules temp1= new Schedules("Ms. Lapan","English III");
        schedule.add(temp1);
        temp1= new Schedules("Mrs. Gideon","Precalculus");
        schedule.add(temp1);
        temp1= new Schedules("Mr. Davis"," Music Theory");
        schedule.add(temp1);
        temp1= new Schedules("Ms. Palmer","Biotechnology");
        schedule.add(temp1);
        temp1= new Schedules("Ms. Garcia","Principles of Technology I");
        schedule.add(temp1);
        temp1= new Schedules("Mrs. Barnett","Latin II");
        schedule.add(temp1);
        temp1= new Schedules("Ms. Johannessen","AP US History ");
        schedule.add(temp1);
        temp1= new Schedules("Mr. James","Business Computer Infomation Systems");
        schedule.add(temp1);

        for (int i = 0; i < schedule.size();i++){
            System.out.println ((i+1) + "|" + "\t" +
                schedule.get(i).getTeacherName() +
                " |" + "\t" + schedule.get(i).getTopic());
        }
    }
}
