package t50_Exercise.t00;

public class Child implements LunchMenu {
	int price = 0;
	String name = "";
	
	@Override
	public void rice() {
		 name = "쌀밥";
		 price = 500;
	}

	@Override
	public void bulgogi() {
		name = "불고기";
		price = 2000;
	}

	@Override
	public void dubu() {
		name = "두부조림";
		price = 1000;
	}

	@Override
	public void miyeok( ) {
		name = "미역국";
		price = 1000;
	}

	@Override
	public void yoplait( ) {
		name = "요플레";
		price = 800;
	}

	@Override
	public void banana( ) {
		name = "바나나";
		price = 500;
	}

	@Override
	public void milk( ) {
		name = "우유";
		price = 500;
	}

	@Override
	public void almond( ) {
		name = "아몬드";
		price = 700;
	}
	
	public void bill() {
		System.out.println(name + " : "+ price);
	}

}
