package com.demo.query.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@EqualsAndHashCode
@ToString
public class DepositQueryTemplate extends BaseQueryBuilder{

    private List<String> whereClouse;

    public static DepositQueryTemplate builder(List<String> selectAttribute, List<String> fromTables,
                                               List<String> whereClouse){
        DepositQueryTemplate depositQuery= new DepositQueryTemplate();
        depositQuery.setSelectAttribute(selectAttribute);
        depositQuery.setFromTables(fromTables);
        depositQuery.setWhereClouse(whereClouse);
        return depositQuery;
    }


}
