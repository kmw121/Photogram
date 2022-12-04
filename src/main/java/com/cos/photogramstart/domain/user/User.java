package com.cos.photogramstart.domain.user;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 20,unique = true)
    private String username;

    @Column(nullable = false)
    private String password;

    private String website;

    @Column(nullable = false)
    private String email;

    private String phone;

    @Column(nullable = false)
    private String name;

    private String gender;

    private String profileImageUrl;

    private String role;

    private LocalDateTime createDate;

    @PrePersist
    public void setCreateDate() {
        this.createDate = LocalDateTime.now();
    }
}
