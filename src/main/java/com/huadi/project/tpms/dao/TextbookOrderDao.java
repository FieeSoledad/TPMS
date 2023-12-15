package com.huadi.project.tpms.dao;

import com.huadi.project.tpms.entity.TextbookOrder;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (TextbookOrder)表数据库访问层
 *
 * @author makejava
 * @since 2023-07-25 10:44:40
 */
public interface TextbookOrderDao {

    /**
     * 通过ID查询单条数据
     *
     * @param textbookOrderId 主键
     * @return 实例对象
     */
    TextbookOrder queryTextbookOrderById(String textbookOrderId);

    /**
     * 查询指定行数据
     *
     * @param textbookOrder 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */

    /**
     * 统计总行数
     *
     * @param textbookOrder 查询条件
     * @return 总行数
     */
    long count(TextbookOrder textbookOrder);

    /**
     * 新增数据
     *
     * @param textbookOrder 实例对象
     * @return 影响行数
     */
    int insert(TextbookOrder textbookOrder);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<TextbookOrder> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<TextbookOrder> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<TextbookOrder> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<TextbookOrder> entities);

    /**
     * 修改数据
     *
     * @param textbookOrder 实例对象
     * @return 影响行数
     */
    int update(TextbookOrder textbookOrder);

    /**
     * 通过主键删除数据
     *
     * @param textbookOrderId 主键
     * @return 影响行数
     */
    int deleteById(String textbookOrderId);

    List<TextbookOrder> textbookOrderSelectAll(@Param("pageStart") int pageStart,@Param("pageEnd") int pageEnd);
    List<TextbookOrder> textbookOrderSelectAllTexO();

    //查询按钮的实现
    TextbookOrder queryTextbookOrderByTextbookOrderId(String textbookOrderId);
    TextbookOrder queryTextbookOrderByISBN(String isbn);
    List<TextbookOrder> queryTextbookOrderByTextbookOrderNumber(Integer textbookOrderNumber);
    List<TextbookOrder> queryTextbookOrderByTextbookOrderState(String textbookOrderState);
    List<TextbookOrder> queryTextbookOrderByTextbookOrderTime(String textbookOrderTime);
    List<TextbookOrder> queryTextbookOrderByTextbookOrderPrice(Integer textbookOrderPrice);

}

