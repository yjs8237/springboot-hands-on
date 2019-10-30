package kr.co.fastcampuse.web.account.dto;

import kr.co.fastcampuse.web.account.model.AccountModel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AccountDto {
    @Size(min=3, max=20, message = "username은 3 ~ 20 글자 범위에서 입력해주세요")
    private String username;
    @Size(min=5, max=20, message = "password는 5 ~ 20 글자 범위에서 입력해주세요")
    private String password;
    @Size(min = 1, message = "role은 최소 1개 이상 선택해주세요.")
    private Set<String> roles;

    public AccountModel toModel() {
        return new AccountModel(username, password, roles);
    }
}
