
public class DemoMain {
	public static void main(String[] args){
		Demo demo = new Demo();
		demo.fuctionOne();
		demo.fuctionTwo(10);
		demo.fuctionThree(12, 303f);
		String var1 = demo.fuctionFour();
		System.out.println("main program" + var1);
		Employee mahima = new Employee();
		Employee raj = new Employee();
		mahima.empNo = 10;
		mahima.age = 20;
		mahima.empName= "mahima Raj";
		mahima.salary = 20000f;
		raj.empNo = 30;
		raj.age = 25;
		raj.empName= "mahii";
		raj.salary = 30000f;
		int store = demo.functionHcl(mahima,raj);
		System.out.println(store);
		
		
		
		
		
		
		}

}
