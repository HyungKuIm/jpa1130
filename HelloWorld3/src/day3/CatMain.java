package day3;

public class CatMain {

	public static void main(String[] args) {
		Cat cat1 = new Cat(1);
		Cat cat2 = new Cat("자바");		
	    
		cat1.setName("자비");
		cat2.setAge(20);
	    
	    
	    
	    System.out.println("cat1 이름:" + cat1.getName());
	    System.out.println("cat1 나이:" + cat1.getAge());
	    
	    System.out.println("cat2 이름:" + cat2.getName());
	    System.out.println("cat2 나이:" + cat2.getAge());

	}

}
