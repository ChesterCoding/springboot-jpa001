/**
 * @BelongsProject: springboot-jpa001
 * @BelongsPackage: com.offcen.springbootjpa001.service
 * @Author: Administrator
 * @CreateTime: 2020-01-08 16:53
 * @Description:
 */

package com.offcen.springbootjpa001.service;

import com.offcen.springbootjpa001.bean.Person;

import java.util.List;

public interface PersonService {

    /**
     * 增加
     *
     * @param person
     */
    void add(Person person);

    /**
     * 根据id删除
     *
     * @param id
     */
    void delete(Long id);

    /**
     * 修改
     *
     * @param person
     */
    void update(Person person);

    /**
     * 根据id查找
     *
     * @param id
     * @return
     */
    Person findOne(Long id);

    /**
     * 查看所有
     *
     * @return
     */
    List<Person> findAll();


    //////////////////自定义测试////////////////////

    Person findByNameEquals(String name);

    Person findByNameLike(String name);

    Person login(String name, String password);

    public Person setPswLength();
}
