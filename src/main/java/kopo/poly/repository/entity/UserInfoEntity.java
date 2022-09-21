package kopo.poly.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.DynamicInsert;
import org.springframework.lang.Nullable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "USER_INFO")
@DynamicUpdate
@DynamicInsert
@Builder
@Entity
public class UserInfoEntity {

    @Id
    @Column(name = "USER_ID")
    private String userId;

    @Nullable
    @Column(name = "USER_NAME", length = 500, nullable = false)
    private String userName;

    @Nullable
    @Column(name = "PASSWORD", length = 1, nullable = false)
    private String password;

    @Nullable
    @Column(name = "EMAIL", nullable = false)
    private String email;

    @Nullable
    @Column(name = "ADDR1",nullable = false)
    private String addr1;

    @Nullable
    @Column(name = "ADDR2", nullable = false)
    private String addr2;

    @Nullable
    @Column(name = "reg_id" , nullable = false)
    private String regId;

    @Nullable
    @Column(name = "reg_dt", nullable = false)
    private String regDt;

    @Nullable
    @Column(name = "chg_id" , nullable = false)
    private String chgId;

    @Nullable
    @Column(name = "chg_dt" , nullable = false)
    private String chgDt;
}
