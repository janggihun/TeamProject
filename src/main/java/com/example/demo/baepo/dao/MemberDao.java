package com.example.demo.baepo.dao;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.baepo.dto.MemberDto;

@Mapper
public interface MemberDao {

		
	MemberDao memberInfo();

	void memberInsert(MemberDto memberdto);
	
	
}
