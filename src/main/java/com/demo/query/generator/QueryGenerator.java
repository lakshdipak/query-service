package com.demo.query.generator;

public abstract class QueryGenerator {

    abstract public void generateQuery(Object message);

    abstract public String hiveQuery();

    abstract public String impalaQuery();

    abstract public String sparkQuery();


}
