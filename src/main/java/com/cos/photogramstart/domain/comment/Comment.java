package com.cos.photogramstart.domain.comment;

import com.cos.photogramstart.domain.image.Image;
import com.cos.photogramstart.domain.user.User;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 100, nullable = false)
    private String content;

    private LocalDateTime createDate;

    @JsonIgnoreProperties("images")
    @JoinColumn(name="userId")
    @ManyToOne
    private User user;


    @JoinColumn(name="imageId")
    @ManyToOne
    private Image image;

    @PrePersist
    public void setCreateDate() {
        this.createDate = LocalDateTime.now();
    }
}
