package com.alibaba.nacos.client.naming;

import com.alibaba.nacos.api.PropertyKeyConst;
import com.alibaba.nacos.api.exception.NacosException;
import com.alibaba.nacos.api.naming.NamingFactory;
import com.alibaba.nacos.api.naming.NamingService;
import org.junit.Test;

import java.util.Properties;

/**
 * 服务注册与发现测试
 *
 * @author liaoruikai
 * @date 2023-04-18
 */
public class MyNacosNamingServiceTest {
    @Test
    public void testMyRegisterInstance() throws NacosException, InterruptedException {
        Properties prop = new Properties();
        prop.setProperty("serverAddr", "172.16.84.51");
        prop.put(PropertyKeyConst.NAMESPACE, "test");

        // 通过反射实例化NacosNamingService
        NamingService namingService = NamingFactory.createNamingService(prop);

        // 重载方法，会填充默认集群“DEFAULT”、默认分组“DEFAULT_GROUP”
        namingService.registerInstance("test.register.service", "1.1.1.1", 10000);
    }
}
