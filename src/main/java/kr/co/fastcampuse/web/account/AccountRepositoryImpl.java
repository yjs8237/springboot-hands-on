package kr.co.fastcampuse.web.account;

import kr.co.fastcampuse.web.account.model.AccountModel;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AccountRepositoryImpl implements AccountRepository {
    private List<AccountModel> list = new ArrayList<>();

    @Override
    public List<AccountModel> list() {
        return list;
    }
    // TODO findAll(Pageable pageable), filter/limit/sort 구현

    @Override
    public void create(AccountModel m) {
        this.list.add(m);
    }
}
