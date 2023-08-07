package movie;

public class Movie {
	
	String movieName;
	int price;
	int age;
	int money;
	double rate;
	String way;
	
	public Movie(String movieName, int price, int age, String way) {
		this.movieName = movieName;
		this.price = price;
		this.age = age;
		this.way = way;
	}

	
	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public String getWay() {
		return way;
	}

	public void setWay(String way) {
		this.way = way;
	}
	
	
}
