public class Schedules {
    
    private String teacherName;
    private String topic;
    Schedules(String n, String t)  {
        teacherName = n;
        topic = t;
    }
    
    String getTeacherName(){return teacherName;}
    String getTopic(){return topic;}
}


