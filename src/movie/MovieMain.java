package movie;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MovieMain {
	
	public static void main(String[] args) {
		List<Movie> result = new ArrayList<Movie>();
		
		for(int i=0; i<3; i++) {			
			Scanner in = new Scanner(System.in);
			
			String line = in.nextLine();             //입력값 받음
			String[] lineData = line.split("\\s");   //받은 입력값 " "(공백) 기준으로 나눔
			
			Movie customer = new Movie(lineData[0], Integer.parseInt(lineData[1]), Integer.parseInt(lineData[2]), lineData[3]);  //객체 생성
			
			rateCal(customer);
			moneyCal(customer);
			
			result.add(customer);			
		}
		
		for(int i=0; i<3; i++) {
			System.out.println(result.get(i).getMovieName()+" "+result.get(i).getPrice()+" "+result.get(i).getAge()
					   +" "+result.get(i).getWay()+" "+result.get(i).getRate()+" "+result.get(i).getMoney());
		}

	}
	
	public static void rateCal(Movie vo) {
		double rate = vo.getAge()<20 ? 25  : (vo.getAge()>=20 && vo.getAge()<30 ? 20 : 15 );
		rate += vo.getWay().equals("현장") ? 0 : (vo.getWay().equals("인터넷") ? 5 : 10) ;
		vo.setRate(rate);
 	}
	
	public static void moneyCal(Movie vo) {
		int money =  (int) (vo.getPrice() * ( (100-vo.getRate())/100 ));
		vo.setMoney(money);
	}
	
	public static void dataPrint() {
		
	}

}
