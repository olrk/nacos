package com.alibaba.nacos.client.naming;

import com.alibaba.nacos.api.PropertyKeyConst;
import com.alibaba.nacos.api.exception.NacosException;
import com.alibaba.nacos.api.naming.NamingFactory;
import com.alibaba.nacos.api.naming.NamingService;
import com.alibaba.nacos.api.naming.pojo.Instance;
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
    public void testMyRegisterInstance() throws NacosException {
        Properties prop = new Properties();
        // 这个其实是namespaceId
        prop.put(PropertyKeyConst.NAMESPACE, "test");
        // 连接集群
//        prop.setProperty("serverAddr", "localhost:8848,localhost:8850,localhost:8852");
        // 连接单机
        prop.setProperty("serverAddr", "192.168.1.223");

        // 通过反射实例化NacosNamingService
        NamingService namingService = NamingFactory.createNamingService(prop);

        // 重载方法，会填充默认集群“DEFAULT”、默认分组“DEFAULT_GROUP”
        namingService.registerInstance("test.register.service", "1.1.1.1", 10000);
    }

    @Test
    public void testRegisterNoEphemeralInstance() throws NacosException, InterruptedException {
        Properties prop = new Properties();
        prop.setProperty("serverAddr", "192.168.1.223");
        prop.put(PropertyKeyConst.NAMESPACE, "test");
        NamingService namingService = NamingFactory.createNamingService(prop);

        Instance instance = new Instance();
        instance.setEphemeral(false);
        instance.setIp("2.2.2.2");
        instance.setPort(10000);

        namingService.registerInstance("test.register.no.ephemeral.service", instance);
        Thread.sleep(1000 * 5);
    }
}
