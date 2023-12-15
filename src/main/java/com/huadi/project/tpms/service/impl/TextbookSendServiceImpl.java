package com.huadi.project.tpms.service.impl;

import com.huadi.project.tpms.entity.TextbookSend;
import com.huadi.project.tpms.dao.TextbookSendDao;
import com.huadi.project.tpms.service.TextbookSendService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * (TextbookSend)表服务实现类
 *
 * @author makejava
 * @since 2023-07-25 10:42:49
 */
@Service("textbookSendService")
@Transactional
public class TextbookSendServiceImpl implements TextbookSendService {
    @Resource
    private TextbookSendDao textbookSendDao;

    /**
     * 通过ID查询单条数据
     *
     * @param classId 主键
     * @return 实例对象
     */
    @Override
    public TextbookSend queryTextbookSendById(String classId) {
        return this.textbookSendDao.queryTextbookSendById(classId);
    }

    /**
     * 分页查询
     *
     * @param textbookSend 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */

    /**
     * 新增数据
     *
     * @param textbookSend 实例对象
     * @return 实例对象
     */
    @Override
    public TextbookSend insert(TextbookSend textbookSend) {
        this.textbookSendDao.insert(textbookSend);
        return textbookSend;
    }

    /**
     * 修改数据
     *
     * @param textbookSend 实例对象
     * @return 实例对象
     */
    @Override
    public TextbookSend update(TextbookSend textbookSend) {
        this.textbookSendDao.update(textbookSend);
        return this.queryTextbookSendById(textbookSend.getClassId());
    }

    /**
     * 通过主键删除数据
     *
     * @param classId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String classId) {
        return this.textbookSendDao.deleteById(classId) > 0;
    }

    //实现数据库中全部内容的查询
    @Override
    public List<TextbookSend> textbookSendSelectAll(int pageStart, int pageEnd){
        return textbookSendDao.textbookSendSelectAll(pageStart,pageEnd);
    }

    @Override
    public List<TextbookSend> textbookSendSelectAllTexS(){
        return textbookSendDao.textbookSendSelectAllTexS();
    }
    //查询按钮的实现
    @Override
    public List<TextbookSend> queryTextbookSendByClassId(String classId) {

        return textbookSendDao.queryTextbookSendByClassId(classId);
    }
    @Override
    public TextbookSend queryTextbookSendByISBN(String isbn) {

        return this.textbookSendDao.queryTextbookSendByISBN(isbn);
    }
    @Override
    public List<TextbookSend> queryTextbookSendByTextbookSendNumber(Integer textbookSendNumber) {

        return textbookSendDao.queryTextbookSendByTextbookSendNumber(textbookSendNumber);
    }
}
