package kr.co.fastcampuse.web.init;

import kr.co.fastcampuse.web.account.AccountRepository;
import kr.co.fastcampuse.web.account.model.AccountModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component
public class InitComponent implements CommandLineRunner {
    @Autowired AccountRepository repository;

    @Override
    public void run(String... args) throws Exception {
        AccountModel admin = new AccountModel("admin", "admin", Set.of("ADMIN", "USER"));
        AccountModel user = new AccountModel("user", "user", Set.of("USER"));
        repository.create(admin);
        repository.create(user);
        System.out.println("system: admin, user created.");
    }
}
