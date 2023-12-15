package com.huadi.project.tpms.service.impl;

import com.huadi.project.tpms.entity.College;
import com.huadi.project.tpms.dao.CollegeDao;
import com.huadi.project.tpms.service.CollegeService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * (College)表服务实现类
 *
 * @author makejava
 * @since 2023-07-25 11:06:19
 */
@Service("collegeService")
@Transactional
public class CollegeServiceImpl implements CollegeService {
    @Resource
    private CollegeDao collegeDao;

    /**
     * 通过ID查询单条数据
     *
     * @param collegeId 主键
     * @return 实例对象
     */
    @Override
    public College queryById(String collegeId) {
        return this.collegeDao.queryById(collegeId);
    }


    /**
     * 新增数据
     *
     * @param college 实例对象
     * @return 实例对象
     */
    @Override
    public College insert(College college) {
        this.collegeDao.insert(college);
        return college;
    }

    /**
     * 修改数据
     *
     * @param college 实例对象
     * @return 实例对象
     */
    @Override
    public College update(College college) {
        this.collegeDao.update(college);
        return this.queryById(college.getCollegeId());
    }

    /**
     * 通过主键删除数据
     *
     * @param collegeId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String collegeId) {
        return this.collegeDao.deleteById(collegeId) > 0;
    }


    @Override
    public List<College> collegeSelectAll(int pageStart, int pageEnd){
        return collegeDao.collegeSelectAll(pageStart,pageEnd);
    }

    @Override
    public List<College> collegeSelectAllCol(){
        return collegeDao.collegeSelectAllCol();
    }

    //查询按钮的实现
    @Override
    public College queryCollegeByCollegeId(String collegeId) {

        return this.collegeDao.queryCollegeByCollegeId(collegeId);
    }

    @Override
    public List<College> queryCollegeByCollegePlace(String collegePlace) {

        return collegeDao.queryCollegeByCollegePlace(collegePlace);
    }

    @Override
    public College queryCollegeByCollegeName(String CollegeName) {

        return this.collegeDao.queryCollegeByCollegeName(CollegeName);
    }
}
