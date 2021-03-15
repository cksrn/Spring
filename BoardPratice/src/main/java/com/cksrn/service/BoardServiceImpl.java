package com.cksrn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cksrn.dao.BoardDAOImpl;
import com.cksrn.domain.BoardVO;


@Service("boardService")
public class BoardServiceImpl implements BoardService {
	@Autowired
	private BoardDAOImpl boardDAO;
	//글목록
	public List<BoardVO> getBoardList(BoardVO vo) {
		return boardDAO.getBoardList(vo);
	}
	//글 작성
	public void insertBoard(BoardVO vo) {
		boardDAO.insertBoard(vo);
	}
	//글 삭제
	public void deleteBoard(BoardVO vo) {
		boardDAO.deleteBoard(vo);
	}
	
	//글 목록 상세조회
	public BoardVO getBoard(BoardVO vo) {
		return boardDAO.getBoard(vo);
	}
	//글 업데이트
	public void updateBoard(BoardVO vo) {
		boardDAO.updateBoard(vo);
	}
}