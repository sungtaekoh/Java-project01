 package TwentyOneGame;

import java.util.Random;
import java.util.Scanner;

//21����
public class Ex02 { 

	public static void main(String[] args) {
		
		  Scanner input = new Scanner(System.in);
		 
		String answer = null;
    Card userCards;
    Card computerCards;

		System.out.println("������ �����ϰڽ��ϱ�? \n Yes!! / y \n Noooo!! / n");

		answer = input.next();
		if(answer.equals("y")) {//���ӽ���
			System.out.println("������ �����մϴ�");
			System.out.println("�и� ���� ��");
			countDown();
      int randomNumber = getRandomNumber();
      userCards = new Card(getRandomNumber(), getRandomNumber());

			System.out.println("����� ù��° ī�� : "+userCards.card1);
			System.out.println("����� �ι�° ī�� : "+userCards.card2);
			int userSum = userCards.card1+userCards.card2;
			System.out.println("�հ� : "+userSum);
      computerCards = new Card(getRandomNumber(), getRandomNumber());
			countDown();
			System.out.println("������ ù���� ī�� : "+computerCards.card1);
			System.out.println("������ ù���� ī�� : "+computerCards.card2);
			int comSum = computerCards.card1+computerCards.card2;
			System.out.println("�հ� : "+comSum);
			if(userSum > comSum) {
				System.out.println("����� �¸� !!");
			}else if(userSum<comSum) {
				System.out.println("����� �й�!!");
			} else {
				System.out.println("���º�~!!!");
			}
		}else if(answer.equals("n")) {//���� ����
			System.out.println("������ �����մϴ�");
		}else {//�� �� �Է�
			System.out.println("�� �� �Է��ϼ̽��ϴ�");
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
