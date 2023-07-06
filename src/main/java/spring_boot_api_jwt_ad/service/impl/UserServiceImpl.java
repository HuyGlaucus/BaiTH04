package spring_boot_api_jwt_ad.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring_boot_api_jwt_ad.repository.UserRepository;
import spring_boot_api_jwt_ad.authen.UserPrincipal;
import spring_boot_api_jwt_ad.entity.User;
import spring_boot_api_jwt_ad.service.UserService;

import java.util.HashSet;
import java.util.Set;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Override
    public User createUser(User user) {
        return userRepository.saveAndFlush(user);
    }

    @Override
    public UserPrincipal findByUserName(String username) {
        User user = userRepository.findByUsername(username);
        UserPrincipal userPrincipal = new UserPrincipal();
        if (user != null) {
            Set<String> authorities = new HashSet<>();
            if (user.getRoles() != null) {
                user.getRoles().forEach(role -> {
                    authorities.add(role.getKey());
                    role.getPermissions().forEach(p -> authorities.add(p.getKey()));
                });

            }

            userPrincipal.setUserId(user.getId());
            userPrincipal.setUsername(user.getUsername());
            userPrincipal.setPassword(user.getPassword());
            userPrincipal.setAuthorities(authorities);
        }
        return userPrincipal;
    }
}
