package com.wkclz.mybatis.bean;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 用户字段的查询和切匹配
 */

@Data
public class ColumnQuery implements Serializable {

    private String tableSchema;
    private List<String> columnNames;

    private String columnName;
    private String dataType;
    private String javaType;
    private String tsType;
    private String inputType;
    private String columnComment;
    private Integer count;

}
