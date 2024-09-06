package Collection;

import java.util.*;

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


    }
}
