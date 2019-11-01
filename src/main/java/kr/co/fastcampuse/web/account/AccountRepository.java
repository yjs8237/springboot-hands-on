package kr.co.fastcampuse.web.account;

import kr.co.fastcampuse.web.account.model.AccountModel;

import java.util.List;

public interface AccountRepository {
    List<AccountModel>  list();
    void create(AccountModel m);
    // TODO interface Page : https://docs.spring.io/spring-data/commons/docs/current/api/org/springframework/data/domain/Page.html
    // TODO interface Pageable: https://docs.spring.io/spring-data/commons/docs/current/api/org/springframework/data/domain/Pageable.html
    // TODO Page<AccountModel> findAll(Pageable pageable);
    // TODO 아래의 메서드는 수강생이 구현
//    AccountModel findById(Long id);
//    void update(AccountModel m);
//    void delete(Long id);
}
