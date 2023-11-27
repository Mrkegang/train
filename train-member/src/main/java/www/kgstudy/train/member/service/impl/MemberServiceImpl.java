package www.kgstudy.train.member.service.impl;

import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import www.kgstudy.train.member.mapper.MemberMapper;
import www.kgstudy.train.member.service.MemberService;

@Service
public class MemberServiceImpl implements MemberService {

    @Resource
    private MemberMapper memberMapper;

    @Override
    public int count() {
        return memberMapper.count();
    }
}
