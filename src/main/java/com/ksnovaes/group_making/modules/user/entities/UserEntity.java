package com.ksnovaes.group_making.modules.user.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.ksnovaes.group_making.modules.group.entities.GroupEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Table(name = "user")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String name;

    private String middleName;

    private String nickname;

    private Gender gender;

    private String email;

    private String password;

    @OneToMany(mappedBy = "admin")
    @JsonManagedReference
    private List<GroupEntity> groups;

    @CreationTimestamp
    private LocalDateTime createdAt;
}
