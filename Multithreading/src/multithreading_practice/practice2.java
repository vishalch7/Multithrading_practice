package multithreading_practice;

public class practice2 {
	 public static void main(String[] args) {
	        MyThreadRunnable1 runnable1 = new MyThreadRunnable1();
	        Thread thr1 = new Thread(runnable1);

	        MyThreadRunnable2 runnable2 = new MyThreadRunnable2();
	        Thread thr2 = new Thread(runnable2);

	        thr1.start();
	        thr2.start();
	    }

}

class MyThreadRunnable1 implements Runnable{
    public void run(){
    	int i =0;
        while(i<40000){
            System.out.println("first thread is running------------------");
            i++;
        }
    }
}

class MyThreadRunnable2 implements Runnable{
    public void run(){
    	int i =0;
    	while(i<40000){
            System.out.println("second thread");
            i++;
    	}
    }
}
