package Test;

import com.itheima.pojo.Customer;
import com.itheima.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

public class CustomerTest {
    @Test
    public void findById() throws Exception {
        InputStream is = Resources.getResourceAsStream("mybatis.config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        Customer customer=new Customer();
        customer.setUsername("jack");
        customer.setJobs("teacher");
        List<Customer> customers=sqlSession.selectList("findcustomer",customer);
       for(Customer customer1: customers){
           System.out.println(customer1);
       }
        sqlSession.close();
    }
}
