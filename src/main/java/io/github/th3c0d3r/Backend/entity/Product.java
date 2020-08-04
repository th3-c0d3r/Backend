package io.github.th3c0d3r.Backend.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Product extends BasicInfo{

    private String name;
    private String description;
    private Double price;
    private Double stock;
    private String photoUrl;

}
