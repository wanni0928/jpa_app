package jpabook.jpashop;

import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MemberRepositoryTest extends TestCase {


    @Test
    @Transactional // 기본편 - 모든 엔티티 관리는
    @Rollback(true)
    public void testMember(){

    }
}