package com.dhy.dao;

import com.dhy.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class BookDaoImpl implements BookDao{
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int insert(String name, int age) {
        int update = jdbcTemplate.update("insert into user values (?,?,?)", null,name, age);
        return update;
    }

    @Override
    public User getUserInfo(int id) {
        String sql = "select* from user where id = ?";
        User o = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(User.class), id);
        return o;
    }

    @Override
    public List<User> getUserInfoList() {
        String sql = "select* from user";
        List<User> o = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(User.class));
        return o;
    }

    @Override
    public void batchAdd(List<Object[]> list) {
        String sql = "insert into user values(?,?,?)";
        int[] ints = jdbcTemplate.batchUpdate(sql, list);
        System.out.println(Arrays.toString(ints));
    }
}
