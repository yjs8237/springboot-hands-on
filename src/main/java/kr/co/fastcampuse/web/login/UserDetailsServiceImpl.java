package kr.co.fastcampuse.web.login;

import kr.co.fastcampuse.web.account.AccountRepository;
import kr.co.fastcampuse.web.account.model.AccountModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Set;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private AccountRepository repository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<AccountModel> accountModelOptional = repository.list().stream().filter(x -> x.getUsername().equals(username)).findFirst();
        if(accountModelOptional.isPresent()) {
            AccountModel m = accountModelOptional.get();
            String[] roles =  m.getRoles().toArray(new String[m.getRoles().size()]);
            return User.builder().username(m.getUsername()).password(passwordEncoder.encode(m.getPassword())).roles(roles).build();
        } else {
            throw new UsernameNotFoundException("사용자를 찾을 수 없습니다.");
        }
    }
}

