package org.kosta.spider.model;

public class BoardVo {
  private int no;
  private String title;
  private String content;
  private int hits;
  private String regdate;
  private MemberVo vo;
  
  public BoardVo() {
    super();
    // TODO Auto-generated constructor stub
  }
  
  /**
   * 보드 생성자.
   * @param no 글번호. 
   * @param title 제목.
   * @param content 내용.
   * @param hits 조회수.
   * @param regdate 등록일.
   * @param mvo 멤버.
   */
  public BoardVo(int no, String title, String content, int hits, String regdate, MemberVo vo) {
    super();
    this.no = no;
    this.title = title;
    this.content = content;
    this.hits = hits;
    this.regdate = regdate;
    this.vo = vo;
  }
  
  public int getNo() {
    return no;
  }
  
  public void setNo(int no) {
    this.no = no;
  }
  
  public String getTitle() {
    return title;
  }
  
  public void setTitle(String title) {
    this.title = title;
  }
  
  public String getContent() {
    return content;
  }
  
  public void setContent(String content) {
    this.content = content;
  }
  
  public int getHits() {
    return hits;
  }
  
  public void setHits(int hits) {
    this.hits = hits;
  }
  
  public String getRegdate() {
    return regdate;
  }
  
  public void setRegdate(String regdate) {
    this.regdate = regdate;
  }
  
  public MemberVo getVo() {
    return vo;
  }
  
  public void setVo(MemberVo vo) {
    this.vo = vo;
  }
  
  @Override
  public String toString() {
    return "BoardVo [no=" + no + ", title=" + title + ", content=" + content + ", hits=" + hits
        + ", regdate=" + regdate + ", vo=" + vo + "]";
  }
  
  
}
