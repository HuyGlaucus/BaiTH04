package spring_boot_api_jwt_ad.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import lombok.Data;

import java.util.Date;

@Entity
@Data
public class Token extends BaseEntity{
    @Column(length = 1000)
    private String token;
    private Date expDate;
}
