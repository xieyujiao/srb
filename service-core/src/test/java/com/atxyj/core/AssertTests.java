package com.atxyj.core;

import org.junit.Test;
import org.springframework.util.Assert;

/**
 * @author: xyj
 * @date: 2021/4/30
 */
public class AssertTests {

    @Test
    public void test1() {
        Object o = null;
        if( o == null) {
            throw new IllegalArgumentException("参数错误");
        }
    }

    @Test
    public void test2 () {
        Object o = null;
        Assert.notNull(o, "参数错误");
    }
}
