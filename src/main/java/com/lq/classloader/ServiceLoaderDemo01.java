package com.lq.classloader;

import java.util.ServiceLoader;

/**
 * ServiceLoaderDemo01
 *
 * @author qingqing
 * @date 2025/1/4
 */

public class ServiceLoaderDemo01 {
    public static void main(String[] args) {
        ServiceLoader<InterfaceDemo01> load = ServiceLoader.load(InterfaceDemo01.class);
        for (InterfaceDemo01 interfaceDemo01 : load) {
        }
    }
}
