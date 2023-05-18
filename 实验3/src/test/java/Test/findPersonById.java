package Test;

import com.itheima.pojo.Customer;
import com.itheima.pojo.IdCard;
import com.itheima.pojo.Person;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

public class findPersonById {
    @Test
    public void findById() throws Exception {
        InputStream is = Resources.getResourceAsStream("mybatis.config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession = sqlSessionFactory.openSession();

       Person person =  sqlSession.selectOne("findPersonById",1);

        System.out.println(person);

        sqlSession.close();
    }
}
