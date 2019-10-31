package kr.co.fastcampuse.web.account;

import kr.co.fastcampuse.web.account.model.AccountModel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface AccountRepository {
    List<AccountModel>  list();
    Page<AccountModel> findAll(Pageable pageable);
    AccountModel findById(Long id);
    void create(AccountModel m);
    void update(AccountModel m);
    void delete(Long id);
}
