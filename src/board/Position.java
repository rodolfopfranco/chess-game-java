package board;

public class Position {
	private int row;
	private int column;
	
	public Position(int row, int column) {
		this.row = row;
		this.column = column;
	}
	
	public int getRow() {
		return row;
	}
	
	public int getColumn() {
		return column;
	}

	public void setValues (int row, int column) {
		this.row = row;
		this.column = column;
	}
	
	public String toString() {
		return "Row: " + this.row + ", Column: " + this.column;
	}
}
