package cn.ztuo.bitrade.test.service;

import cn.ztuo.bitrade.test.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import cn.ztuo.bitrade.entity.Member;
import cn.ztuo.bitrade.service.MemberService;


public class MemberServiceTest extends BaseTest {

	@Autowired
	private MemberService memberService;
	
	@Test
	public void test() {
        Member member=memberService.findOne(25L);
        System.out.println(">>>>>>>>>>>>>>"+member);
        
	}

}
