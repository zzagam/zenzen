package org.kosta.spider.controller;

import javax.annotation.Resource;
import org.kosta.spider.model.BoardService;
import org.kosta.spider.model.ListVo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BoardController {
  @Resource
  private BoardService boardService;
  
  /**
   * 페이징 처리 게시판 게시물. 
   * @param model 뷰에 데이터 전송 변수.
   * @param nowPage 현재페이지 받아오는 변수.
   * @return
   */
  @RequestMapping ("readBoardList.do")
  public String readPagingBoardList(Model model,String nowPage) {
    ListVo vo = boardService.getPagingList(nowPage);
    model.addAttribute("pagingList", vo);
    return "board";
  }
  
  
}
