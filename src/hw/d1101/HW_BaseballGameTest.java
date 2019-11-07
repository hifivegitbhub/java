package hw.d1101;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class BaseballGame {
	private static final int ROUND_COUNT, PITCH_COUNT, WIN_STRIKE_COUNT;
	private int[] computerNumberArr;
	private int[] userInNumberArr;
	private int randomNum;
	private int strike;
	private int ball;
	private Random num;
	private Scanner sc;

	public BaseballGame() {
		num = new Random(System.currentTimeMillis());
		sc = new Scanner(System.in);
		initialize();
	}

	static {
		PITCH_COUNT = 3;
		ROUND_COUNT = 9;
		WIN_STRIKE_COUNT = 3;
	}

	private void initialize() {
		computerNumberArr = new int[PITCH_COUNT];
		userInNumberArr = new int[PITCH_COUNT];
		strike = 0;
		ball = 0;
		setTargetNumberArr();
	}

	public boolean start() {
		outloop: while (true) {
			boolean gameResult = play();

			if (gameResult) {
				System.out.println("승리하셨습니다!!!");
			} else {
				System.out.printf("야구게임 번호는: %s 입니다.\n", Arrays.toString(computerNumberArr));
				System.out.print("패배했습니다.. ㅠㅠ\n");
			}

			System.out.print("다시 하시겠습니까? ex) Y or N\n");
			while (true) {
				String gameContinue = sc.nextLine();
				if ("N".equalsIgnoreCase(gameContinue)) {
					break outloop;
				} else if (!"Y".equalsIgnoreCase(gameContinue)) {
					System.out.println("Y 또는 N을 입력해 주세요.");
				} else {
					initialize();
					break;
				}
			}
		}
		System.out.println("이용해 주셔서 감사합니다!");
		sc.close();
		return true;
	}

	private boolean play() {
		System.out.println("야구게임 시작합니다!!!");
		System.out.println("1회 3번, 총 9회 숫자를 입력해 주세요. ex) 1~9");
		boolean gameResult = false;

		for (int i = 1; i <= ROUND_COUNT; i++) {
			setUserNumberArr();
			calculateStrikeAndBall();
			System.out.printf("%d회말\t스트라이크:%d\t볼:%d\n", i, strike, ball);

			if (strike == WIN_STRIKE_COUNT) {
				gameResult = true;
				break;
			}

			strike = 0;
			ball = 0;
		}
		return gameResult;
	}

	private void calculateStrikeAndBall() {
		for (int k = 0; k < PITCH_COUNT; k++) {
			if (computerNumberArr[k] == userInNumberArr[k]) {
				strike++;
			} else {
				for (int j = 0; j < PITCH_COUNT; j++) {
					if (computerNumberArr[j] == userInNumberArr[k]) {
						ball++;
						break;
					}
				}
			}
			userInNumberArr[k] = 0;
		}
	}

	private void setUserNumberArr() {
		int userInNumber = 0;

		for (int j = 0; j < PITCH_COUNT; j++) {
			System.out.printf(" %d회:", j + 1);
			try {
				userInNumber = Integer.parseInt(sc.nextLine());
				if (isValidNumber(userInNumber, j)) {
					userInNumberArr[j] = userInNumber;
				} else {
					System.out.println("회별로 다른 1~9 사이의 숫자를 입력해 주세요.");
					j--;
				}
			} catch (Exception e) {
				System.out.println("숫자만 입력해 주세요.");
				j--;
			}
		}
	}

	private int getNewRandomNumber() {
		return num.nextInt(9) + 1;
	}

	private boolean isValidNumber(int userInNo, int currentRound) {
		boolean result = false;

		if (userInNo > 0 && userInNo < 11) {
			for (int i = 0; i <= currentRound; i++) {
				if (userInNumberArr[i] == userInNo) {
					result = false;
					break;
				} else {
					result = true;
				}
			}
		}

		return result;
	}

	private void setTargetNumberArr() {
		randomNum = getNewRandomNumber();
		for (int j = 0; j < PITCH_COUNT; j++) {
			for (int i = 0; i <= j; i++) {
				if (computerNumberArr[i] == randomNum) {
					randomNum = getNewRandomNumber();
					i = -1;
				}
			}
			computerNumberArr[j] = randomNum;
			randomNum = getNewRandomNumber();
		}
		System.out.println("게임번호: " + Arrays.toString(computerNumberArr));
	}

}

public class HW_BaseballGameTest {

	public static void main(String[] args) {
		if (new BaseballGame().start()) {
			System.exit(0);
		}
	}

}
