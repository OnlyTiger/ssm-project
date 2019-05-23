package com.ay.controller.test;

import com.ay.dao.AyUserDao;
import com.ay.model.AyUser;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Ay
 * @create 2018/05/16
 **/
public class AyUserDaoTest extends BaseJunit4Test{

    @Resource
    private AyUserDao ayUserDao;

    @Test
    public void testFindAll(){
//        List<AyUser> ayUserList = ayUserDao.findAll();
//        System.out.println(ayUserList);
    }

    @Test
    public void testFindById(){
        AyUser ayUser = ayUserDao.findById(1);
        System.out.println(ayUser);

       //JDBC
//        String findById =  "SELECT * FROM ay_user WHERE id = ? ";
//        PreparedStatement ps = conn.prepareStatement(findById);
//        ps.setString(1,id);

    }

    @Test
    public void testFindByName(){
        AyUser ayUser = ayUserDao.findByName("ay");
        System.out.println(ayUser);
    }

    @Test
    public void testCountByName(){
        int count = ayUserDao.countByName("ay");
        System.out.println(count);
    }

    @Test
    public void testInsert(){

        for (int i = 0; i < 10; i++) {
            AyUser ayUser = new AyUser();
            ayUser.setName("love");
            ayUser.setPassword("123");
            int count = ayUserDao.insert(ayUser);
            System.out.println(count);
        }
    }

    @Test
    public void testUpdate(){
        AyUser ayUser = new AyUser();
        ayUser.setId(1);
        ayUser.setName("ay001");
        ayUser.setPassword("888");
        int count = ayUserDao.update(ayUser);
        System.out.println(count);

    }
    @Test
    public void testDelete(){

        int id = 26;
        int count = ayUserDao.delete(id);
        System.out.println(count);
    }

    @Test
    public void testDeleteByName(){
        String name = "love";
        int count = ayUserDao.deleteByName(name);
        System.out.println(count);

    }

    @Test
    public void testFindByNameAndPassword(){
        List<AyUser> users = ayUserDao.findByNameAndPassword("ay", null);
        System.out.println(users);
    }

    @Test
    public void testFindByIds(){
        List<Integer> ids = new ArrayList<>();
        ids.add(1);
        ids.add(2);
        List<AyUser> users =  ayUserDao.findByIds(ids);
        System.out.println(users);

    }
    @Test
    public void testRowBounds(){
        //int offset(第几条数据开始), int limit（取几条）
//        RowBounds rowBounds = new RowBounds(2,3);
//        List<AyUser> ayUsers = ayUserDao.findAll(rowBounds);
//        System.out.println(ayUsers);

    }

    @Test
    public void testPageHelper(){
        PageHelper.startPage(1, 5);
        List<AyUser> ayUsers = ayUserDao.findAll();
        PageInfo pageInfo = new PageInfo(ayUsers);
        System.out.println(pageInfo);
    }
}
