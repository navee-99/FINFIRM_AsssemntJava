package com.assesment.assesment.assesmentModel;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "loginDetails")
public class LoginModel {

@Id
@Column(name = "UserId")
    private Integer userId;

    @Column(name = "Password")
    private String password;

    @Column(name = "UserName")
    private String userName;
}
