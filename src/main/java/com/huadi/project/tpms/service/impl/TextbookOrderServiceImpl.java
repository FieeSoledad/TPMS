package com.huadi.project.tpms.service.impl;

import com.huadi.project.tpms.entity.TextbookOrder;
import com.huadi.project.tpms.dao.TextbookOrderDao;
import com.huadi.project.tpms.service.TextbookOrderService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import javax.annotation.Resource;
import java.util.List;

/**
 * (TextbookOrder)表服务实现类
 *
 * @author makejava
 * @since 2023-07-25 10:44:40
 */
@Service("textbookOrderService")
@Transactional
public class TextbookOrderServiceImpl implements TextbookOrderService {
    @Resource
    private TextbookOrderDao textbookOrderDao;

    /**
     * 通过ID查询单条数据
     *
     * @param textbookOrderId 主键
     * @return 实例对象
     */
    @Override
    public TextbookOrder queryTextbookOrderById(String textbookOrderId) {
        return this.textbookOrderDao.queryTextbookOrderById(textbookOrderId);
    }

    /**
     * 分页查询
     *
     * @param textbookOrder 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */


    /**
     * 新增数据
     *
     * @param textbookOrder 实例对象
     * @return 实例对象
     */
    @Override
    public TextbookOrder insert(TextbookOrder textbookOrder) {
        this.textbookOrderDao.insert(textbookOrder);
        return textbookOrder;
    }
    public TextbookOrder queryTextbookOrderByTextbookOrderId(String textbookOrderId) {

        return this.textbookOrderDao.queryTextbookOrderByTextbookOrderId(textbookOrderId);
    }
    public TextbookOrder queryTextbookOrderByISBN(String isbn) {

        return this.textbookOrderDao.queryTextbookOrderByISBN(isbn);
    }
    @Override
    public List<TextbookOrder> queryTextbookOrderByTextbookOrderNumber(Integer textbookOrderNumber) {

        return textbookOrderDao.queryTextbookOrderByTextbookOrderNumber(textbookOrderNumber);
    }
    @Override
    public List<TextbookOrder> queryTextbookOrderByTextbookOrderState(String textbookOrderState) {

        return textbookOrderDao.queryTextbookOrderByTextbookOrderState(textbookOrderState);
    }
    @Override
    public List<TextbookOrder> queryTextbookOrderByTextbookOrderTime(String textbookOrderTime) {

        return textbookOrderDao.queryTextbookOrderByTextbookOrderTime(textbookOrderTime);
    }
    @Override
    public List<TextbookOrder> queryTextbookOrderByTextbookOrderPrice(Integer textbookOrderPrice) {

        return textbookOrderDao.queryTextbookOrderByTextbookOrderPrice(textbookOrderPrice);
    }

    /**
     * 修改数据
     *
     * @param textbookOrder 实例对象
     * @return 实例对象
     */
    @Override
    public TextbookOrder update(TextbookOrder textbookOrder) {
        this.textbookOrderDao.update(textbookOrder);
        return this.queryTextbookOrderById(textbookOrder.getTextbookOrderId());
    }

    /**
     * 通过主键删除数据
     *
     * @param textbookOrderId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String textbookOrderId) {
        return this.textbookOrderDao.deleteById(textbookOrderId) > 0;
    }

    //查询数据库中全部的内容
    @Override
    public List<TextbookOrder> textbookOrderSelectAll(int pageStart, int pageEnd){
        return textbookOrderDao.textbookOrderSelectAll(pageStart,pageEnd);
    }

    @Override
    public List<TextbookOrder> textbookOrderSelectAllTexO(){
        return textbookOrderDao.textbookOrderSelectAllTexO();
    }

    //查询按钮的实现

}
