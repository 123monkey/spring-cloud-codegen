package cn.springcloud.codegen.component.generator.common;

/**
 * <p>Title: Nepxion Skeleton</p>
 * <p>Description: Nepxion Skeleton For Freemarker</p>
 * <p>Copyright: Copyright (c) 2017</p>
 * <p>Company: Nepxion</p>
 * @author Haojun Ren
 * @email 1394997@qq.com
 * @version 1.0
 */

import cn.springcloud.codegen.component.generator.constant.CommonConstant;
import com.nepxion.skeleton.engine.constant.SkeletonConstant;
import com.nepxion.skeleton.engine.context.SkeletonContext;
import com.nepxion.skeleton.engine.generator.SkeletonFileGenerator;
import com.nepxion.skeleton.engine.property.SkeletonProperties;

import java.util.HashMap;
import java.util.Map;

public class LogbackXmlGenerator extends SkeletonFileGenerator {
    public LogbackXmlGenerator(SkeletonContext skeletonContext, SkeletonProperties skeletonProperties, String projectType) {
        super(new SkeletonContext(skeletonContext.getGeneratePath(), projectType, CommonConstant.PREFIX_TEMPLATE_PATH, CommonConstant.REDUCED_TEMPLATE_PATH, GitAttributesGenerator.class), skeletonProperties);
    }

    @Override
    protected String getFileName() {
        return "logback.xml";
    }

    @Override
    protected String getTemplateName() {
        return "logback.xml.template";
    }

    @Override
    protected String getOutputPath() {
        return super.getOutputPath() + SkeletonConstant.MAIN_RESOURCES_FILE_PATH;
    }

    @Override
    protected Object getDataModel() {
        Map<String, Object> dataModel = new HashMap<String, Object>();
        dataModel.put("serviceName", skeletonProperties.getString("projectName") + "-" + getSkeletonContext().getProjectType());

        return dataModel;
    }
}