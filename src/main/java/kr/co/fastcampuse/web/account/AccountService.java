package kr.co.fastcampuse.web.account;

import kr.co.fastcampuse.web.account.dto.AccountDto;
import kr.co.fastcampuse.web.account.model.AccountModel;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class AccountService {
    @Autowired AccountRepository accountRepository;

    public List<AccountDto> list() {
        List<AccountModel> list = accountRepository.list();
        return list.stream().map(x -> x.toDto()).collect(Collectors.toList());
    }

    // TODO Page<AccountDto> page(Pageable pageable)

    public void create(AccountDto dto) {
        accountRepository.create(dto.toModel());
    }
}
