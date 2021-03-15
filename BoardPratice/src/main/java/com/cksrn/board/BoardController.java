package com.cksrn.board;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cksrn.domain.BoardVO;
import com.cksrn.service.BoardService;

@Controller
public class BoardController {
	
	@Autowired
	private BoardService boardService;
	
	@RequestMapping("/{step}.do")
	public String viewPage(@PathVariable String step) {
		return step;
	}
	
		// 글 목록 검색
		@RequestMapping("/getBoardList.do")
		public String getBoardList(BoardVO vo, Model model) {
			model.addAttribute("boardList", boardService.getBoardList(vo));
			return "getBoardList"; 
		}
		
		//글 등록
		@RequestMapping("/saveBoard.do")
		public String insertBoard(BoardVO vo){
			boardService.insertBoard(vo);
			return "getBoardList";
		}
		
		//글삭제
		@RequestMapping("/deleteBoard.do")
		public String deleteBoard(BoardVO vo) {
			boardService.deleteBoard(vo);
			return "getBoardList";
		}
		//글상세조회
		@RequestMapping("/getBoard.do")
		public void getBoard(BoardVO vo, Model model) {
			model.addAttribute("board", boardService.getBoard(vo)); // Model 정보 저장			
		}
		//글 업데이트
		@RequestMapping("/updateBoard.do")
		public String updateBoard(BoardVO vo) {
			boardService.updateBoard(vo);
			return "getboardList";
		}
	}
