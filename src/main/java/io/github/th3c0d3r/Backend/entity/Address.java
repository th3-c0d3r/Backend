package io.github.th3c0d3r.Backend.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Address extends BasicInfo{

    private Integer addressType;
    private String nickName;
    private String address;
    private Boolean isWorkAddress;
}
