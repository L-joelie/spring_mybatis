package demo.service.impl;

import demo.mapper.RoleMapper;
import demo.pojo.Role;
import demo.service.RoleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * MyBatisRoleService
 *
 * @author lyq
 * @create 2018-08-16 15:14
 */
@Service
public class MyBatisRoleService implements RoleService {

    private static final Logger log = LoggerFactory.getLogger(MyBatisRoleService.class);

    @Autowired
    private RoleMapper roleMapper;

    @Override
    @Transactional
    public void swapNote(int id1, int id2) {
        Role r1 = roleMapper.findRoleById(id1);
        Role r2 = roleMapper.findRoleById(id2);
        if(r1 == null || r2 == null){
            log.info("角色不存在，不做交换");
            return;
        }
        else {
            String note = r1.getRole();
            r1.setRole(r2.getRole());
            r2.setRole(note);
            roleMapper.storeRole(r1);
            roleMapper.storeRole(r2);
        }
    }
}
