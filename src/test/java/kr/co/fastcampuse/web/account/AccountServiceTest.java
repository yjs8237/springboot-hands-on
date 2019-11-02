package kr.co.fastcampuse.web.account;

import kr.co.fastcampuse.web.account.dto.AccountDto;
import kr.co.fastcampuse.web.account.model.AccountModel;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.times;


@SpringBootTest
@Slf4j
class AccountServiceTest {


    private AccountService accountService;
    private AccountRepository accountRepository;

    @BeforeEach
    public void before() {
        accountRepository = Mockito.mock(AccountRepository.class);
        accountService = new AccountService(accountRepository);
    }

    // TODO 테스트 구현
    @Test
    void test_list() {

        Mockito.when(accountRepository.list()).thenReturn(List.of());

        List<AccountDto> list = accountService.list();

        assertThat(list.size()).isEqualTo(0);
    }

    // TODO 테스트 구현
    void test_page() {
    }

    @Test
    void create() {
        AccountDto dto = new AccountDto("username", "password");
        accountService.create(dto);
        Mockito.verify(accountRepository, times(1)).create(any(AccountModel.class));
    }
}