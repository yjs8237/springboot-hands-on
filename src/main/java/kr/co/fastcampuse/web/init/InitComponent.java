package kr.co.fastcampuse.web.init;

import kr.co.fastcampuse.web.account.AccountRepository;
import kr.co.fastcampuse.web.account.model.AccountModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Set;
import java.util.stream.IntStream;

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
        IntStream.range(1, 101).mapToObj(x -> new AccountModel("test"+ x, "test" + x, Set.of("USER"))).forEach(repository::create);
    }
}
