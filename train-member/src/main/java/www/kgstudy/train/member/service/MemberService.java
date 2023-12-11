package www.kgstudy.train.member.service;

import www.kgstudy.train.member.req.MemberRegisterReq;

public interface MemberService {

    Integer count();

    Long register(MemberRegisterReq req);
}
