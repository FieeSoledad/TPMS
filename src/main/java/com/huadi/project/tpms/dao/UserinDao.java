package com.huadi.project.tpms.dao;

import com.huadi.project.tpms.entity.Userin;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (Userin)表数据库访问层
 *
 * @author makejava
 * @since 2023-07-25 10:40:42
 */
public interface UserinDao {

    /**
     * 通过ID查询单条数据
     *
     * @param userId 主键
     * @return 实例对象
     */
    Userin queryUserinById(String userId);


    /**
     * 统计总行数
     *
     * @param userin 查询条件
     * @return 总行数
     */
    long count(Userin userin);

    /**
     * 新增数据
     *
     * @param userin 实例对象
     * @return 影响行数
     */
    int insert(Userin userin);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Userin> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Userin> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Userin> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<Userin> entities);

    /**
     * 修改数据
     *
     * @param userin 实例对象
     * @return 影响行数
     */
    int update(Userin userin);

    /**
     * 通过主键删除数据
     *
     * @param userId 主键
     * @return 影响行数
     */
    int deleteById(String userId);

    //实现数据库中全部内容的查询
    List<Userin> userinSelectAll(@Param("pageStart") int pageStart,@Param("pageEnd") int pageEnd);
    List<Userin> userinSelectAllUse();

    //查询按钮的实现
    Userin queryUserinByUserId(String userId);
    List<Userin> queryUserinByMajorId(String majorId);
    List<Userin> queryUserinByRole(String role);
    List<Userin> queryUserinByUserName(String userName);

}

