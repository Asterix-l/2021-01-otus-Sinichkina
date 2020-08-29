package com.home.project.pet1;

import com.google.common.base.Joiner;

public class HelloOtus {

    public String[] strs =  {"a","s"};

    public String joinRows() {
        return Joiner.on(",").skipNulls().join(strs);
    }
}
