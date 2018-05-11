package org.kosta.spider.model;

import java.util.List;

public interface BoardDao {
  public List<BoardVo> readAllBoardList();
  
  public int getTotalCount();
  
  public List<BoardVo> getPagingList(PagingBean pb);
}
