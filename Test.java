public class Test {
	
	 public static void main(String argv[])
	 {
	 Test t = new Test();
	 t.first();
	 }
	 public void first()
	 {
	int i = 5;
	 Value v = new Value();
	v.i = 25;
	System.out.println(v.i);
	 second(v, i);
	 System.out.println(v.i);
	 }
	 public void second(Value v, int i)
	 {
	 i = 0;
      //v.i = 20;
	  Value val = new Value();
	  System.out.println(val.i);
	   v = val;
	 System.out.println(v.i + " " + i);
	 }
	}