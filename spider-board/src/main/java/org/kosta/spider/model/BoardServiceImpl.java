package org.kosta.spider.model;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class BoardServiceImpl implements BoardService {

  @Resource
  private BoardDao boardDao;
  
  @Override
  public List<BoardVo> readAllBoardList() {
    return boardDao.readAllBoardList();
  }

  @Override
  public int getTotalCount() {
    return boardDao.getTotalCount();
  }

  @Override
  public ListVo getPagingList(String np) {
    ListVo listVo = new ListVo();
    int nowPage = 0;
    if (np != null) {
      nowPage = Integer.parseInt(np);
    }
    if (nowPage == 0) {
      listVo.setPb(new PagingBean(getTotalCount()));
    } else {
      listVo.setPb(new PagingBean(getTotalCount(), nowPage));
    }
    listVo.setList(boardDao.getPagingList(listVo.getPb()));
    return listVo;
  }

}
