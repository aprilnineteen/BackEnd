package quiz03;
import java.util.*; //RANDOM 사용
//컴퓨터는 1<= num <101 사이의 임의의 정수를 랜덤하게 발생시킨다
//컴퓨터가 발생시킨 값을 맞추는 게임
//총 시도 횟수: 7번으로 제한
//quiz03_홍길동.zip으로 제출

public class NumberGame {
	
	public static void com(){
		System.out.println("컴퓨터가 낸 수를 맞혀 보세요. 1~100");
		Random ran=new Random();
		Scanner sc=new Scanner(System.in);
		int com=ran.nextInt(100)+1;
		int count = 1;
		for(int i=0; i<7; i++){
			int me=sc.nextInt();
		if(1<=me&&me<101)
		{if(me>com) {
				System.out.println("더 작은 수를 입력하세요.");
				count++;
		}else if(me<com) {
				System.out.println("더 큰 수를 입력하세요.");
				count++;
		}else if(me==com) {
				System.out.println(count+"번 만에 맞히셨어요.");
		}break;
		}
		if(i==6) {
			System.out.println("결국 못 맞히셨어요");
			}
		}
		System.out.println("컴퓨터의 값: "+com);
		}
	public static void main(String[] args) {
		
		NumberGame.com();
	}

}
