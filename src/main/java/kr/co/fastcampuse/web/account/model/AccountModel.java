package kr.co.fastcampuse.web.account.model;

import kr.co.fastcampuse.web.account.dto.AccountDto;
import lombok.*;

@ToString
@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
public class AccountModel {
    private Long id;
    @NonNull private String username;
    @NonNull private String password;

    public AccountDto toDto() {
        return new AccountDto(username, password);
    }
}
