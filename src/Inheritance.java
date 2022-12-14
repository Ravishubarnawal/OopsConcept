public class Inheritance {
    public static void main(String[] args) {
        Teacher t1= new Student();
        t1.age=21;
        t1.name="Simon Shrestha";
        t1.Info();

       // t1.rollno; // this will be error because the Teacher is made reference for student,so any new
       // changes in subclass will be not allowed.
        Student s1= new Student();
        s1.rollno=45;
        s1.StudentInfo();
    }
}
class Teacher{
    String name;
    int age;
    void Info(){
        System.out.println("Name is:"+name);
        System.out.println("Age is:"+age);
    }
}
class Student extends Teacher{ // avoids multiple code writing.
     int rollno;
     void StudentInfo(){
         System.out.println("Roll no of student is:"+rollno);
     }
}