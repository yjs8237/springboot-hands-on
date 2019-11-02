package kr.co.fastcampuse.web.account;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

@ExtendWith(SpringExtension.class)
@WebMvcTest(AccountController.class)
class AccountControllerTest {

    @MockBean AccountService accountService;

    @Autowired
    MockMvc mockMvc;

    // TODO 테스트 구현
    @Test
    void test_getAccount_get() throws Exception {
        MvcResult mvcResult = this.mockMvc.perform(get("/account/list")
                .accept(MediaType.TEXT_HTML))
                .andExpect(status().isOk())
                .andReturn();
        ModelAndView mv = mvcResult.getModelAndView();
        List list = (List)mv.getModel().get("accounts");
        assertThat(list.size()).isEqualTo(0);
    }

    // TODO 테스트 구현
    @Test
    void test_createAccount_get() throws Exception {
        this.mockMvc.perform(get("/account/create")
                .contentType(MediaType.APPLICATION_FORM_URLENCODED)
                .param("username", "test1")
                .param("password", "test1")
                .accept(MediaType.TEXT_HTML))
                .andExpect(status().isOk())
                .andExpect(view().name("account/create"));
    }

    // TODO 테스트 구현
    void test_createAccount_post_fail() throws Exception {
    }

    // TODO 테스트 구현
    @Test
    void 테스트_유저생성_포스트_OK() throws Exception {
        this.mockMvc.perform(post("/account/create")
                .contentType(MediaType.APPLICATION_FORM_URLENCODED)
                .param("username", "test1")
                .param("password", "test1")
                .accept(MediaType.TEXT_HTML))
                .andExpect(status().is3xxRedirection())
                .andExpect(view().name("redirect:/account/list"));
    }
}
