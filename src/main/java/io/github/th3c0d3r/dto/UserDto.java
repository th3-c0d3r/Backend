package io.github.th3c0d3r.dto;

import io.github.th3c0d3r.entity.Address;
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
    private String FirstName;
    private String LastName;
    private Integer Age;
    private Integer Gender;
    private Integer AddressId;
    private Address Addresses;
    private String Email;
    private String Password;
}
