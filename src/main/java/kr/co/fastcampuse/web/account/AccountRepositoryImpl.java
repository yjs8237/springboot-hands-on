package kr.co.fastcampuse.web.account;

import kr.co.fastcampuse.web.account.model.AccountModel;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
@AllArgsConstructor
public class AccountRepositoryImpl implements AccountRepository {

    private List<AccountModel> list;

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
