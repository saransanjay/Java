 public class StaticTesting {
	    static int staticVariable;
	    int nonStaticVariable;
	    void Static(){
	    	System.out.println(staticVariable);
	    }
	    void NonStatic() {
	    	System.out.println(nonStaticVariable);
	    }
	    @SuppressWarnings("static-access")
		public static void main(String args[]) {
	    	StaticTesting st =new StaticTesting();
	    	st.staticVariable = 10;
	    	st.nonStaticVariable =10;
	    	st.Static();
	    	st.NonStatic();
	    	StaticTesting st1 =new StaticTesting();
	    	st1.Static();
	    	st1.NonStatic();
	    	
	    }
	}

