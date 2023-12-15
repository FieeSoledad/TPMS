package com.huadi.project.tpms.service;

import com.huadi.project.tpms.entity.Userin;

import java.util.List;

/**
 * (Userin)表服务接口
 *
 * @author makejava
 * @since 2023-07-25 10:40:44
 */
public interface UserinService {

    /**
     * 通过ID查询单条数据
     *
     * @param userId 主键
     * @return 实例对象
     */
    Userin queryUserinById(String userId);

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
    Userin insert(Userin userin);

    /**
     * 修改数据
     *
     * @param userin 实例对象
     * @return 实例对象
     */
    Userin update(Userin userin);

    /**
     * 通过主键删除数据
     *
     * @param userId 主键
     * @return 是否成功
     */
    boolean deleteById(String userId);
    //实现数据库中全部内容的查询
    List<Userin> userinSelectAll(int pageStart, int pageEnd);

    List<Userin> userinSelectAllUse();

    //查询按钮的实现
    Userin queryUserinByUserId(String userId);
    List<Userin> queryUserinByMajorId(String majorId);
    List<Userin> queryUserinByRole(String role);
    List<Userin> queryUserinByUserName(String userName);


}
