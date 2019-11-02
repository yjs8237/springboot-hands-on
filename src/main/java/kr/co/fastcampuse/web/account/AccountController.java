package kr.co.fastcampuse.web.account;

import kr.co.fastcampuse.web.account.dto.AccountDto;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@AllArgsConstructor
public class AccountController {
    AccountService accountService;

    @GetMapping("/account/list")
    // TODO page, size, sort
    // TODO @Pageable
    // TODO @PageableDefault
    public ModelAndView page() {
        ModelAndView mv = new ModelAndView("account/list");
        List accounts = accountService.list();
        mv.addObject("accounts", accounts);
        return mv;
    }

    // TODO GET /account/create
    @GetMapping("/account/create")
    public ModelAndView accountCreate() {
        ModelAndView mv = new ModelAndView("account/create");
        mv.addObject("username" , "username");
        mv.addObject("password" , "password");
        return mv;
    }
    // TODO th:object 적용후 GET /account/create에 account model 추가


    // TODO @Valid 적용
    @PostMapping("/account/create")
    public ModelAndView createPost(AccountDto dto) {
        accountService.create(dto);
        return new ModelAndView("redirect:/account/list");
    }
}
