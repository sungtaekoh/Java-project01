 package TwentyOneGame;

import java.util.Random;
import java.util.Scanner;

//21게임
public class Ex02 { 

	public static void main(String[] args) {
		
		  Scanner input = new Scanner(System.in);
		 
		String answer = null;
    Card userCards;
    Card computerCards;

		System.out.println("게임을 시작하겠습니까? \n Yes!! / y \n Noooo!! / n");

		answer = input.next();
		if(answer.equals("y")) {//게임시작
			System.out.println("게임을 시작합니다");
			System.out.println("패를 섞는 중");
			countDown();
      int randomNumber = getRandomNumber();
      userCards = new Card(getRandomNumber(), getRandomNumber());

			System.out.println("당신의 첫번째 카드 : "+userCards.card1);
			System.out.println("당신의 두번째 카드 : "+userCards.card2);
			int userSum = userCards.card1+userCards.card2;
			System.out.println("합계 : "+userSum);
      computerCards = new Card(getRandomNumber(), getRandomNumber());
			countDown();
			System.out.println("상대방의 첫번쨰 카드 : "+computerCards.card1);
			System.out.println("상대방의 첫번쨰 카드 : "+computerCards.card2);
			int comSum = computerCards.card1+computerCards.card2;
			System.out.println("합계 : "+comSum);
			if(userSum > comSum) {
				System.out.println("당신의 승리 !!");
			}else if(userSum<comSum) {
				System.out.println("당신의 패배!!");
			} else {
				System.out.println("무승부~!!!");
			}
		}else if(answer.equals("n")) {//게임 종료
			System.out.println("게임을 종료합니다");
		}else {//잘 못 입력
			System.out.println("잘 못 입력하셨습니다");
		}
	}


   static int getRandomNumber() {
    Random rd = new Random();
    return  rd.nextInt(10)+1;
  }

  static void countDown() {
    try {
        for(int i =3;i>=1;i--) {
          Thread.sleep(1000);
          System.out.println(i);
        }
      }catch(Exception e) {
        
        System.out.println(e);
      }
  }


  

}
class Card {
  public int card1;
  public int card2;

  public Card(int card1, int card2) { 
    this.card1 = card1;
    this.card2 = card2;

  }
  
}
