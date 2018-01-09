package cn.springcloud.codegen.component.impl;

import cn.springcloud.codegen.engine.context.SkeletonContext;
import cn.springcloud.codegen.engine.exception.SkeletonException;
import cn.springcloud.codegen.engine.property.SkeletonProperties;
import cn.springcloud.codegen.framework.service.SkeletonService;
import freemarker.template.TemplateException;

import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: zzf
 * @date: 2018/1/8
 * @time: 22:48
 * @description : do some thing
 */
public class ConfigServiceImpl implements SkeletonService {
    @Override
    public void generate(SkeletonContext skeletonContext, SkeletonProperties skeletonProperties) throws SkeletonException, TemplateException, IOException {

   /*     // 创建Java类文件到main/java 目录下
        new EurekaJavaClassGenerator(skeletonContext, skeletonProperties).generate();

        // 创建文件到main/resources目录下面
        new EurekaResourcesGenerator(skeletonContext, skeletonProperties).generate();
        new LogbackXmlGenerator(skeletonContext, skeletonProperties, "eureka").generate();

        // 生产pom 文件到跟目录下
        new EurekaPomXmlGenerator(skeletonContext, skeletonProperties).generate();
*/
    }
}
