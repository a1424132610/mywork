package com.zhj;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.CachingMetadataReaderFactory;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.util.ClassUtils;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableTransactionManagement
@MapperScan(basePackages = {"com.zhj.dao"})
public class MyWorkApp
{
    public static void main( String[] args ) throws IOException, ClassNotFoundException {
        SpringApplication.run(MyWorkApp.class);
    }




    private static void forNameClass(String method) throws IOException, ClassNotFoundException {
        ResourcePatternResolver resourcePatternResolver = new PathMatchingResourcePatternResolver();
        MetadataReaderFactory metadataReaderFactory = new CachingMetadataReaderFactory(resourcePatternResolver);

        String s1 = ClassUtils.convertClassNameToResourcePath("com.zhj.dao");
        String s = ResourcePatternResolver.CLASSPATH_ALL_URL_PREFIX + s1 + "/" + "*.class";
        Resource[] resources = resourcePatternResolver.getResources(s);
        for (Resource resource : resources) {
            MetadataReader metadataReader = metadataReaderFactory.getMetadataReader(resource);
            AnnotationMetadata metadata = metadataReader.getAnnotationMetadata();
            metadata.getAnnotationTypes().forEach(e -> {
                if(e.equals("org.apache.ibatis.annotations.Mapper")){
                    String className = metadataReader.getClassMetadata().getClassName();
                    
                }
            });
        }

    }
    private static void proxy(Object o,Method method){

    }

}
