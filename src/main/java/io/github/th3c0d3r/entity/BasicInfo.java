package io.github.th3c0d3r.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BasicInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private Integer CreatedBy;
    private Integer CreatedAt;
    private Integer UpdatedBy;
    private Integer UpdatedAt;
    private Boolean Deleted;


}
