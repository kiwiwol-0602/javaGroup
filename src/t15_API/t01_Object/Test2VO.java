package t15_API.t01_Object;

//toString
public class Test2VO { //VO로 만들때 G/S 할때 toString 으로 확인하기
	private String name;
	private int age;
	private boolean gender;
	private String job;
	private String address;
	
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
	public boolean IsGender() { //논리형은 IS
		return gender;
	}
	public void setGender(boolean gender) { 
		this.gender = gender;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override // 소스에도 있습니당 단축키 있음
	public String toString() {
		return "Test2VO [name=" + name + ", age=" + age + ", gender=" + gender + ", job=" + job + ", address=" + address
				+ "]";
	}
	
//	@Override
//	public String toString() { //주소를 찍는데 사용하지 않고, 오버라이드해서 데이터가 가지고 있는 값으로 사용할 수 있게 사용함
//		return "Test2[name="+name+", age="+age+", gender="+gender+", job="+job+", address=" + address+"]";
//	}
	
	
	
}
