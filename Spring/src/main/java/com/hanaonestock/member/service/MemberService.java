package com.hanaonestock.member.service;

import com.hanaonestock.member.model.dto.InvestInfo;
import com.hanaonestock.member.model.dto.Member;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

public interface MemberService {

    public List<Member> getAllMember();

    int selectOneMember(String id);

    boolean updateMember(Member m);
    int deleteMember(String id);
    Member loginMember(HashMap<String, String> loginData);
    Member selectNameAndEmailOfMember(HashMap<String, String> kakaoLogin);
    void insertMember(Member member);
    Member selectNameOfMember(String id);
    void insertInvestInfo(Member member);

    InvestInfo selectInvestInfo(String id);

    void updateInvest(Member m);
    int findUserCash(String id);

    int findUserGoal(String id);

    int updateInvestInfoCashById(String id, int cash);
}

