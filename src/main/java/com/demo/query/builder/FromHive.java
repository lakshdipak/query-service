package com.demo.query.builder;

import java.util.List;
import java.util.Map;

public interface FromHive extends From {
    String buildHiveFrom(Map<String, List<String>> fromMap);
}
