package com.hanaonestock.member.model.dao;

import com.hanaonestock.member.model.dto.Member;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface MemberMapper {
    List<Member> getAllMember();
}