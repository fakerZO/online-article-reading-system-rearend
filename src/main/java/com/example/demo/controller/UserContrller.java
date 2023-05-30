package com.example.demo.controller;

import com.example.demo.dao.UserDao;
import com.example.demo.entity.User;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;
import java.util.List;

@RequestMapping("/user")
@RestController
public class UserContrller {

    @Resource
    private UserDao dao;

    @GetMapping
    public List getUser() {
        return dao.selectList(null);
    }

    @PostMapping
    public String addUser(@RequestBody User user) {
        return dao.insert(user)==1?"添加成功":"添加失败";
    }

    @PutMapping
    public String upUser(@RequestBody User user){
        return dao.updateById(user)==1?"更新成功":"更新失败";
    }

    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable int id){
        return dao.deleteById(id)==1?"删除成功":"删除失败";
    }

}
