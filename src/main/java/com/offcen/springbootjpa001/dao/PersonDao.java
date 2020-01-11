/**
 * @BelongsProject: springboot-jpa001
 * @BelongsPackage: com.offcen.springbootjpa001.dao
 * @Author: Administrator
 * @CreateTime: 2020-01-08 16:49
 * @Description:
 */

package com.offcen.springbootjpa001.dao;

import com.offcen.springbootjpa001.bean.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * JpaRepository里面封装了常用的增删改查方法。
 * <p>
 * 泛型里面的key:自定义的JavaBean
 * value:主键的数据类型
 */
public interface PersonDao extends JpaRepository<Person, Long> {

    /**
     * 根据接口定义方法名字，自动推导出，用户要进行的操作
     */
    public Person findByNameEquals(String name);

    public Person findByNameEqualsAndPassword(String name, String password);

    public Person findByNameLike(String name);

    ////////自定义sql语句////////////
    @Query("select p from Person p where p.name=:name and password=:password")
    public Person login(@Param("name") String name, @Param("password") String password);


    @Query(value = "select * from tb_person where length(password)=6", nativeQuery = true)
    public Person setPswLength();

}
