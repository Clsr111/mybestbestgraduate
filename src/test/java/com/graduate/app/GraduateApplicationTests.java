package com.graduate.app;

import com.graduate.app.DTO.CaultureDTO;
import com.graduate.app.bean.CaltureList;
import com.graduate.app.mapper.CaltureListByClassMapper;
import com.graduate.app.mapper.CaltureListByDescoverMapper;
import com.graduate.app.mapper.CaltureListMapper;
import com.graduate.app.mapper.CaultureMapper;
import java.util.List;
import javax.sql.DataSource;
import org.checkerframework.checker.units.qual.A;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GraduateApplicationTests {

  @Autowired
	JdbcTemplate jdbcTemplate;

  @Autowired
	private CaltureListMapper caltureListMapper;

  @Autowired
	private CaultureMapper caultureMapper;

  @Autowired
	private CaltureListByDescoverMapper caltureListByDescoverMapper;
  @Autowired
	private CaltureListByClassMapper caltureListByClassMapper;

	@Test
	public void contextLoads() {
		CaltureList calture = caltureListMapper.getCaltureByFrame(29995);
		System.out.println(calture);
	}

	@Test
	public void testMapper(){
    List<CaltureList> caltures = caltureListMapper.getAllCalture();
    System.out.println(caltures);
  }

  @Test
	public void testCaltureMapper(){
    CaultureDTO caultureDTO = caultureMapper.getCaultreDTOByFrame(29995);
    System.out.println(caultureDTO);
  }

  @Test
	public void testMapper1(){
		List<CaltureList> calture1 = caltureListByDescoverMapper.gCalture1(29980);
		System.out.println();
	}

	@Test
	public void testMapper2() {
		List<CaltureList> calture2 = caltureListByClassMapper.gCalture2(29970);
		System.out.println();
	}
}
