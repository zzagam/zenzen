package org.kosta.spider.model;

import java.util.List;
import javax.annotation.Resource;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class BoardDaoImpl implements BoardDao {
  
  @Resource
  private SqlSessionTemplate template;
  
  @Override
  public List<BoardVo> readAllBoardList() {
    return template.selectList("board.readAllBoardList");
  }

  @Override
  public int getTotalCount() {
    return template.selectOne("board.getTotalCount");
  }

  @Override
  public List<BoardVo> getPagingList(PagingBean pb) {
    return template.selectList("getPagingList",pb);
    
  }

}
