package cn.wby.service;

import cn.wby.pojo.Customer;
import cn.wby.pojo.PageBean;

/**
 * @author wby
 * Created by abc on 2019/6/13.
 */
public interface CustomerService extends BaseService<Customer> {

    /**
     * 分页查询
     * @param customer 查询条件
     * @param pageCode 当前页
     * @param pageSize 每页的记录数
     * @return
     */
    PageBean findByPage(Customer customer, int pageCode, int pageSize);

}
