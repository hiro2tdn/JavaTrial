package jp.gr.paiza;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// A009:ビームの反射
public class A009Main {

	enum Direction {
		UP, DOWN, RIGHT, LEFT
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		String[] lineArray = line.split(" ");
		int height = Integer.parseInt(lineArray[0]);
		int width = Integer.parseInt(lineArray[1]);
		char[][] beamBox = new char[height][width];

		for (int h = 0; h < height; h++) {
			String readLine = br.readLine();
			for (int w = 0; w < width; w++) {
				beamBox[h][w] = readLine.charAt(w);
			}
		}

		int count = 0;
		Direction direction = Direction.RIGHT;

		for (int h = 0, w = 0; 0 <= h && h < height && 0 <= w && w < width;) {
			count++;

			if (beamBox[h][w] == '\\') {
				switch (direction) {
				case UP:
					direction = Direction.LEFT;
					break;
				case DOWN:
					direction = Direction.RIGHT;
					break;
				case RIGHT:
					direction = Direction.DOWN;
					break;
				case LEFT:
					direction = Direction.UP;
					break;

				}

			} else if (beamBox[h][w] == '/') {
				switch (direction) {
				case UP:
					direction = Direction.RIGHT;
					break;
				case DOWN:
					direction = Direction.LEFT;
					break;
				case RIGHT:
					direction = Direction.UP;
					break;
				case LEFT:
					direction = Direction.DOWN;
					break;
				}
			}

			switch (direction) {
			case UP:
				h--;
				break;
			case RIGHT:
				w++;
				break;
			case LEFT:
				w--;
				break;
			case DOWN:
				h++;
				break;
			}
		}

		System.out.println(count);
	}
}
