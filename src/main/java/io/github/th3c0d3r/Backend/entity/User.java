package io.github.th3c0d3r.Backend.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table
@Entity
public class User extends BasicInfo{

    private String firstName;
    private String lastName;
    private Integer age;
    private Integer gender;
//    private Integer addressId;
    private String email;
    private String encryptedPassword;
    private Boolean active;
    private String roles;
    //private List<Product> Products;
}
