package com.huadi.project.tpms.service;

import com.huadi.project.tpms.entity.College;

import java.util.List;

/**
 * (College)表服务接口
 *
 * @author makejava
 * @since 2023-07-25 11:06:19
 */
public interface CollegeService {

    /**
     * 通过ID查询单条数据
     *
     * @param collegeId 主键
     * @return 实例对象
     */
    College queryById(String collegeId);



    /**
     * 新增数据
     *
     * @param college 实例对象
     * @return 实例对象
     */
    College insert(College college);

    /**
     * 修改数据
     *
     * @param college 实例对象
     * @return 实例对象
     */
    College update(College college);

    /**
     * 通过主键删除数据
     *
     * @param collegeId 主键
     * @return 是否成功
     */
    boolean deleteById(String collegeId);

    List<College> collegeSelectAll(int pageStart, int pageEnd);

    List<College> collegeSelectAllCol();

    //查询按钮的实现
    College queryCollegeByCollegeId(String collegeId);
    List<College> queryCollegeByCollegePlace(String collegePlace);
    College queryCollegeByCollegeName(String collegeId);

}
