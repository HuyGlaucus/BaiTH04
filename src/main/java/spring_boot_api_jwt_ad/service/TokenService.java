package spring_boot_api_jwt_ad.service;

import spring_boot_api_jwt_ad.entity.Token;

public interface TokenService {
    Token createToken(Token token);
    Token findByToken(String token);
}
