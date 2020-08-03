package io.github.th3c0d3r.entity;


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

    private String FirstName;
    private String LastName;
    private Integer Age;
    private Integer Gender;
    private Address Addresses;
    private String Email;
    private String EncryptedPassword;
    private String Salt;
    //private List<Product> Products;
}
