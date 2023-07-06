package spring_boot_api_jwt_ad.service;

import spring_boot_api_jwt_ad.entity.Role;

public interface RoleService {
    Role save(Role role);
    Role findById(Long id);
}
