package demo;

@FunctionalInterface
public interface MyInterface {

	public void myAbstractMethod();
	
	public default void myDefaultMethod() {
		System.out.println("myDefaultMethod");
	}
	
	public static void myStaticMethod() {
		System.out.println("myStaticMethod");
	}
	
}
