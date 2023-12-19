package com.example.demo.baepo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.baepo.dao.MemberDao;
import com.example.demo.baepo.dto.MemberDto;

import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class HomeController {
	
	@Autowired
	MemberDao memberDao;
	
	@GetMapping("/") //로그인 페이지시작
	public String home() {
		
		log.info("===========통과");
		
		return "index";
	}
	@GetMapping("/login")//로그인 페이지시작
	public String login() {
		
		log.info("===========로그인");
		
		return "redirect:/";
	}
	///////////////////////////////////////////////////
	@GetMapping("/memberinsert")
	public String memberInsert() {
		
		log.info("===========헬로우");
		
		return "memberInsert";
	}
	
	@GetMapping("/memberInfo")
	public String memberInfo() {
		log.info("==========memberinfo 통과");
		memberDao.memberInfo();
		return "/";
	}
	//////////////////////////////////////////
	@PostMapping("/memberinsert")
	public String memberInsert(MemberDto memberdto) {
		log.info("==============={}",memberdto);
		memberDao.memberInsert(memberdto);
		log.info("====회원가입통과");
		
		return "redirect:/";
	}
	
}
