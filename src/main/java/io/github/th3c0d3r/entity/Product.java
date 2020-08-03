package io.github.th3c0d3r.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Product extends BasicInfo{

    private String Name;
    private String Description;
    private Double Price;
    private Double Stock;
    private String PhotoUrl;

}
