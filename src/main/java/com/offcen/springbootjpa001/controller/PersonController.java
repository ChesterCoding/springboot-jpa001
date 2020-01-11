/**
 * @BelongsProject: springboot-jpa001
 * @BelongsPackage: com.offcen.springbootjpa001.controller
 * @Author: Administrator
 * @CreateTime: 2020-01-08 17:05
 * @Description:
 */

package com.offcen.springbootjpa001.controller;

import com.offcen.springbootjpa001.bean.Person;
import com.offcen.springbootjpa001.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {

    /**
     * 调用service层，使用spring的注解
     */
    @Autowired
    private PersonService personService;


    /**
     * 可以接受json数据，转化成对象
     * 查找所有
     * 只能使用Post请求
     *
     * @param person
     * @return
     */
    @PostMapping("/")
    public String add(@RequestBody Person person) {
        personService.add(person);
        return "add-ok";
    }

    /**
     * 根据前端传过来的id删除数据
     * 只能使用Delete请求
     * 根据id删除
     *
     * @param id
     * @return
     */
    @DeleteMapping("/{id}")
    public String delete(@PathVariable("id") Long id) {
        personService.delete(id);
        return "delete-ok";
    }

    /**
     * 可以接受前台发送过来的json数据，然后转化成为对象
     * 只能使用put接受请求
     * 修改一个用户
     *
     * @param person
     * @param id
     * @return
     */
    @PutMapping("/{id}")
    public String update(@RequestBody Person person, @PathVariable("id") Long id) {
        person.setId(id);
        personService.update(person);
        return "update-ok";
    }

    /**
     * 获取前端传输过来的id
     * 根据id查找
     * 只能用get接受请求
     *
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    public Person findOne(@PathVariable("id") Long id) {
        return personService.findOne(id);
    }

    /**
     * 查找所有用户
     *
     * @return
     */
    @GetMapping("/")
    public List<Person> findAll() {
        return personService.findAll();
    }


    @GetMapping("/name/{name}")
    public Person findByNameEquals(@PathVariable("name") String name) {
        return personService.findByNameEquals(name);
    }


    @GetMapping("/namelike/{name}")
    public Person findByNameLike(@PathVariable("name") String name) {
        return personService.findByNameLike("%" + name + "%");
    }

    @GetMapping("/password/")
    public Person setPswLength() {
        return personService.setPswLength();
    }
}

