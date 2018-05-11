package org.kosta.spider.model;

import java.util.List;

public class ListVo {
  private PagingBean pb;
  private List<BoardVo> list;
  
  public ListVo() {
    super();
    // TODO Auto-generated constructor stub
  }
  
  /**
   * 페이지+글자수.
   * @param pb 페이징빈.
   * @param list 한게시페이지의 게시물.
   */
  public ListVo(PagingBean pb, List<BoardVo> list) {
    super();
    this.pb = pb;
    this.list = list;
  }
  
  public PagingBean getPb() {
    return pb;
  }
  
  public void setPb(PagingBean pb) {
    this.pb = pb;
  }
  
  public List<BoardVo> getList() {
    return list;
  }
  
  public void setList(List<BoardVo> list) {
    this.list = list;
  }
  
  @Override
  public String toString() {
    return "ListVo [pb=" + pb + ", list=" + list + "]";
  }
  
  
}
