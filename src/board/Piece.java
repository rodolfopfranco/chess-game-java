package board;

public class Piece {
	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		position = null;
	}
	
	public boolean[][] possibleMoves() {
		return true;
	}
	
	public boolean possibleMove(Position position) {
		return true;
	}
	
	public boolean isThereAnyPossibleMove() {
		return true;
	}
	
	protected Board getBoard() {
		return board;
	}
}
