package com.huadi.project.tpms.service;

import com.huadi.project.tpms.entity.TextbookOrder;

import java.util.List;

/**
 * (TextbookOrder)表服务接口
 *
 * @author makejava
 * @since 2023-07-25 10:44:40
 */
public interface TextbookOrderService {

    /**
     * 通过ID查询单条数据
     *
     * @param textbookOrderId 主键
     * @return 实例对象
     */
    TextbookOrder queryTextbookOrderById(String textbookOrderId);



    /**
     * 新增数据
     *
     * @param textbookOrder 实例对象
     * @return 实例对象
     */
    TextbookOrder insert(TextbookOrder textbookOrder);

    /**
     * 修改数据
     *
     * @param textbookOrder 实例对象
     * @return 实例对象
     */
    TextbookOrder update(TextbookOrder textbookOrder);

    /**
     * 通过主键删除数据
     *
     * @param textbookOrderId 主键
     * @return 是否成功
     */
    boolean deleteById(String textbookOrderId);
    List<TextbookOrder> textbookOrderSelectAll(int pageStart, int pageEnd);

    List<TextbookOrder> textbookOrderSelectAllTexO();

    //查询按钮的实现
    TextbookOrder queryTextbookOrderByTextbookOrderId(String textbookOrderId);
    TextbookOrder queryTextbookOrderByISBN(String isbn);
    List<TextbookOrder> queryTextbookOrderByTextbookOrderNumber(Integer textbookOrderNumber);
    List<TextbookOrder> queryTextbookOrderByTextbookOrderState(String textbookOrderState);
    List<TextbookOrder> queryTextbookOrderByTextbookOrderTime(String textbookOrderTime);
    List<TextbookOrder> queryTextbookOrderByTextbookOrderPrice(Integer textbookOrderPrice);


}
