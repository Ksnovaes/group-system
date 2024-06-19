package com.ksnovaes.group_making.modules.group.entities;

import com.ksnovaes.group_making.modules.user.entities.UserEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.UUID;

@Table(name = "group")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class GroupEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID groupId;

    @ManyToOne
    @JoinColumn(name = "admin_id", nullable = false)
    private UserEntity admin;

    private String title;

    private String description;

    @CreationTimestamp
    private LocalDateTime createdAt;
}
