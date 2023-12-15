package com.huadi.project.tpms.dao;

import com.huadi.project.tpms.entity.TextbookSend;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (TextbookSend)表数据库访问层
 *
 * @author makejava
 * @since 2023-07-25 10:42:49
 */
public interface TextbookSendDao {

    /**
     * 通过ID查询单条数据
     *
     * @param classId 主键
     * @return 实例对象
     */
    TextbookSend queryTextbookSendById(String classId);


    /**
     * 统计总行数
     *
     * @param textbookSend 查询条件
     * @return 总行数
     */
    long count(TextbookSend textbookSend);

    /**
     * 新增数据
     *
     * @param textbookSend 实例对象
     * @return 影响行数
     */
    int insert(TextbookSend textbookSend);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<TextbookSend> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<TextbookSend> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<TextbookSend> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<TextbookSend> entities);

    /**
     * 修改数据
     *
     * @param textbookSend 实例对象
     * @return 影响行数
     */
    int update(TextbookSend textbookSend);

    /**
     * 通过主键删除数据
     *
     * @param classId 主键
     * @return 影响行数
     */
    int deleteById(String classId);
    //数据库中全部内容的查询
    List<TextbookSend> textbookSendSelectAll(@Param("pageStart") int pageStart,@Param("pageEnd") int pageEnd);
    List<TextbookSend> textbookSendSelectAllTexS();

    //查询按钮的实现
    List<TextbookSend> queryTextbookSendByClassId(String classId);
    TextbookSend queryTextbookSendByISBN(String isbn);
    List<TextbookSend> queryTextbookSendByTextbookSendNumber(Integer textbookSendNumber);

}

