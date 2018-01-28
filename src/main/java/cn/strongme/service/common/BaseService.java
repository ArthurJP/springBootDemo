package cn.strongme.service.common;import cn.strongme.dao.common.BaseMapper;import cn.strongme.entity.common.BaseEntity;import com.github.pagehelper.PageHelper;import com.github.pagehelper.PageInfo;import com.google.common.collect.Lists;import org.springframework.beans.factory.annotation.Autowired;import org.springframework.transaction.annotation.Transactional;import java.util.List;/** * Service基类 */@Transactional(readOnly = true)public abstract class BaseService<D extends BaseMapper<T>, T extends BaseEntity> {    /**     * 持久层对象     */    @Autowired    protected D dao;    /**     * 获取单条数据     *     * @param id     * @return     */    public T get(String id) {        return dao.get(id);    }    public T get(T t) {        return dao.get(t);    }    /**     * 查询列表数据     *     * @param entity     * @return     */    public List<T> findList(T entity) {        return dao.findList(entity);    }    /**     * 查询分页数据     *     * @param entity     * @return     */    public PageInfo<T> findPage(T entity) {        if (entity.getPage() != null && entity.getRows() != null) {            PageHelper.startPage(entity.getPage(), entity.getRows());        }        return new PageInfo<>(this.dao.findList(entity));    }    /**     * 保存数据（插入或更新）     *     * @param entity     */    @Transactional(readOnly = false)    public void save(T entity) {        if (entity.isNewRecord()) {            entity.preInsert();            dao.insert(entity);        } else {            entity.preUpdate();            dao.update(entity);        }    }    /**     * 删除数据     *     * @param id     */    @Transactional(readOnly = false)    public void delete(String id) {        this.deleteBatch(Lists.newArrayList(id));    }    @Transactional(readOnly = false)    public void delete(T t) {        this.deleteBatch(Lists.newArrayList(t.getId()));    }    @Transactional(readOnly = false)    public void deleteBatch(List<String> idList) {        this.dao.deleteBatch(idList);    }    @Transactional(readOnly = false)    public void deleteByKeys(String keys) {        this.dao.deleteByKeys(keys);    }}