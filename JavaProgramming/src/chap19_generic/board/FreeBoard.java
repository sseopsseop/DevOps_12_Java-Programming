package chap19_generic.board;

public class FreeBoard {
	private int freeBoardNo;
	private String freeBoatdTitle;
	
	
	public FreeBoard() {
		super();
	}
	public FreeBoard(int freeBoardNo, String freeBoatdTitle) {
		super();
		this.freeBoardNo = freeBoardNo;
		this.freeBoatdTitle = freeBoatdTitle;
	}
	public int getFreeBoardNo() {
		return freeBoardNo;
	}
	public void setFreeBoardNo(int freeBoardNo) {
		this.freeBoardNo = freeBoardNo;
	}
	public String getFreeBoatdTitle() {
		return freeBoatdTitle;
	}
	public void setFreeBoatdTitle(String freeBoatdTitle) {
		this.freeBoatdTitle = freeBoatdTitle;
	}
	@Override
	public String toString() {
		return "FreeBoard [freeBoardNo=" + freeBoardNo + ", freeBoatdTitle=" + freeBoatdTitle + "]";
	}
	
	
}
