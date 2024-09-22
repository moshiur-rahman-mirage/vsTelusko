package Collection;

import java.util.*;

class Students{
    String name;
    int age;


    public Students(String name,int age){
        this.age=age;
        this.name=name;
    }

    @Override
    public String toString() {
        return "Students{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

public class Xlist {
    public static void main(String[] args) {

        Comparator<Integer> com = new Comparator<Integer>() {
            @Override
            public int compare(Integer i, Integer j) {
                if (i % 10 > j % 10) {
                    return 1;
                }
                 else {
                    return -1;
                }
            }
        };


        Comparator<String> stringComparator = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                if(s1.length()>s2.length()){
                    return 1;
                }else {
                    return -1;
                }
            }
        };




        Comparator<Students> studentsComparator = new Comparator<Students>() {
            @Override
            public int compare(Students o1, Students o2) {
                if(o1.age>o2.age){
                    return 1;
                }else{
                    return -1;
                }
            }
        };


        List<Integer> nums = new ArrayList<Integer>();
        nums.add(41);
        nums.add(72);
        nums.add(29);
        Collections.sort(nums,com);
        System.out.println(nums);

        List<String> stringList = new ArrayList<String>();
        stringList.add("a");
        stringList.add("aa");
        stringList.add("aaaaa");
        stringList.add("aaa");

        Collections.sort(stringList,stringComparator);
        System.out.println(stringList);


        List<Students> studentsList = new ArrayList<Students>();
        studentsList.add(new Students("Rakib",19));
        studentsList.add(new Students("Sabbir",20));
        studentsList.add(new Students("Bashar",24));
        studentsList.add(new Students("Habib",22));

        Collections.sort(studentsList,studentsComparator);
        System.out.println(studentsList);

    }
}
