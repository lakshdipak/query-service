package com.demo.query.service;

import com.demo.query.dto.DepositQueryTemplate;
import com.demo.query.generator.QueryGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;

@Service("Deposit")
public class DepositQueryGenerator  extends QueryGenerator {

    @Autowired
    DepositQueryGenerator()
    {

    }
    private DepositQueryTemplate depositQueryTemplate;

    @Override
    public void generateQuery(Object request) {
        //request to template

        //clientID, attributes, product --request.getClinetID, request.getSubProduct
        //clientID, attributes, INDcative
        //clientID, attributes, balance
        //Map<String,List<String>  ,String,List<String>>
       // DepositQueryTemplate.builder( )





    }

    @Override
    public String hiveQuery() {

        //selct
        //
        StringBuilder toHiveQuery=new StringBuilder();

        toHiveQuery.append("select");

        toHiveQuery.append("From");

        toHiveQuery.append("Where");

        toHiveQuery.append(depositQueryTemplate.SELECT_KEY);
        toHiveQuery.append(depositQueryTemplate.getSelectAttribute().toString());
        toHiveQuery.append(depositQueryTemplate.getFromTables().toString());
        toHiveQuery.append(depositQueryTemplate.getWhereClouse().toString());
        toHiveQuery.append(";");
        return toHiveQuery.toString();

    }

    @Override
    public String impalaQuery() {
        return null;
    }

    @Override
    public String sparkQuery() {
        return null;
    }
}
