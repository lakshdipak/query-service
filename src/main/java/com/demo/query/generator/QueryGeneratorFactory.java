package com.demo.query.generator;

public interface QueryGeneratorFactory {

    QueryGenerator createStrategy(QueryType messageType);
}
