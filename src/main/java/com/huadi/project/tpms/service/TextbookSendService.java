package com.huadi.project.tpms.service;

import com.huadi.project.tpms.entity.TextbookSend;

import java.util.List;

/**
 * (TextbookSend)表服务接口
 *
 * @author makejava
 * @since 2023-07-25 10:42:49
 */
public interface TextbookSendService {

    /**
     * 通过ID查询单条数据
     *
     * @param classId 主键
     * @return 实例对象
     */
    TextbookSend queryTextbookSendById(String classId);


    /**
     * 新增数据
     *
     * @param textbookSend 实例对象
     * @return 实例对象
     */
    TextbookSend insert(TextbookSend textbookSend);

    /**
     * 修改数据
     *
     * @param textbookSend 实例对象
     * @return 实例对象
     */
    TextbookSend update(TextbookSend textbookSend);

    /**
     * 通过主键删除数据
     *
     * @param classId 主键
     * @return 是否成功
     */
    boolean deleteById(String classId);
    //实现全部数据库内容的查询
    List<TextbookSend> textbookSendSelectAll(int pageStart, int pageEnd);

    List<TextbookSend> textbookSendSelectAllTexS();
    //查询按钮的实现
    List<TextbookSend> queryTextbookSendByClassId(String classId);
    TextbookSend queryTextbookSendByISBN(String isbn);
    List<TextbookSend> queryTextbookSendByTextbookSendNumber(Integer textbookSendNumber);

}
