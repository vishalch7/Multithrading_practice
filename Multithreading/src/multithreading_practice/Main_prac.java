package multithreading_practice;

public class Main_prac {
	public static void main(String[] args){
		MyThread1 t1 = new MyThread1();
	    MyThread2 t2 = new MyThread2();
	    t1.start();
	    t2.start();
		System.out.println("hello");
	}

}


class MyThread1 extends Thread{
    @Override
    public void run(){
        int i =0;
        while(i<40000){
            System.out.println("first thread----------");
            i++;
        }
    }
}

class MyThread2 extends Thread{
    @Override
    public void run(){
        int i =0;
        while(i<40000){
            System.out.println("second thread");
            i++;
        }
    }
}

