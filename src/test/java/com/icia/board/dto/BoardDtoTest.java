package com.icia.board.dto;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.icia.board.dao.BoardDao;
import lombok.extern.slf4j.Slf4j;

@SpringBootTest
@Slf4j
class BoardDtoTest {

	@Autowired
	private BoardDao bDao;
	@Test
	//@Transactional
	void insertDummyDataTest() {
		BoardDto bDto=new BoardDto();
		for(int i=0;i<35;i++) {
			bDto.setB_title("제목"+i).setB_contents("무궁화 꽃이 피었습니다.").setB_writer("aaa");
			bDao.insertDummyData(bDto);
		}
		
	}

}
