package kr.co.fastcampuse.web.account;

import kr.co.fastcampuse.web.account.dto.AccountDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class AccountControler {
    @Autowired AccountService accountService;

    @GetMapping("/account/list")
    public ModelAndView account() {
        ModelAndView mv = new ModelAndView("account/list");
        List<AccountDto> list = accountService.list();
        mv.addObject("accounts", list);
        return mv;
    }

    /**
     * post url 바꿈.
     *
     */
    /*@PostMapping(value="/account")
    public ModelAndView create(AccountDto dto) {
        ModelAndView mv = new ModelAndView("redirect:/account");
        accountService.create(dto);
        return mv;
    }*/

    @GetMapping("/account/create")
    public ModelAndView createGet() {
        ModelAndView mv = new ModelAndView("account/create");
        return mv;
    }


    @PostMapping("/account/create")
    public ModelAndView createPost(AccountDto dto) {
        accountService.create(dto);
        return new ModelAndView("redirect:/account/list");
    }
}
