package part2.topdown;

public class Program {

	public static void main(String[] args) {

		int[][] lottos = null;
		int menu;
		boolean running = true;
		
		while (running) {
			menu = inputMenu();

			switch (menu) {
			case 1:
				lottos = createLottosAuto();
				break;
			case 2:
				lottos = createLottosManual();
				break;
			case 3:
				printlottos(lottos);
				break;
			case 4:
				running = false;
				break;

			default:
			}

		}

	}

	private static void printlottos(int[][] lottos) {
		// TODO Auto-generated method stub

	}
	
	private static int[][] createLottosManual() {
		// TODO Auto-generated method stub
		return null;
	}

	private static int[][] createLottosAuto() {
		// TODO Auto-generated method stub
		return null;
	}

	private static int inputMenu() {
		// TODO Auto-generated method stub
		return 0;
	}

}
