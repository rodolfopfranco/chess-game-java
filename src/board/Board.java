package board;

public class Board {
	private int rows;
	private int columns;
	private Piece[][] pieces;
	
	public Board (int rows, int columns){
		this.rows = rows;
		this.columns = columns;
		this.pieces = new pieces[rows][columns];
	}
	
	public Piece piece(int row, int columns) {
	}
	
	public Piece piece(Position position) {
	}
	
	public void placePiece(Piece piece, Position position) {
	}
	
	public Piece removePiece(Position position) {
		
	}
	
	public boolean positionExists (Position position) {
		
	}
	
	public boolean isThereAPiece (Position position) {
		
	}
}
