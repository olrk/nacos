/*
 * Copyright 1999-2018 Alibaba Group Holding Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.alibaba.nacos.api.naming;

/**
 * Some keys of metadata that are recognized by Nacos.
 *
 * @author nkorange
 * @since 1.0.0
 */
public class PreservedMetadataKeys {
    
    /**
     * The key to indicate the registry source of service instance, such as Dubbo, SpringCloud, etc.
     */
    public static final String REGISTER_SOURCE = "preserved.register.source";

    /**
     * 实例心跳超时时间，默认15s，超时标记为不健康
     */
    public static final String HEART_BEAT_TIMEOUT = "preserved.heart.beat.timeout";

    /**
     * 实例超时删除时间，默认30s
     */
    public static final String IP_DELETE_TIMEOUT = "preserved.ip.delete.timeout";

    /**
     * 实例心跳间隙，默认5s
     */
    public static final String HEART_BEAT_INTERVAL = "preserved.heart.beat.interval";

    /**
     * 实例ID生成器，默认【simple】
     */
    public static final String INSTANCE_ID_GENERATOR = "preserved.instance.id.generator";
}
