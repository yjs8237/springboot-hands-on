package kr.co.fastcampuse.web.account;


import kr.co.fastcampuse.web.account.model.AccountModel;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.lang.String.format;
import static org.assertj.core.api.Assertions.assertThat;


class AccountRepositoryImplTest {

    @Autowired
    private AccountRepositoryImpl accountRepository;

    final int SIZE = 100;

    private List<AccountModel> createList() {
        return IntStream.range(1, (SIZE + 1)).mapToObj(x -> new AccountModel(format("test%03d", x), "test" + x )).collect(Collectors.toList());
    }


    @BeforeEach
    public void before() {
        accountRepository = new AccountRepositoryImpl(createList());
    }

    @Test
    void test_list() {

        // given

        // when
        List<AccountModel> list = accountRepository.list();

        // then
        assertThat(list.size()).isEqualTo(100);
    }

    // TODO 테스트 구현
    void test_findAll() {

    }

    // TODO 테스트 구현
    @Test
    void test_create() {
        accountRepository.create(new AccountModel("greatyun" , "password"));

        List<AccountModel> list = accountRepository.list();

        assertThat(list.size()).isEqualTo(101);


    }
}