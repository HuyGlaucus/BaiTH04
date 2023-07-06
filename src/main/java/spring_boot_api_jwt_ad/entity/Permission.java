package spring_boot_api_jwt_ad.entity;

import javax.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class Permission extends BaseEntity{
    private String name;
    private String key;
}
