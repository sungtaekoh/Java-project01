package RockPaperScissors;

import java.util.Random;
import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		System.out.println("���� ���� �� ����");
		System.out.println("1.�ָ� 2.���� 3.��");
		System.out.println("���ڸ� �Է��ϼ��� : ");
		int com =0;
		int user = sc.nextInt();
		com = r.nextInt(3)+1;
		//0~2 �� �ϳ��� ������ ������ +1�� �ؼ� 1~3�� ������ ��
		
//		System.out.println("����"+user);
//		System.out.println("��ǻ��"+com);
		
		if(user == 1) {
			if(com ==2 ) {
				System.out.println("�¸�");
			}
			else if (com ==3) {
				System.out.println("�й�");
			}
			else {
				System.out.println("���º�");
			}
		}
		else if(user == 2) {
			if(com == 2) {
				System.out.println("���º�");
			}
			else if (com == 3) {
				System.out.println("�¸�");
			}
			else {
				System.out.println("�й�");
			}
		}
		else if(user ==3){
			if(com ==2) {
				System.out.println("�й�");
			}
			else if(com ==3) {
				System.out.println("���º�");
			}
			else {
				System.out.println("�¸�");
			}
		}
		else {
			System.out.println("�ٽ� �Է����ּ���");
		}
		sc.close();
	}

}
