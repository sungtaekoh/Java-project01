package TwentyOneGame;

import java.util.Random;
import java.util.Scanner;

//21����
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
		 * ����� �̿����� ī�尡 �������ų� �÷��̾ �þ�� �ڵ尡 �������
		 */
		
		
		System.out.println("������ �����ϰڽ��ϱ�?");
		System.out.println("Yes!! / y");
		System.out.println("Noooo!! / n");
		answer = input.next();
		if(answer.equals("y")) {//���ӽ���
			System.out.println("������ �����մϴ�");
			System.out.println("�и� ���� ��");
			try {//����̿��ϴ°ɷ� �ٲٱ�
				for(int i =3;i>=1;i--) {
					Thread.sleep(1000);
					System.out.println(i);
				}
			}catch(Exception e) {
				System.out.println(e);
			}
			userCard1 = rd.nextInt(9)+1;//���
			userCard2 = rd.nextInt(9)+1;
			System.out.println("����� ù��° ī�� : "+userCard1);
			System.out.println("����� �ι�° ī�� : "+userCard2);
			int userSum = userCard1+userCard2;
			System.out.println("�հ� : "+userSum);
			comCard1 = rd.nextInt(9)+1;//���
			comCard2 = rd.nextInt(9)+1;
			try {//���
				for(int i =3;i>=1;i--) {
					Thread.sleep(1000);
					System.out.println(i);
				}
			}catch(Exception e) {
				
				System.out.println(e);
			}
			System.out.println("������ ù���� ī�� : "+comCard1);
			System.out.println("������ ù���� ī�� : "+comCard2);
			int comSum = comCard1+comCard2; //���
			System.out.println("�հ� : "+comSum);
			if(userSum>comSum) {
				System.out.println("����� �¸� !!");
			}else if(userSum<comSum) {
				System.out.println("����� �й�!!");
			}else {
				System.out.println("���º�~!!!");
			}
		}else if(answer.equals("n")) {//���� ����
			System.out.println("������ �����մϴ�");
		}else {//�� �� �Է�
			System.out.println("�� �� �Է��ϼ̽��ϴ�");
		}
		
		//������ ���� �ؿ� �ᵵ �ǰ�, �ٸ� Ŭ������ �ۼ��ؼ� ����ص� �ȴ�
	}
}
