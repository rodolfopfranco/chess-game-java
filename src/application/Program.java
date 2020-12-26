package application;

import board.Board;
import board.Position;
import chess.ChessMatch;

public class Program {

	public static void main(String[] args) {
		Position pos = new Position(1,1);
		System.out.println(pos.toString());
		Board board = new Board(8,8);
		ChessMatch chessMatch = new ChessMatch();
		UI.printBoard(chessMatch.getPieces());
	}
}