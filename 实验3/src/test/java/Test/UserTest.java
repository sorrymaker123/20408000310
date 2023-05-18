package Test;

import com.itheima.pojo.Customer;
import com.itheima.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import javax.annotation.Resource;
import java.io.InputStream;

public class UserTest {

    @Test
    public void findById() throws Exception {
        InputStream is = Resources.getResourceAsStream("mybatis.config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        User user = sqlSession.selectOne("findcustomer");
        System.out.println(user);
        sqlSession.close();
    }

    @Test
    public void addId() throws Exception {
        InputStream is = Resources.getResourceAsStream("mybatis.config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        User user=new User();
        user.setId(4);
        user.setName("小航");
        user.setAge(122);
        int row = sqlSession.insert("addUser", user);
        System.out.println(row);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void DeleteById() throws Exception {
        InputStream is = Resources.getResourceAsStream("mybatis.config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        int user = sqlSession.delete("deleteUser", 4);
        System.out.println(user);
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void UpdateById() throws Exception {
        InputStream is = Resources.getResourceAsStream("mybatis.config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        User user=new User();
        user.setId(1);
        user.setName("小杠");
        user.setAge(1);
        int row = sqlSession.update("updateUser", user);
        System.out.println(row);
        sqlSession.commit();
        sqlSession.close();
    }
}