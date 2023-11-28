package www.kgstudy.train.member.service.impl;

import cn.hutool.core.collection.CollUtil;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import www.kgstudy.train.member.domain.Member;
import www.kgstudy.train.member.domain.MemberExample;
import www.kgstudy.train.member.mapper.MemberMapper;
import www.kgstudy.train.member.service.MemberService;

import java.util.List;

@Service
public class MemberServiceImpl implements MemberService {

    @Resource
    private MemberMapper memberMapper;

    @Override
    public int count() {
        return Math.toIntExact(memberMapper.countByExample(null));
    }

    @Override
    public long register(String mobile) {
        MemberExample memberExample = new MemberExample();
        memberExample.createCriteria().andMobileEqualTo(mobile);
        List<Member> list = memberMapper.selectByExample(memberExample);

        if (CollUtil.isNotEmpty(list)) {
//            return list.get(0).getId();
            throw new RuntimeException("手机号已注册！");
        }

        Member member = new Member();
        member.setId(System.currentTimeMillis());
        member.setMobile(mobile);
        memberMapper.insert(member);

        return member.getId();
    }
}
