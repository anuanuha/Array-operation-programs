package aaaa;

public class mainclass {
public static void main(String[] args) {
	 sample1 s1=new sample1();
	 s1.method();
	 sample2 s2=new sample2();
	s2.method();
}

}
class sample{
	static void method () {
		System.out.println("superclass");
	}
}
class sample1 extends sample{
	static void method () {
		System.out.println("subclass 1");

	}
}
class sample2 extends sample {
	static void method () {
		System.out.println("subclass 2");

	
	}
}



