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

import cn.springcloud.codegen.engine.context.SkeletonContext;
import cn.springcloud.codegen.engine.exception.SkeletonException;
import cn.springcloud.codegen.engine.property.SkeletonProperties;
import cn.springcloud.codegen.framework.service.SkeletonService;
import cn.springcloud.codegen.generator.common.GitIgnoreGenerator;
import freemarker.template.TemplateException;

public class ParentProjectServiceImpl implements SkeletonService {
    @Override
    public void generate(SkeletonContext skeletonContext, SkeletonProperties skeletonProperties) throws SkeletonException, TemplateException, IOException {
        new GitIgnoreGenerator(skeletonContext, skeletonProperties).generate();
    }
}