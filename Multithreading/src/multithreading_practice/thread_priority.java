package multithreading_practice;

public class thread_priority {
    public static void main(String[] args) {
    	
    	//MIN_PRIORITY=1
    	//NORM_PRIORITY=5
    	//MAX_PRIORITY=10
    	//default priority is NORM_PRIORITY=5
        
    	
        MyThr1 t1 = new MyThr1("Thread__1");
        MyThr1 t2 = new MyThr1("Thread__2");
        MyThr1 t3 = new MyThr1("Thread__3");
      
       
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
       
        
        t1.start();
        t2.start();
        t3.start();

    }	
}

class MyThr1 extends Thread{
    public MyThr1(String name){
        super(name);
    }
    public void run(){
//        int i = 34;

        while(true){
//            System.out.println("I am a thread");
            System.out.println("Running thread : " + this.getName());
           
            
        }

    }
}
