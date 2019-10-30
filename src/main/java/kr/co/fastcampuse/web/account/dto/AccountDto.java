package kr.co.fastcampuse.web.account.dto;

import kr.co.fastcampuse.web.account.model.AccountModel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AccountDto {
    private String username;
    private String password;

    public AccountModel toModel() {
        return new AccountModel(username, password);
    }
}
