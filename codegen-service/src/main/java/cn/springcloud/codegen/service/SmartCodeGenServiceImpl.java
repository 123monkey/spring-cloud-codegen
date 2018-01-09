package cn.springcloud.codegen.service;

/**
 * <p>Title: Nepxion Skeleton</p>
 * <p>Description: Nepxion Skeleton For Freemarker</p>
 * <p>Copyright: Copyright (c) 2017</p>
 * <p>Company: Nepxion</p>
 * @author Haojun Ren
 * @email 1394997@qq.com
 * @version 1.0
 */

import java.io.IOException;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

import cn.springcloud.codegen.component.impl.ConfigServiceImpl;
import cn.springcloud.codegen.component.impl.EurekaServiceImpl;
import cn.springcloud.codegen.component.impl.ZuulServiceImpl;
import cn.springcloud.codegen.engine.context.SkeletonContext;
import cn.springcloud.codegen.engine.exception.SkeletonException;
import cn.springcloud.codegen.engine.property.SkeletonProperties;
import cn.springcloud.codegen.framework.annotation.SkeletonPlugin;
import cn.springcloud.codegen.framework.service.SkeletonService;
import freemarker.template.TemplateException;

@Component
@SkeletonPlugin
public class SmartCodeGenServiceImpl implements SkeletonService {
    @Override
    public void generate(SkeletonContext skeletonContext, SkeletonProperties skeletonProperties) throws SkeletonException, TemplateException, IOException {
        String scAlone = skeletonProperties.getString("sc-alone-radio");
        if (StringUtils.equals(scAlone, "eureka-server")) {
            new EurekaServiceImpl().generate(skeletonContext, skeletonProperties);
        } else if (StringUtils.equals(scAlone, "zuul-server")) {
            new ZuulServiceImpl().generate(skeletonContext, skeletonProperties);
        } else if (StringUtils.equals(scAlone, "config-server")) {
            new ConfigServiceImpl().generate(skeletonContext, skeletonProperties);
        }
    }
}