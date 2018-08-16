package demo.mapper;


import demo.pojo.Role;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * RoleMapper
 *
 * @author lyq
 * @create 2018-08-16 14:37
 */
@Mapper
@Component
public interface RoleMapper {

    Role findRoleById(int id);

    int storeRole(Role role);

}
