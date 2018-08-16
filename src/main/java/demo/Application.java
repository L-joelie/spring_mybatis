package demo;

import demo.mapper.RoleMapper;
import demo.pojo.Role;
import demo.service.RoleService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * demo.Application
 *
 * @author lyq
 * @create 2018-08-16 14:44
 */
@SpringBootApplication
@EnableTransactionManagement
public class Application {

    public static void main(String[] args) {
        ApplicationContext con = SpringApplication.run(Application.class, args);
        RoleMapper mapper = con.getBean("roleMapper", RoleMapper.class);
        RoleService roleService = con.getBean("myBatisRoleService", RoleService.class);
        roleService.swapNote(3, 4);
    }
}
