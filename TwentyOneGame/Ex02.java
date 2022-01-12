package TwentyOneGame;

import java.util.Random;
import java.util.Scanner;

//21게임
public class Ex02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random rd = new Random();
		String answer = null;
		int userCard1 = 0;
		int userCard2 = 0;
		
		int comCard1 = 0;
		int comCard2 = 0;
		
		
		System.out.println("게임을 시작하겠습니까?");
		System.out.println("Yes!! / y");
		System.out.println("Noooo!! / n");
		answer = input.next();
		if(answer.equals("y")) {//게임시작
			System.out.println("게임을 시작합니다");
			System.out.println("패를 섞는 중");
			try {
				for(int i =3;i>=1;i--) {
					Thread.sleep(1000);
					System.out.println(i);
				}
			}catch(Exception e) {
				System.out.println(e);
			}
			userCard1 = rd.nextInt(9)+1;
			userCard2 = rd.nextInt(9)+1;
			System.out.println("당신의 첫번째 카드 : "+userCard1);
			System.out.println("당신의 두번째 카드 : "+userCard2);
			int userSum = userCard1+userCard2;
			System.out.println("합계 : "+userSum);
			comCard1 = rd.nextInt(9)+1;
			comCard2 = rd.nextInt(9)+1;
			try {
				for(int i =3;i>=1;i--) {
					Thread.sleep(1000);
					System.out.println(i);
				}
			}catch(Exception e) {
				
				System.out.println(e);
			}
			System.out.println("상대방의 첫번쨰 카드 : "+comCard1);
			System.out.println("상대방의 첫번쨰 카드 : "+comCard2);
			int comSum = comCard1+comCard2;
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
	}
}
