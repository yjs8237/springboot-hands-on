package kr.co.fastcampuse.web.account;

import kr.co.fastcampuse.web.account.dto.AccountDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.List;

@Controller
public class AccountControler {
    @Autowired AccountService accountService;

//    @GetMapping("/account/list")
//    public ModelAndView account() {
//        ModelAndView mv = new ModelAndView("account/list");
//        List<AccountDto> list = accountService.list();
//        mv.addObject("accounts", list);
//        return mv;
//    }

    @GetMapping("/account/list")
    public ModelAndView page(@PageableDefault(size=10, sort="username", direction = Sort.Direction.DESC) Pageable pageable) {
        ModelAndView mv = new ModelAndView("account/list");
        Page page = accountService.page(pageable);
        mv.addObject("page", page);
        return mv;
    }

    @GetMapping("/account/create")
    public ModelAndView createGet() {
        ModelAndView mv = new ModelAndView("account/create");
        mv.addObject("account", new AccountDto());
        return mv;
    }


    @PostMapping("/account/create")
    public ModelAndView createPost(@ModelAttribute("account") @Valid AccountDto dto, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            ModelAndView mv = new ModelAndView("account/create");
            mv.addObject("account", dto);
            return mv;
        } else {
            accountService.create(dto);
            return new ModelAndView("redirect:/account/list");
        }
    }
}
