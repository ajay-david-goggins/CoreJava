//Single Abstract Method(sam) or Functional interface

@FunctionalInterface
interface Add {
	//working with void method	
	void add(int i, int j);
}

@FunctionalInterface
interface Sub {
	//working with void method	
	void sub(int i, int j);
}

@FunctionalInterface
interface Div{
	//working with return method		
	int div(int x, int y);
}

@FunctionalInterface
interface Mul{
	//working with return method
	int mul(int y, int z);
}
public class SAM {
	public static void main(String args[]) {
		Add objRef = (i, j) -> System.out.println("add Numbers		 " + (i + j));
		objRef.add(12, 12);


		Sub ss = (i, j) -> System.out.println("subract Numbers		 " + (i - j));
		ss.sub(12, 12);

		int multiply = 0, division = 0;

		Div dd = (x, y) ->  x / y;
		division = dd.div(12, 12);

		Mul mm = (y, z) ->  y * z;
		multiply = mm.mul(12, 12);

		System.out.println("multiple Numbers	 " + multiply);
		System.out.println("division Numbers 	 " + division);

	}
}

