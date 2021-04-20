package multithreading_practice;

public class thread_constructor {
	public static void main(String[] args) {
		MyThr t1 = new MyThr("mohan");
		MyThr t2 = new MyThr("Ram");
		t1.start();
		t2.start();
		System.out.println("The id of the thread t1 is:   " + t1.getId());
		System.out.println("The name of the thread t1 is: " + t1.getName());
		System.out.println("The id of the thread t2 is:   " + t2.getId());
		System.out.println("The name of the thread t2 is: " + t2.getName());
	}
}

class MyThr extends Thread{
    public MyThr(String name){
        super(name);
    }
    public void run(){
    	int a=23;
    	String b="EMPTY";
//        System.out.println("Thank you");
//        while(true){
//            System.out.println("this is a thread");
//        }
    }
}
