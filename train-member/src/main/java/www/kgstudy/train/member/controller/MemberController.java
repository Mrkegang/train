package www.kgstudy.train.member.controller;

import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import www.kgstudy.train.common.resp.CommonResp;
import www.kgstudy.train.member.req.MemberRegisterReq;
import www.kgstudy.train.member.service.MemberService;


@RestController
@RequestMapping("/member")
public class MemberController {

    @Resource
    private MemberService memberService;

    @GetMapping("/count")
    public CommonResp<Integer> count() {
        Integer count = memberService.count();
        return new CommonResp<>(count);
    }

    @PostMapping("/register")
    public CommonResp<Long> register(MemberRegisterReq req) {
        Long register = memberService.register(req);
        return new CommonResp<>(register);
    }
}
