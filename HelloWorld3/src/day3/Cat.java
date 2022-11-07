package day3;

public class Cat {
 
	 // 캡슐화(Encapsulation)
     private String name; //이름
     private int age; // 고양이 나이
     String sex; // 고양이 성별
     
     
     //Source - > Generate -> Getter and Setter
     
     public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
     
     
     
     //생성자 만들기
     //고양이 이름(name)을 매개변수로 해서 
     //입력받은 이름을 멤버 필드에 대입
     
     public Cat(String name) {
    	 this.name = name;   //this를 써야 name이 위의 멤버변수 name에 대입됨
     }
   
    //고양이 나이(age)를 매개변수로 해서
    // 입력받은 나이를 멤버 필드에 대입
     

	public Cat(int age) {
    	 this.age = age;
     }
     
     
    
     }


