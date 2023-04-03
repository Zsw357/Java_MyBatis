package com.example.java_mybatis.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * @author Zsw
 * @create 2023-03-28 16:06
 */
@SuppressWarnings("all")//抑制警告
@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "用户实体")
public class User {
    @ApiModelProperty("主键")
    private Integer id;
    @ApiModelProperty("姓名")
    private String name;


}
