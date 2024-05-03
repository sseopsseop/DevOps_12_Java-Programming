package chap11_abstraction;

import chap11_abstraction.board.Board;
import chap11_abstraction.board.FreeBoard;
import chap11_abstraction.board.NoticeBoard;

public class _02_AbstractBoard {
	
	public static void main(String[] args) {
		Board board = new FreeBoard(1, "안녕하세요", "자바 어려워요", "고기천", "2024-05-02", "첨부파일1");
		board.post();
		board.modify();
		board.delete();
		
		board = new NoticeBoard(1, "안녕하세요", "공지사항", "관리자", "2024-05-02", false);
		board.post();
		board.modify();
		board.delete();
	}

}
