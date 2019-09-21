package com.naver.eng.appserver.controller;

import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.naver.eng.appserver.business.NicknameBusiness;


@Controller
public class ContentController 
{
	@Autowired
	NicknameBusiness nbo;

	@Autowired
	JdbcTemplate datasource;

	@RequestMapping("/input")
    public Object input(Map<String, Object> model) throws Exception {
		// autowired 객체
		String name = nbo.getNickname("bb");
		// new 생성된 객체
		NicknameBusiness nicknameBusiness = new NicknameBusiness();
		String name1 = nicknameBusiness.getNickname("aa");
		List<Map<String, Object>> queryForList = datasource.queryForList("Select * From sample_schema.User");
		System.out.println(queryForList);
		
		model.put("nick", name);
		model.put("nick1", name1);
		model.put("img", "https://ssl.pstatic.net/tveta/libs/1253/1253341/2ea3ae5dddb63cdc609a_20190820102841611.jpg");

		return "input";
    }

	@RequestMapping("/list")
    public Object list(Map<String, Object> model) throws Exception {
		// 입력된 정보의 리스트 노출.
		return "index";
    }

	@RequestMapping("/view")
    public Object view(Map<String, Object> model) throws Exception {
		// 입력된 컨텐츠의 상세 화면.
		return "index";
    }
}


//SELECT * FROM sample_schema.User
//insert into sample_schema.User (id, name, age) values ("a3", "na3", 3)