package com.cksrn.service;

import java.util.List;

import com.cksrn.domain.BoardVO;



public interface BoardService {

	// 글 목록 조회
	List<BoardVO> getBoardList(BoardVO vo);
	
	// 글 등록
	public void insertBoard(BoardVO vo);
	
	// 글 삭제
	public void deleteBoard(BoardVO vo);
	
	//글 목록 상세조회
	BoardVO getBoard(BoardVO vo);
	
	//글 업데이트
	public void updateBoard(BoardVO vo);
}
