package com.cksrn.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cksrn.domain.BoardVO;



@Repository("boardDAO")
public class BoardDAOImpl implements BoardDAO{
	@Autowired
	private SqlSessionTemplate mybatis;
	//글 목록
	public List<BoardVO> getBoardList(BoardVO vo) {
		System.out.println("===> Mybatis getBoardList() 호출");
		return mybatis.selectList("BoardDAO.getBoardList", vo);
	}
	//글 작성
	public void insertBoard(BoardVO vo) {
		System.out.println("===> Mybatis insertBoard() 호출");
		mybatis.insert("BoardDAO.insertBoard",vo);
	}
	//글 삭제
	public void deleteBoard(BoardVO vo) {
		System.out.println("deleteBoard() 호출");
		mybatis.delete("BoardDAO.deleteBoard",vo);
	}
	//글 목록 상세조회
	public BoardVO getBoard(BoardVO vo) {
		System.out.println("getBoard()");
		return mybatis.selectOne("BoardDAO.getBoard",vo);
	}
	//글 업데이트 
	public void updateBoard(BoardVO vo) {
		System.out.println("updateBoard()");
		mybatis.update("BoardDAO.updateBoard",vo);
	}
}