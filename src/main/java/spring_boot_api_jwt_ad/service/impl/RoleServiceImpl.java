package spring_boot_api_jwt_ad.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring_boot_api_jwt_ad.repository.RoleRepository;
import spring_boot_api_jwt_ad.entity.Role;
import spring_boot_api_jwt_ad.service.RoleService;

@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleRepository roleRepository;
    @Override
    public Role save(Role role) {
        return roleRepository.saveAndFlush(role);
    }

    @Override
    public Role findById(Long id) {
        return roleRepository.findById(id).get();
    }
}
