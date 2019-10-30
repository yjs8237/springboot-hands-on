package kr.co.fastcampuse.web.account;

import kr.co.fastcampuse.web.account.dto.AccountDto;
import kr.co.fastcampuse.web.account.model.AccountModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class AccountControler {
    @Autowired AccountService accountService;

    @GetMapping("/account")
    public ModelAndView account() {
        ModelAndView mv = new ModelAndView("account/list");
        List<AccountDto> list = accountService.list();
        mv.addObject("accounts", list);
        return mv;
    }

    @PostMapping(value="/account")
    public ModelAndView create(AccountDto dto) {
        ModelAndView mv = new ModelAndView("redirect:/account");
        accountService.create(dto);
        return mv;
    }
}
