package com.huadi.project.tpms.service;

import com.huadi.project.tpms.entity.Textbook;

import java.util.List;

/**
 * (Textbook)表服务接口
 *
 * @author makejava
 * @since 2023-07-25 10:48:09
 */
public interface TextbookService {

    /**
     * 通过ID查询单条数据
     *
     * @param isbn 主键
     * @return 实例对象
     */
    Textbook queryTextbookById(String isbn);

    //查询按钮的实现
    Textbook queryTextbookByISBN(String isbn);
    List<Textbook> queryTextbookByCourseId(String courseId);
    Textbook queryTextbookByTextbookName(String textbookName);
    List<Textbook> queryTextbookByTextbookQuantity(Integer textbookQuantity);
    List<Textbook> queryTextbookByTextbookPublisher(String textbookPublisher);
    List<Textbook> queryTextbookByTextbookLocation(String textbookLocation);



    /**
     * 新增数据
     *
     * @param textbook 实例对象
     * @return 实例对象
     */
    Textbook insert(Textbook textbook);

    /**
     * 修改数据
     *
     * @param textbook 实例对象
     * @return 实例对象
     */
    Textbook update(Textbook textbook);

    /**
     * 通过主键删除数据
     *
     * @param isbn 主键
     * @return 是否成功
     */
    boolean deleteById(String isbn);
    List<Textbook> textbookSelectAll(int pageStart, int pageEnd);

    List<Textbook> textbookSelectAllTex();

}
