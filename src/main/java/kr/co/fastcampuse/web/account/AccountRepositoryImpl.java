package kr.co.fastcampuse.web.account;

import kr.co.fastcampuse.web.account.model.AccountModel;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Repository
public class AccountRepositoryImpl implements AccountRepository {
    private List<AccountModel> list = new ArrayList<>();

    @Override
    public List<AccountModel> list() {
        return list;
    }

    @Override
    public AccountModel findById(Long id) {
        return null;
    }

    @Override
    public void create(AccountModel m) {
        this.list.add(m);
    }

    @Override
    public void update(AccountModel m) {

    }

    @Override
    public void delete(Long id) {

    }
}
