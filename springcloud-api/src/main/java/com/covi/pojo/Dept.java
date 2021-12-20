package com.covi.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author xiewh
 * @create 2021-12-20 9:33
 * @Description
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true) //链式写法
public class Dept implements Serializable {

    private long deptno;
    private String dname;
    private String db_source;

    public Dept(String dname) {
        this.dname = dname;
    }

    @Override
    public String toString() {
        return "Dept{" + "deptno=" + deptno + ", dname='" + dname + '\'' + ", db_source='" + db_source + '\'' + '}';
    }
}
