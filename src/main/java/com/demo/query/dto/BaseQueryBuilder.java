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
public abstract class BaseQueryBuilder {

     public final String SELECT_KEY="SELECT";
     public final String FROM_KEY="FROM";
     public final String WHERE_KEY="WHERE";
     public final String JOIN_KEY="JOIN";
     public final String ON_KEY="ON";


     private List<String> selectAttribute;

     private List<String> fromTables;



}
