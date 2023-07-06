package spring_boot_api_jwt_ad.service;

import spring_boot_api_jwt_ad.authen.UserPrincipal;
import spring_boot_api_jwt_ad.entity.User;

public interface UserService {
    User createUser(User user);
    UserPrincipal findByUserName(String username);
}
