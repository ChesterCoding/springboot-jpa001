/**
 * @BelongsProject: springboot-jpa001
 * @BelongsPackage: com.offcen.springbootjpa001.bean
 * @Author: Administrator
 * @CreateTime: 2020-01-08 08:47
 * @Description:
 */

package com.offcen.springbootjpa001.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data//gette/setter
@AllArgsConstructor//有参构造
@NoArgsConstructor//无参构造

@Entity//声明此JavaBean是一个符合jpa规范的，可以创建成持久层对象的。简单来说就是一个持久化对象
@Table(name = "tb_person")//修改表名，如果不写次注解，则表名字为当前JavaBean的名字

public class Person {

    @Id//声明为主键
    @GeneratedValue//生成主键的值
    private Long id;
    @Column(name = "name", nullable = false, length = 100)//声明为字段注解 name:起别名  nullable:true是允许为空，false不允许为空  length:字段长度
    private String name;
    @Column(nullable = false, length = 20)
    private String password;
    @Column(nullable = false, length = 4)
    private Integer age;
}
