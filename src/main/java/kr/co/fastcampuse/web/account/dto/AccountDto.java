package kr.co.fastcampuse.web.account.dto;

import kr.co.fastcampuse.web.account.model.AccountModel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AccountDto {
    // TODO validator constraint 추가
    // https://beanvalidation.org/2.0/
    // https://beanvalidation.org/2.0/spec/#builtinconstraints
    private String username;
    private String password;
    // TODO roles 추가

    public AccountModel toModel() {
        // TODO roles 추가
        return new AccountModel(username, password);
    }
}
