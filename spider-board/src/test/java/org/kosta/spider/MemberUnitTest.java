package org.kosta.spider;

import javax.annotation.Resource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.kosta.spider.model.BoardDao;
import org.kosta.spider.model.BoardService;
import org.kosta.spider.model.ListVo;
import org.kosta.spider.model.PagingBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/*
 *    TDD : 테스트 주도 개발(test-driven development, TDD)은 
 *            매우 짧은 개발 사이클을 반복하는 소프트웨어 개발 프로세스
 *            
 *    JUnit: 자바 단위 테스트를 위한 TDD 프레임워크
 *    
 *    아래 라이브러리가 maven의 pom.xml에 추가되어야 한다. 
 *    
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring-model.xml"})
public class MemberUnitTest {
  
  @Resource
  private BoardService boardService;
  
  @Resource
  private BoardDao boardDao;
  
  @Test
  public void test() {
    
    
    
    
    
    
    
  }


}