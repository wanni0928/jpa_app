package jpabook.jpashop.service;

import jpabook.jpashop.domain.Member;
import jpabook.jpashop.repository.MemberRepository;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class MemberServiceTest extends TestCase {
    @Autowired MemberService memberService;
    @Autowired MemberRepository memberRepository;

    @Test
    public void join() throws Exception {

        //Given
        Member member = new Member();
        member.setName("choi");

        //when
        Long saveId = memberService.join(member);

        //Then
        assertEquals(member, memberRepository.findOne(saveId));
    }

    @Test
    public void duplicateCheck() throws Exception {
        //Given
        Member member1 = new Member();
        member1.setName("wanni");

        Member member2 = new Member();
        member2.setName("wanni");

        //When
        memberService.join(member1);
        memberService.join(member2);

        //Then
        fail("예외가 발생해야 한다.");
    }
}