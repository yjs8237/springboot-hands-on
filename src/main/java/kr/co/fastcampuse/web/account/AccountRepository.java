package kr.co.fastcampuse.web.account;

import kr.co.fastcampuse.web.account.model.AccountModel;

import java.util.List;

public interface AccountRepository {
    List<AccountModel>  list();
    AccountModel findById(Long id);
    void create(AccountModel m);
    void update(AccountModel m);
    void delete(Long id);
}
