package com.huadi.project.tpms.dao;

import com.huadi.project.tpms.entity.Textbook;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (Textbook)表数据库访问层
 *
 * @author makejava
 * @since 2023-07-25 10:48:09
 */
public interface TextbookDao {

    /**
     * 通过ID查询单条数据
     *
     * @param isbn 主键
     * @return 实例对象
     */
    Textbook queryTextbookById(String isbn);


    /**
     * 统计总行数
     *
     * @param textbook 查询条件
     * @return 总行数
     */
    long count(Textbook textbook);

    /**
     * 新增数据
     *
     * @param textbook 实例对象
     * @return 影响行数
     */
    int insert(Textbook textbook);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Textbook> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Textbook> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Textbook> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<Textbook> entities);

    /**
     * 修改数据
     *
     * @param textbook 实例对象
     * @return 影响行数
     */
    int update(Textbook textbook);

    /**
     * 通过主键删除数据
     *
     * @param isbn 主键
     * @return 影响行数
     */
    int deleteById(String isbn);

    //查询全部数据库中的内容
    List<Textbook> textbookSelectAll(@Param("pageStart") int pageStart,@Param("pageEnd") int pageEnd);
    List<Textbook> textbookSelectAllTex();
    //查询按钮的实现
    Textbook queryTextbookByISBN(String isbn);
    List<Textbook> queryTextbookByCourseId(String courseId);
    Textbook queryTextbookByTextbookName(String textbookName);
    List<Textbook> queryTextbookByTextbookQuantity(Integer textbookQuantity);
    List<Textbook> queryTextbookByTextbookPublisher(String textbookPublisher);
    List<Textbook> queryTextbookByTextbookLocation(String textbookLocation);

}

