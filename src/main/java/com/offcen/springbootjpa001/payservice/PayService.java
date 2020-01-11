/**
 * @BelongsProject: springboot-jpa001
 * @BelongsPackage: com.offcen.springbootjpa001.payservice
 * @Author: Administrator
 * @CreateTime: 2020-01-11 17:12
 * @Description:
 */

package com.offcen.springbootjpa001.payservice;

public interface PayService {

    public void add(Double money);

    public void del(Long id);

    public void update(Double money);

}
