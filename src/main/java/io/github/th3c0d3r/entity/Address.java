package io.github.th3c0d3r.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Address extends BasicInfo{

    private Integer AddressType;
    private String NickName;
    private String Address;
    private Boolean IsWorkAddress;
}
