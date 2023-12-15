package com.huadi.project.tpms.service;

import com.huadi.project.tpms.entity.Major;
import java.util.List;


/**
 * (Major)表服务接口
 *
 * @author makejava
 * @since 2023-07-25 10:54:17
 */
public interface MajorService {

    /**
     * 通过ID查询单条数据
     *
     * @param majorId 主键
     * @return 实例对象
     */
    Major queryById(String majorId);


    /**
     * 新增数据
     *
     * @param major 实例对象
     * @return 实例对象
     */
    Major insert(Major major);

    /**
     * 修改数据
     *
     * @param major 实例对象
     * @return 实例对象
     */
    Major update(Major major);

    /**
     * 通过主键删除数据
     *
     * @param majorId 主键
     * @return 是否成功
     */
    boolean deleteById(String majorId);
    //查询数据库全部内容
    List<Major> majorSelectAll(int pageStart, int pageEnd);

    List<Major> majorSelectAllMaj();

    //查询按钮的实现
    List<Major> queryMajorByMajorId(String majorId);
    List<Major> queryMajorByCollegeId(String collegeId);
    List<Major> queryMajorByMajorName(String majorName);

}
