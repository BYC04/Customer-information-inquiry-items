package cn.wby.mapper;

import cn.wby.pojo.Customer;
import com.github.pagehelper.Page;

/**
 *Created by abc on 2019/6/13.
 */
public interface CustomerMapper {

    void create(Customer customer);

    void delete(Long id);

    Customer findById(Long id);

    void update(Customer customer);

    Page<Customer> findByPage(Customer customer);


}
