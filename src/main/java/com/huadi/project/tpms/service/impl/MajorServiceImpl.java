package com.huadi.project.tpms.service.impl;

import com.huadi.project.tpms.entity.Major;
import com.huadi.project.tpms.dao.MajorDao;
import com.huadi.project.tpms.service.MajorService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Major)表服务实现类
 *
 * @author makejava
 * @since 2023-07-25 10:54:17
 */
@Service("majorService")
@Transactional
public class MajorServiceImpl implements MajorService {
    @Resource
    private MajorDao majorDao;

    /**
     * 通过ID查询单条数据
     *
     * @param majorId 主键
     * @return 实例对象
     */
    @Override
    public Major queryById(String majorId) {
        return this.majorDao.queryById(majorId);
    }



    /**
     * 新增数据
     *
     * @param major 实例对象
     * @return 实例对象
     */
    @Override
    public Major insert(Major major) {
        this.majorDao.insert(major);
        return major;
    }

    /**
     * 修改数据
     *
     * @param major 实例对象
     * @return 实例对象
     */
    @Override
    public Major update(Major major) {
        this.majorDao.update(major);
        return this.queryById(major.getMajorId());
    }

    /**
     * 通过主键删除数据
     *
     * @param majorId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String majorId) {
        return this.majorDao.deleteById(majorId) > 0;
    }

    //查询数据库全部内容
    @Override
    public List<Major> majorSelectAll(int pageStart, int pageEnd){
        return majorDao.majorSelectAll(pageStart,pageEnd);
    }

    @Override
    public List<Major> majorSelectAllMaj(){
        return majorDao.majorSelectAllMaj();
    }

    //查询按钮的实现
    @Override
    public List<Major> queryMajorByMajorId(String majorId) {

        return majorDao.queryMajorByMajorId(majorId);
    }
    @Override
    public List<Major> queryMajorByCollegeId(String collegeId) {

        return majorDao.queryMajorByCollegeId(collegeId);
    }
    @Override
    public List<Major> queryMajorByMajorName(String majorName) {

        return majorDao.queryMajorByMajorName(majorName);
    }
}
