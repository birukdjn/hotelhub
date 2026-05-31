package com.hotelhub.entity;
import com.hotelhub.entity.common.HotelAwareEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "guests")
public class Guest extends HotelAwareEntity {

    @Column(nullable = false)
    private String fullName;

    private String phone;

    private String email;

    private String nationality;

    private String nationalId;

    // Getters and Setters
}