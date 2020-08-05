package com.sign.in.controller;

import com.sign.in.dto.MemberDto;
import com.sign.in.service.MemberService;
import lombok.AllArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@Controller
@AllArgsConstructor
public class MemberController {
    private MemberService memberService;

    // 메인 페이지
    @GetMapping("/adminMain2")
    public String adminMain2() {

        return "/admin/adminMain2";
    }
    @GetMapping("/adminMain2/myPage")
    public String adminMain2mp() {

        return "/admin/adminMainMypage";
    }
    // 메인 페이지
    @GetMapping("/")
    public String index() {

        return "/register/index";
    }

    // 회원가입 페이지
    @GetMapping("/user/signup")
    public String dispSignup() {
        return "/register/register";
    }

    // 회원가입 처리
    @PostMapping("/user/signup")
    public String execSignup(MemberDto memberDto) {
        memberService.joinUser(memberDto);
        return "redirect:/";
    }

    // 로그인 페이지
    @GetMapping("/user/login")
    public String dispLogin() {
        return "/register/login";
    }

    // 로그인 결과 페이지
    @GetMapping("/user/login/result")
    public String dispLoginResult() {

        return "/register/loginSuccess";
    }

    // 로그아웃 결과 페이지
    @GetMapping("/user/logout/result")
    public String dispLogout() {
        return "/register/logout";
    }

    // 접근 거부 페이지
    @GetMapping("/user/denied")
    public String dispDenied() {
        return "/register/denied";
    }

/*    // 내 정보 페이지
    @GetMapping("/user/info/{email}")
    public String dispMyInfo(@PathVariable("email") String email, Model model) {

        MemberPersonalDto memberDto= memberService.findByEmail(email);
        model.addAttribute("person",memberDto);
        return "/myinfo";
    }*/

// 내 정보 페이지
    @GetMapping("/user/info")
    public String dispMyInfo(HttpSession session, Model model) {
        Authentication user = SecurityContextHolder.getContext().getAuthentication();
        String email = user.getName();
        System.out.println(email);

        MemberDto memberDto= memberService.findByEmail(email);
        System.out.println(memberDto.getEmail());

        model.addAttribute("person",memberDto);


        return "/register/myinfo";
    }

    @GetMapping("/member/info")
    public String disMypage(HttpSession session, Model model) {
        Authentication user = SecurityContextHolder.getContext().getAuthentication();
        String email = user.getName();
        System.out.println(email);

        MemberDto memberDto= memberService.findByEmail(email);
        System.out.println(memberDto.getEmail());

        model.addAttribute("memberDto",memberDto);


        return "/shopperContent/Mypage";
    }

    //게시글 수정
    @PutMapping("/member/edit/{email}")
    public String update(MemberDto memberDto) {
        memberService.joinUser(memberDto);

        return "redirect:/";
    }

    // 어드민 페이지
    @GetMapping("/admin")
    public String dispAdmin() {
        return "/register/admin";
    }
}
