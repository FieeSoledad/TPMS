package com.huadi.project.tpms.service.impl;

import com.huadi.project.tpms.entity.Userin;
import com.huadi.project.tpms.dao.UserinDao;
import com.huadi.project.tpms.service.UserinService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Userin)表服务实现类
 *
 * @author makejava
 * @since 2023-07-25 10:40:44
 */
@Service("userinService")
@Transactional
public class UserinServiceImpl implements UserinService {
    @Resource
    private UserinDao userinDao;

    /**
     * 通过ID查询单条数据
     *
     * @param userId 主键
     * @return 实例对象
     */
    @Override
    public Userin queryUserinById(String userId) {
        return this.userinDao.queryUserinById(userId);
    }

    /**
     * 分页查询
     *
     * @param userin 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */

    /**
     * 新增数据
     *
     * @param userin 实例对象
     * @return 实例对象
     */
    @Override
    public Userin insert(Userin userin) {
        this.userinDao.insert(userin);
        return userin;
    }

    /**
     * 修改数据
     *
     * @param userin 实例对象
     * @return 实例对象
     */
    @Override
    public Userin update(Userin userin) {
        this.userinDao.update(userin);
        return this.queryUserinById(userin.getUserId());
    }

    /**
     * 通过主键删除数据
     *
     * @param userId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String userId) {
        return this.userinDao.deleteById(userId) > 0;
    }

    @Override
    public List<Userin> userinSelectAll(int pageStart, int pageEnd){
        return userinDao.userinSelectAll(pageStart,pageEnd);
    }

    @Override
    public List<Userin> userinSelectAllUse(){
        return userinDao.userinSelectAllUse();
    }

    //查询按钮的实现
    @Override
    public Userin queryUserinByUserId(String userId) {

        return this.userinDao.queryUserinByUserId(userId);
    }
    @Override
    public List<Userin> queryUserinByMajorId(String majorId) {

        return userinDao.queryUserinByMajorId(majorId);
    }
    @Override
    public List<Userin> queryUserinByRole(String role) {

        return userinDao.queryUserinByRole(role);
    }
    @Override
    public List<Userin> queryUserinByUserName(String userName) {

        return userinDao.queryUserinByUserName(userName);
    }
}

