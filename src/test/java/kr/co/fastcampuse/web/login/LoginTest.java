package kr.co.fastcampuse.web.login;

import org.junit.jupiter.api.Test;

class LoginTest {
    @Test
    void test_when_login_fail_then_301_redirect_to_login_page() throws Exception {
    }

    @Test
    void test_when_login_ok_then_status_ok() throws Exception {
    }
}


//class SampleAuthenticationManager implements AuthenticationManager {
//    static final List<GrantedAuthority> AUTHORITIES = new ArrayList<>();
//
//    static {
//        AUTHORITIES.add(new SimpleGrantedAuthority( "ROLE_ADMIN"));
//        AUTHORITIES.add( new SimpleGrantedAuthority("ROLE_USER"));
//    }
//
//    public Authentication authenticate(Authentication auth) throws AuthenticationException {
//        if (auth.getName().equals(auth.getCredentials())) {
//            return new UsernamePasswordAuthenticationToken(auth.getName(), auth.getCredentials(), AUTHORITIES);
//        }
//        throw new BadCredentialsException("Bad Credentials");
//    }
//}
