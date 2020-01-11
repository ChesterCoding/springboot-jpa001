/**
 * @BelongsProject: springboot-jpa001
 * @BelongsPackage: com.offcen.springbootjpa001.service
 * @Author: Administrator
 * @CreateTime: 2020-01-08 16:54
 * @Description:
 */

package com.offcen.springbootjpa001.service.impl;

import com.offcen.springbootjpa001.bean.Person;
import com.offcen.springbootjpa001.dao.PersonDao;
import com.offcen.springbootjpa001.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {

    /**
     * @Author:
     * @Description: 实现dao，使用spring的注解方式
     * @Date:16:59 CST 08 1月 2020
     */
    @Autowired
    private PersonDao pd;

    /**
     * 添加
     *
     * @param person
     */
    @Override
    public void add(Person person) {
        pd.save(person);
    }

    /**
     * 根据id删除
     *
     * @param id
     */
    @Override
    public void delete(Long id) {
        pd.deleteById(id);
    }

    /**
     * 修改
     *
     * @param person
     */
    @Override
    public void update(Person person) {
        pd.saveAndFlush(person);
    }

    /**
     * 根据id查找
     *
     * @param id
     * @return
     */
    @Override
    public Person findOne(Long id) {
        return pd.findById(id).get();
    }

    /**
     * 查找所有
     * @return
     */
    @Override
    public List<Person> findAll() {
        return pd.findAll();
}

    @Override
    public Person findByNameEquals(String name) {
        return pd.findByNameEquals(name);
    }

    @Override
    public Person findByNameLike(String name) {
        return pd.findByNameLike(name);
    }

    @Override
    public Person login(String name, String password) {
        return pd.login(name, password);
    }

    @Override
    public Person setPswLength() {
        return pd.setPswLength();
    }
}
