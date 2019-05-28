import com.yicj.mybatis2.Application;
import com.yicj.mybatis2.entity.User;
import com.yicj.mybatis2.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class SimpleMapperTest {

    @Autowired
    private UserMapper userMapper ;

    @Test
    public void testSelectList(){

        List<User> list = userMapper.selectList(null) ;
        list.forEach(System.out::println);
    }

    @Test
    public void testSelectCount(){
        System.out.println("hello world");
        Integer count = userMapper.selectCount(null) ;
        System.out.println("=============> "  + count);
    }

}
