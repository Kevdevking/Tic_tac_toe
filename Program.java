package application;

import java.util.Scanner;

public class Program {
	
	static void drawBoard(char board[][]) {
		
		for (int i=0; i<board.length; i++) {
			System.out.print(" ")
			for (int j=0; j<board[i].length; j++) {
				if (j != 2) {
					System.out.print(+ board[i][j] + " | ");
				} else {
					System.out.println(board[i][j]);
				}				
			}
			if (i != 2) {
				System.out.println("------------");
			}
		}
	}
	
	static void oTurn(char board[][]) {
		Scanner sc1 = new Scanner(System.in);
		
		System.out.println("'O's turn, pick a position (1-9)");
		int pickO = sc1.nextInt();
		switch (pickO) {
		case 1:
			
			if (board[0][0] == ' ')
				board[0][0] = 'O';
			else {
				System.out.print("Invalid move, try again: ");
				oTurn(board);
			}
			break;
			
		case 2:
			if (board[0][1] == ' ')
				board[0][1] = 'O';
			else {
				System.out.print("Invalid move, try again: ");
				oTurn(board);
			}
			break;
			
		case 3:
			if (board[0][2] == ' ')
				board[0][2] = 'O';
			else {
				System.out.print("Invalid move, try again: ");
				oTurn(board);
			}
			break;
			
		case 4:			
			if (board[1][0] == ' ')
				board[1][0] = 'O';
			else {
				System.out.print("Invalid move, try again: ");
				oTurn(board);
			}
			break;
			
		case 5:
			if (board[1][1] == ' ')
				board[1][1] = 'O';
			else {
				System.out.print("Invalid move, try again: ");
				oTurn(board);
			}
			break;
			
		case 6:
			if (board[1][2] == ' ')
				board[1][2] = 'O';
			else {
				System.out.print("Invalid move, try again: ");
				oTurn(board);
			}
			break;
			
		case 7:
			if (board[2][0] == ' ')
				board[2][0] = 'O';
			else {
				System.out.print("Invalid move, try again: ");
				oTurn(board);
			}
			break;
			
		case 8:
			if (board[2][1] == ' ')
				board[2][1] = 'O';
			else {
				System.out.print("Invalid move, try again: ");
				oTurn(board);
			}
			break;
			
		case 9:
			if (board[2][2] == ' ')
				board[2][2] = 'O';
			else {
				System.out.print("Invalid move, try again: ");
				oTurn(board);
			}
			break;
		}
	}
		static void xTurn (char board[][]) {
			Scanner sc2 = new Scanner(System.in);
			
			System.out.println("'X's turn, pick a position (1-9)");
			int pick = sc2.nextInt();
			
			switch (pick) {
			case 1:
				
				if (board[0][0] == ' ')
					board[0][0] = 'X';
				else {
					System.out.print("Invalid move, try again: ");
					xTurn(board);
				}
				break;
				
			case 2:
				if (board[0][1] == ' ')
					board[0][1] = 'X';
				else {
					System.out.print("Invalid move, try again: ");
					xTurn(board);
				}
				break;
				
			case 3:
				if (board[0][2] == ' ')
					board[0][2] = 'X';
				else {
					System.out.print("Invalid move, try again: ");
					xTurn(board);
				}
				break;
				
			case 4:			
				if (board[1][0] == ' ')
					board[1][0] = 'X';
				else {
					System.out.print("Invalid move, try again: ");
					xTurn(board);
				}
				break;
				
			case 5:
				if (board[1][1] == ' ')
					board[1][1] = 'X';
				else {
					System.out.print("Invalid move, try again: ");
					xTurn(board);
				}
				break;
				
			case 6:
				if (board[1][2] == ' ')
					board[1][2] = 'X';
				else {
					System.out.print("Invalid move, try again: ");
					xTurn(board);
				}
				break;
				
			case 7:
				if (board[2][0] == ' ')
					board[2][0] = 'X';
				else {
					System.out.print("Invalid move, try again: ");
					xTurn(board);
				}
				break;
				
			case 8:
				if (board[2][1] == ' ')
					board[2][1] = 'X';
				else {
					System.out.print("Invalid move, try again: ");
					xTurn(board);
				}
				break;
				
			case 9:
				if (board[2][2] == ' ')
					board[2][2] = 'X';
				else {
					System.out.print("invalid move, try again:");
					xTurn(board);
				}
				break;
			}
			
		}
		
		public static String verifier(char[][] board ) {
			
			String winner = "DRAW";
			if (board[0][0] == board[0][1] && board[0][0] == board[0][2] && board[0][0] != ' ') {
				if (board[0][0] == 'X')
					winner = "THE WINNER IS X";
				if (board[0][0] == 'O')
					winner = "THE WINNER IS O";
			}
			if (board[1][0] == board[1][1] && board[1][0] == board[1][2] && board[1][0] != ' ') {
				if (board[1][0] == 'X')
					winner = "THE WINNER IS X";
				if (board[1][0] == 'O')
					winner = "THE WINNER IS O";
			}
			if (board[2][0] == board[2][1] && board[2][0] == board[2][2] && board[2][0] != ' ') {
				if (board[2][0] == 'X')
					winner = "THE WINNER IS X";
				if (board[2][0] == 'O')
					winner = "THE WINNER IS O";
			}
			if (board[0][0] == board[1][0] && board[0][0] == board[2][0] && board[0][0] != ' ') {
				if (board[0][0] == 'X')
					winner = "THE WINNER IS X";
				if (board[0][0] == 'O')
					winner = "THE WINNER IS O";
			}
			if (board[0][1] == board[1][1] && board[0][1] == board[2][1] && board[0][1] != ' ') {
				if (board[0][1] == 'X')
					winner = "THE WINNER IS X";
				if (board[0][1] == 'O')
					winner = "THE WINNER IS O";
			}
			if (board[0][2] == board[1][2] && board[0][2] == board[2][2] && board[0][2] != ' ') {
				if (board[0][2] == 'X')
					winner = "THE WINNER IS X";
				if (board[0][2] == 'O')
					winner = "THE WINNER IS O";
			}
			if (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[2][2] != ' ') {
				if (board[0][0] == 'X')
					winner = "THE WINNER IS X";
				if (board[0][0] == 'O')
					winner = "THE WINNER IS O";
			}
			if (board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[0][2] != ' ') {
				if (board[0][2] == 'X')
					winner = "THE WINNER IS X";
				if (board[0][2] == 'O')
					winner = "THE WINNER IS O";
			}
			
			return winner;
		}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		char[][] board = new char[3][3];
		String winner = "ITS A DRAW!";
		
		System.out.println("Lets play TIC-TAC-TOE!");
		
		drawBoard(board);		
		for (int i=0; i<board.length; i++) {
			for (int j=0; j<board[i].length; j++) {
				board[i][j] = ' ';
			}
		}
		int i = 0;
		boolean over = false;
		do {
			if (i % 2 == 0) {
				
				xTurn(board);		
			} else {
					
				oTurn(board);					
			}
			
			drawBoard(board);
			winner = verifier(board);
			
			if (winner != "DRAW")				
				over = true;
			
			i++;
		} while (over == false && i<9);
		
		System.out.println();
		System.out.println(winner);
		sc.close();
	}
}

