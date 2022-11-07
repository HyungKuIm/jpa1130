package day2;

public class PersonTestMain {

	public static void main(String[] args) {
		Person person = new Person();
		person.id = 1;
		person.name = "최정";
		person.teamName = "SSG";
		person.sex = "남자";

		System.out.println("아이디: " + person.id);
		System.out.println("이름: " + person.name);
		System.out.println("팀명: " +person.teamName);
		System.out.println("성별: " +person.sex);
		
		person.homerun();

	}

}
