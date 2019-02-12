package io.amoe.entity;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * @author Amoe
 */
@Data
public class User implements Serializable {
    private Long id;
    private String name;
    private Integer age;
    private String phone;
    private BigDecimal wallet;
    private LocalDateTime createTime;
}
