public class FinalTesting {
	 
		    final int finalVariable =10;
		    int nonfinalVariable;
		    void Final(){
		    	System.out.println(finalVariable);
		    }
		    void NonFinal() {
		    	System.out.println(nonfinalVariable);
		    }
			public static void main(String args[]) {
		    	FinalTesting ft =new FinalTesting();
		    	ft.nonfinalVariable =10;
		    	ft.Final();
		    	ft.NonFinal();
		    	FinalTesting ft1 =new FinalTesting();
		    	ft1.Final();
		    	ft1.NonFinal();
		    	
		    }
}
