//class Ab implements Runnable{
//    public void run(){
//        for(int i=0;i<10;i++){
//            System.out.println("Showing "+i);
//            try {
//                Thread.sleep(100);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//    }
//}

class Ac implements Runnable{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("Mowing "+i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class Xthread {
    public static void main(String[] args) {
        Runnable ac = new Ac();
        // without lambda
//        Runnable ab = new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Hi");
//            }
//        };

        Runnable ab = ()-> {
            for(int k=0;k<10;k++) {
                System.out.println("Mo56789wing " + k);
            }
            };


        Thread t1=new Thread(ac);
        Thread t2=new Thread(ab);

        t1.start();
        t2.start();


    }
}
