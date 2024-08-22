class Student{
    int id;
    String name;
}

public class Xstudents {
    public static void main(String[] args) {
        Student st1 = new Student();
        st1.id=4;
        st1.name="Moshiur";

        Student st2 = new Student();
        st2.id=5;
        st2.name="Sakib";

        Student st3 = new Student();
        st3.id=67;
        st3.name="Rakib";

        Student students[] = new Student[3];
        students[0]=st1;
        students[1]=st2;
        students[2]=st3;

        for(Student s:students){
            System.out.println(s.id+":"+s.name);
        }
    }
}
