package RockPaperScissors;
import java.util.Random;
import java.util.Scanner;

public class Ex01 {
 public static void main(String[] args) {
	//���������� ����
	 Scanner input = new Scanner(System.in);
	 Random random = new Random();
	 int n = 0;
	 int i =0 ;
	 System.out.println("1. ���� ����");
	 System.out.println("2. ���� ����");
	 n = input.nextInt();
	 if( n == 1) {//���� ����
		 while(true) {
		 System.out.println("1. ���� 2. ���� 3.��");
		 int player1 = input.nextInt();
		 i = random.nextInt(3);
		 if(player1 == 1){//����
			 System.out.println("������ ���̽��ϴ�");
			 if(i == 0) {
				 System.out.println("������ ���� �½��ϴ�");
				 System.out.println("����� �¸�!!");
			 }else if(i == 1) {
				 System.out.println("������ ������ �½��ϴ�");
				 System.out.println("�����ϴ�!");
			 }else if(i ==2 ) {
				 System.out.println("������ ������ �½��ϴ�");
				 System.out.println("����� �й�!!");
			 }
		 }else if(player1 == 2) {//����
			 System.out.println("������ ���̽��ϴ�");
			 if(i == 0) {
				 System.out.println("������ ���� �½��ϴ�");
				 System.out.println("����� �й�!!");
			 }else if(i == 1) {
				 System.out.println("������ ������ �½��ϴ�");
				 System.out.println("����� �¸�!!");
			 }else if(i ==2 ) {
				 System.out.println("������ ������ �½��ϴ�");
				 System.out.println("�����ϴ�!!");
			 }
		 }else if(player1 ==3 ) {//��
			 System.out.println("���� ���̽��ϴ�");
			 if(i == 0) {
				 System.out.println("������ ���� �½��ϴ�");
				 System.out.println("�����ϴ�!!");
			 }else if(i == 1) {
				 System.out.println("������ ������ �½��ϴ�");
				 System.out.println("����� �й�!!");
			 }else if(i ==2 ) {
				 System.out.println("������ ������ �½��ϴ�");
				 System.out.println("����� �¸�!!");
			 }
		 }else {
			 System.out.println("�� �� �����̽��ϴ� �ٽ� �����ּ���");
		 }
		 }
	 }else if(n == 2){//���� ����
		 System.out.println("������ ���� �˴ϴ�");
	 }else {//����
		 System.out.println("�� �� �����̽��ϴ�");
	 }
	 
}
}
