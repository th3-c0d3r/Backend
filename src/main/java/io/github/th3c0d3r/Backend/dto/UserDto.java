package io.github.th3c0d3r.Backend.dto;

import io.github.th3c0d3r.Backend.entity.Address;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDto {

    private Integer id;
    private String firstName;
    private String lastName;
    private Integer age;
    private Integer gender;
    private Integer addressId;
    private Address addresses;
    private String email;
    private String password;
    private Boolean active;
}
