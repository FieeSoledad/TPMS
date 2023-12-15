package com.huadi.project.tpms.service.impl;

import com.huadi.project.tpms.entity.Textbook;
import com.huadi.project.tpms.dao.TextbookDao;
import com.huadi.project.tpms.service.TextbookService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Textbook)表服务实现类
 *
 * @author makejava
 * @since 2023-07-25 10:48:09
 */
@Service("textbookService")
@Transactional
public class TextbookServiceImpl implements TextbookService {
    @Resource
    private TextbookDao textbookDao;

    /**
     * 通过ID查询单条数据
     *
     * @param isbn 主键
     * @return 实例对象
     */
    @Override
    public Textbook queryTextbookById(String isbn) {
        return this.textbookDao.queryTextbookById(isbn);
    }




    /**
     * 新增数据
     *
     * @param textbook 实例对象
     * @return 实例对象
     */
    @Override
    public Textbook insert(Textbook textbook) {
        this.textbookDao.insert(textbook);
        return textbook;
    }

    /**
     * 修改数据
     *
     * @param textbook 实例对象
     * @return 实例对象
     */
    @Override
    public Textbook update(Textbook textbook) {
        this.textbookDao.update(textbook);
        return this.queryTextbookById(textbook.getIsbn());
    }

    /**
     * 通过主键删除数据
     *
     * @param isbn 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String isbn) {
        return this.textbookDao.deleteById(isbn) > 0;
    }
    @Override
    public List<Textbook> textbookSelectAll(int pageStart, int pageEnd){
        return textbookDao.textbookSelectAll(pageStart,pageEnd);
    }

    @Override
    public List<Textbook> textbookSelectAllTex(){
        return textbookDao.textbookSelectAllTex();
    }
    //查询按钮的是实现
    @Override
    public Textbook queryTextbookByISBN(String isbn) {

        return this.textbookDao.queryTextbookByISBN(isbn);
    }
    @Override
    public List<Textbook> queryTextbookByCourseId(String courseId) {

        return textbookDao.queryTextbookByCourseId(courseId);
    }
    @Override
    public Textbook queryTextbookByTextbookName(String textbookName) {

        return this.textbookDao.queryTextbookByTextbookName(textbookName);
    }
    @Override
    public List<Textbook> queryTextbookByTextbookQuantity(Integer textbookQuantity) {

        return textbookDao.queryTextbookByTextbookQuantity(textbookQuantity);
    }
    @Override
    public List<Textbook> queryTextbookByTextbookPublisher(String textbookPublisher) {

        return textbookDao.queryTextbookByTextbookPublisher(textbookPublisher);
    }
    @Override
    public List<Textbook> queryTextbookByTextbookLocation(String textbookLocation) {

        return textbookDao.queryTextbookByTextbookLocation(textbookLocation);
    }



}
