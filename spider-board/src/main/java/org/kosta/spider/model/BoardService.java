package org.kosta.spider.model;

import java.util.List;

public interface BoardService {
  public List<BoardVo> readAllBoardList();
  
  public int getTotalCount();
  
  public ListVo getPagingList(String nowPage);
}
