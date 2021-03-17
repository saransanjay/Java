public class Main {
	public static void main(String args[]) {
   Test1 test1 = new Test1(); 
   Test2 test2 = new Test2(); 
   //Interrupt Function
   test1.interrupt();
   test2.interrupt();
   //IsInterrupt Function
   System.out.println(test1.isInterrupted());
   System.out.println(test2.isInterrupted());
   //SetPriority Function
   test1.setPriority(1);
   test2.setPriority(2);
   //GetPriority Function
   System.out.println(test1.getPriority());
   System.out.println(test2.getPriority());
   //Start  And Run Function
   // test1.run();
   // test2.run(); 
   test1.start();
   test2.start();  
   //Sleep Function  
   try {
	Thread.sleep(1000);
} catch (InterruptedException e) {
	e.printStackTrace();
}
   //GetID Function
   System.out.println(test1.getId());
   System.out.println(test2.getId());
   //GetState Function
   System.out.println(test1.getState());
   System.out.println(test2.getState());
   //IsAlive Function
   System.out.println(test1.isAlive());
   System.out.println(test2.isAlive());
   //Wait Function
   try {
	test1.wait();
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

   
   
   
   
   
   
   
	}
}
