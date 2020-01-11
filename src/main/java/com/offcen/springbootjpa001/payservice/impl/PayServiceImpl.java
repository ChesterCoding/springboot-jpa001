/**
 * @BelongsProject: springboot-jpa001
 * @BelongsPackage: com.offcen.springbootjpa001.payservice
 * @Author: Administrator
 * @CreateTime: 2020-01-11 17:14
 * @Description:
 */

package com.offcen.springbootjpa001.payservice.impl;

import com.offcen.springbootjpa001.payservice.PayService;

public class PayServiceImpl implements PayService {
    @Override
    public void add(Double money) {
        System.out.println("增加支付");
    }

    @Override
    public void del(Long id) {
        System.out.println("删除账单");
    }

    @Override
    public void update(Double money) {
        System.out.println("修改账单");
    }
}
