import org.junit.Test;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.samples.petclinic.PetClinicApplication;
import org.springframework.samples.petclinic.dao.mapper.UserMapper;
import org.springframework.samples.petclinic.model.User;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;


import java.util.List;
@RunWith(SpringRunner.class)
@SpringBootTest(classes = PetClinicApplication.class)
public class TestUserMapper {

    @Autowired
    private UserMapper userMapper;
    @Test
    public void testFindByName(){
        System.out.println(userMapper);
        List<User> users = userMapper.getUserList();
        System.out.println("###########3name="+users.get(0).getName());
        System.out.println("###########phone="+users.get(0).getPhone());
    }
}
