package cn.springcloud.codegen.config;

/**
 * <p>Title: Nepxion Skeleton</p>
 * <p>Description: Nepxion Skeleton For Freemarker</p>
 * <p>Copyright: Copyright (c) 2017</p>
 * <p>Company: Nepxion</p>
 * @author Haojun Ren
 * @email 1394997@qq.com
 * @version 1.0
 */

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import cn.springcloud.codegen.framework.service.SkeletonService;
import cn.springcloud.codegen.service.SkeletonServiceImpl;

@Configuration
@Import({ cn.springcloud.codegen.framework.config.SkeletonWebConfig.class })
public class SkeletonServiceConfig {
    @Bean
    public SkeletonService skeletonService() {
        return new SkeletonServiceImpl();
    }
}