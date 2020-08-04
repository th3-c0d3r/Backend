package io.github.th3c0d3r.Backend.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductReview extends BasicInfo {

    private Integer productId;
    private Double starRating;
    private String review;
}
