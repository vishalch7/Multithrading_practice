package multithreading_practice;

public class thread_methods {
	public static void main(String[] args){
        MyNewThr1 t1 = new MyNewThr1();
//        MyNewThr2 t2 = new MyNewThr2();
        t1.start();
//        try{
//            t1.join();
//        }
//        catch(Exception e){
//            System.out.println(e);
//        }

//        t2.start();

    }
}



class MyNewThr1 extends Thread{
    public void run(){
        int i = 0;
        while(i<1000){
            System.out.println("thread 1 is running: ");
            try {
                Thread.sleep(455);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            i++;
        }
    }
}

class MyNewThr2 extends Thread{

    public void run(){
    	int i=1;
        while(i<1000){
            System.out.println("thred 2 is running ...... ");
            i++;
        }
    }
}

