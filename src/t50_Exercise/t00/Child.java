package t50_Exercise.t00;

public class Child implements LunchMenu {
	int tot = 0;
	String food = "";
	
	@Override
	public void rice(int i, String choice) { 
		if(i==0 && choice.toUpperCase().equals("Y")) {
			this.tot += 500;
			this.food += "쌀밥(추가): 500원\n";
		}
	}

	@Override
	public void bulgogi(int i, String choice) { 
		if(i==1 && choice.toUpperCase().equals("Y")) {
			this.tot += 2000;
			this.food += "불고기(추가): 2000원\n";
		}
	}

	@Override
	public void dubu(int i, String choice) {
		if(i==2 && choice.toUpperCase().equals("Y")) {
			this.tot += 1000;
			this.food += "두부조림: 1000원\n";
		}
	}

	@Override
	public void miyeok(int i, String choice) {
		if(i==3 && choice.toUpperCase().equals("Y")) {
			this.tot += 1000;
			this.food += "미역국: 1000원\n";
		}
	}

	@Override
	public void yoplait(int i, String choice) {  
		if(i==4 && choice.toUpperCase().equals("Y")) {
			this.tot += 800;
			this.food += "요플레: 800원\n";
		}
	}

	@Override
	public void banana(int i, String choice) {
		if(i==5 && choice.toUpperCase().equals("Y")) {
			this.tot += 500;
			this.food += "바나나: 500원\n";
		}
	}

	@Override
	public void milk(int i, String choice) {
		if(i==6 && choice.toUpperCase().equals("Y")) {
			this.tot += 500;
			this.food += "우유: 500원\n";
		}
	}

	@Override
	public void almond(int i, String choice) {
		if(i==7 && choice.toUpperCase().equals("Y")) {
			this.tot += 700;
			this.food += "아몬드: 700원\n";
		}
	}
}
