package TwentyOneGame;

import java.util.Random;
import java.util.Scanner;

//21게임
public class Ex01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random rd = new Random();
		String answer = null;
		int userCard1 = 0;
		int userCard2 = 0;
		int comCard1 = 0;
		int comCard2 = 0;
		/*
		 * 펑션을 이용하자 카드가 많아지거나 플레이어가 늘어나면 코드가 길어진다
		 */
		
		
		System.out.println("게임을 시작하겠습니까?");
		System.out.println("Yes!! / y");
		System.out.println("Noooo!! / n");
		answer = input.next();
		if(answer.equals("y")) {//게임시작
			System.out.println("게임을 시작합니다");
			System.out.println("패를 섞는 중");
			try {//펑션이용하는걸로 바꾸기
				for(int i =3;i>=1;i--) {
					Thread.sleep(1000);
					System.out.println(i);
				}
			}catch(Exception e) {
				System.out.println(e);
			}
			userCard1 = rd.nextInt(9)+1;//펑션
			userCard2 = rd.nextInt(9)+1;
			System.out.println("당신의 첫번째 카드 : "+userCard1);
			System.out.println("당신의 두번째 카드 : "+userCard2);
			int userSum = userCard1+userCard2;
			System.out.println("합계 : "+userSum);
			comCard1 = rd.nextInt(9)+1;//펑션
			comCard2 = rd.nextInt(9)+1;
			try {//펑션
				for(int i =3;i>=1;i--) {
					Thread.sleep(1000);
					System.out.println(i);
				}
			}catch(Exception e) {
				
				System.out.println(e);
			}
			System.out.println("상대방의 첫번쨰 카드 : "+comCard1);
			System.out.println("상대방의 첫번쨰 카드 : "+comCard2);
			int comSum = comCard1+comCard2; //펑션
			System.out.println("합계 : "+comSum);
			if(userSum>comSum) {
				System.out.println("당신의 승리 !!");
			}else if(userSum<comSum) {
				System.out.println("당신의 패배!!");
			}else {
				System.out.println("무승부~!!!");
			}
		}else if(answer.equals("n")) {//게임 종료
			System.out.println("게임을 종료합니다");
		}else {//잘 못 입력
			System.out.println("잘 못 입력하셨습니다");
		}
		
		//펑현은 메인 밑에 써도 되고, 다른 클래스에 작성해서 사용해도 된다
	}
}
