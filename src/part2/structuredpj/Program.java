package part2.structuredpj;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Exam[] exams = new Exam[3];

		exams[0] = new Exam();
		exams[0].kor = 30;

		int menu;
		boolean keepLoop = true;

		while (keepLoop) {
			menu = inputMenu();

			switch (menu) {
			case 1:
				inputList(exams);
				break;

			case 2:
				printList(exams);
				break;

			case 3:
				System.out.println("Bye~~");

				keepLoop = false;
				break;

			default:
				System.out.println("잘못된 값을 입력하셨습니다. 메뉴는 1~3까지 입니다 .");

			}
		}
	}

	private static void printList(Exam[] exams) {
		System.out.println("----------");
		System.out.println("성적 출력  ");
		System.out.println("----------");
		System.out.println();

		for (int i = 0; i < 3; i++) {
			Exam exam = exams[i];
			int kor = exam.kor;
			int eng = exam.eng;
			int math = exam.math;

			int total = kor + eng + math;
			float avg = total / 3.0f;

			System.out.printf("국어 : %3d\n", kor);
			System.out.printf("영어 : %3d\n", eng);
			System.out.printf("수학 : %3d\n", math);

			System.out.printf("총합  : %3d\n", total);
			System.out.printf("평균  : %6.2f\n", avg);
			System.out.println("-------------------");
		}
	}

	private static void inputList(Exam[] exams) {
		Scanner scan = new Scanner(System.in);
		System.out.println("----------");
		System.out.println("성적 입력  ");
		System.out.println("----------");
		System.out.println();

		for (int i = 0; i < 3; i++) {

			int kor, eng, math;

			do {
				System.out.printf("국어 : ");
				kor = scan.nextInt();

				if (kor < 0 || 100 < kor)
					System.out.println("국어성적은 0~100까지의 범위만 입력 가능합니다 .");

			} while (kor < 0 || 100 < kor);

			do {
				System.out.printf("영어 : ");
				eng = scan.nextInt();

				if (eng < 0 || 100 < eng)
					System.out.println("영어성적은 0~100까지의 범위만 입력 가능합니다 .");

			} while (eng < 0 || 100 < eng);

			do {
				System.out.printf("수학 : ");
				math = scan.nextInt();

				if (math < 0 || 100 < math)
					System.out.println("수학성적은 0~100까지의 범위만 입력 가능합니다 .");

			} while (math < 0 || 100 < math);

			Exam exam = new Exam();
			exam.kor = kor;
			exam.eng = eng;
			exam.math = math;

			exams[i] = exam;

		}

	}

	static int inputMenu() {
		Scanner scan = new Scanner(System.in);

		System.out.println("----------");
		System.out.println("메인 메뉴 ");
		System.out.println("----------");
		System.out.println("\t1. 성적입력  ");
		System.out.println("\t2. 성적출력  ");
		System.out.println("\t3. 종료 ");
		System.out.println("\t선택 > ");
		int menu = scan.nextInt();

		return menu;

	}

}
