package com.cksrn.dao;

import java.util.List;

import com.cksrn.domain.BoardVO;

public interface BoardDAO {
	
	// 글 목록
	public List<BoardVO> getBoardList(BoardVO vo) ;
	// 글 쓰기
	public void insertBoard(BoardVO vo);
	// 글 삭제
	public void deleteBoard(BoardVO vo);
	//글 목록 상세조회
	public BoardVO getBoard(BoardVO vo);
	//글 업데이트
	public void updateBoard(BoardVO vo);
}
