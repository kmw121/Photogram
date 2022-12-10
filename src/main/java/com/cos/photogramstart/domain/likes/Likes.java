package com.cos.photogramstart.domain.likes;

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
@Table(
        uniqueConstraints = {
                @UniqueConstraint(
                        name = "likes_uk",
                        columnNames = {"imageId","userId"}
                )
        }
)
public class Likes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @JoinColumn(name="imageId")
    @ManyToOne
    private Image image;

    @JsonIgnoreProperties({"images"})
    @JoinColumn(name="userId")
    @ManyToOne
    private User User;

    private LocalDateTime createDate;

    @PrePersist
    public void setCreateDate() {
        this.createDate = LocalDateTime.now();
    }
}

