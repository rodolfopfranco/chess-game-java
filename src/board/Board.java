package board;

public class Board {
	private int rows;
	private int columns;
	private Piece[][] pieces;
	
	public Board (int rows, int columns){
		this.rows = rows;
		this.columns = columns;
		this.pieces = new Piece[rows][columns];
	}

	public int getRows() {
		return this.rows;
	}
	
	public int getColumns() {
		return this.columns;
	}
	
	public Piece piece(int row, int column) {
		return pieces[row][column];
	}
	
	public Piece piece (Position position) {
		return pieces[position.getRow()][position.getColumn()];
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
