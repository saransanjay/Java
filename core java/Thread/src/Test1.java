
public class Test1 extends Thread {
public void run()
{
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		System.out.println("interrupt");
	}
	System.out.println("test1 is running");
for(int i=0;i<=10;++i) {
	if(i%2==0){
	System.out.println(i);
	try {
		Thread.sleep(100);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	}
}

}
}
