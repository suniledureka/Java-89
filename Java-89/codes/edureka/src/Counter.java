
class Counter
{
  static int n = 10;
  void inc(){
     n = n + 1;
  }
  public static void main(String[] args){
     Counter obj1 = new Counter();
     Counter obj2 = new Counter();
     Counter obj3 = new Counter();

     obj1.inc();
     obj2.inc();
     obj3.inc();

     System.out.println(obj1.n);
     System.out.println(obj2.n);
     System.out.println(obj3.n);
  }
  static {
	  System.out.println("inside static block");
  }
}

