package com.baomidou.mp;

import com.baomidou.mp.entity.User;
import com.baomidou.mp.mapper.UserMapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.SimpleDateFormat;
import java.util.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Autowired
    UserMapper userMapper;

    @Test
    public void insertTest(){
        User user = new User();
        user.setEmail("lcw@163.com");
        user.setAge(18);

        int insert = userMapper.insert(user);
        System.out.println("return insert value ="+insert);
    }

    @Test
    public void updateByIdTest(){
        User user = new User();
        user.setAge(23);
        user.setEmail("LxX@163.com");
        user.setName("boom");
        user.setId(1L);

        int i = userMapper.updateById(user);
        System.out.println("return update value:"+i);
    }

    /**
     *
     */
    @Test
    public void deleteTest(){
        List<Long> list = new ArrayList<>();
        list.add(1l);
        list.add(2l);
        list.add(6l);

        int i = userMapper.deleteBatchIds(list);
        System.out.println("return deleteBatchIds value:"+i);
    }

    @Test
    public void seleteTest(){
        User user = userMapper.selectById(4l);
        System.out.println("return selete value:"+user);
    }

    @Test
    public void selectBatchIdsTest(){
        List<Long> list = new ArrayList<>();
        list.add(3l);
        list.add(4l);
        list.add(5l);

        List<User> userList = userMapper.selectBatchIds(list);
        System.out.println("return selectBatchIds value:"+userList);
    }

    @Test
    public void selectByMapLoads(){
        HashMap<String, Object> map = new HashMap<>();
        map.put("email","test3@baomidou.com");
        map.put("age",28);
        map.put("name","Tom");
        List<User> userList = userMapper.selectByMap(map);
        System.out.println("return selectByMap value:"+userList);
    }

    /**
     * 分页查询
     */
    @Test
    public void seletePagTest(){
        Page<User> objectPage = new Page<>(1,5);
        IPage<User> page = userMapper.selectPage(objectPage, null);
        System.out.println("return selectPage value:"+page);
    }

    @Test
    public void delete(){
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.isNotNull("name").ge("age",22).isNotNull("email");
        int i = userMapper.delete(wrapper);
        System.out.println("delete return count:"+i);
    }

    @Test
    public void selectOne(){
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.eq("name","Sandy");

        User user = userMapper.selectOne(wrapper);
        System.out.println(user);
    }

    @Test
    public void selectCount(){
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.eq("name","Sandy");
        Integer count = userMapper.selectCount(wrapper);
        System.out.println("count:"+count);
    }

    @Test
    public void selectMaps(){
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.isNotNull("name");
        List<Map<String, Object>> maps = userMapper.selectMaps(wrapper);
        for(Map<String,Object> map: maps){
            System.out.println(map);
        }
        Date date = new Date();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(df.format(date));
    }

    @Test
    public void selectPage(){
        Page<User> page = new Page<>(1, 5);
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        IPage<User> userIPage = userMapper.selectPage(page,wrapper);
        System.out.println(userIPage);
    }

    @Test
    public void selectMapPage(){
        Page<User> page = new Page<>(1, 5);
        QueryWrapper<User> wrapper = new QueryWrapper<>();

        IPage<Map<String, Object>> mapIPage =
                userMapper.selectMapsPage(page,wrapper);
        System.out.println(mapIPage);
    }

    @Test
    public void update(){
        User user = new User();
        user.setName("张三");

        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.eq("name","LxX");

        int update = userMapper.update(user, wrapper);
        System.out.println("update:"+update);
    }


}
