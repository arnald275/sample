package com.example.dependency_injection.lifecycle;

import java.util.Arrays;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanClassLoaderAware;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.ApplicationStartupAware;
import org.springframework.context.EmbeddedValueResolverAware;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.context.annotation.ImportAware;
import org.springframework.context.weaving.LoadTimeWeaverAware;
import org.springframework.core.env.Environment;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.metrics.ApplicationStartup;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.instrument.classloading.LoadTimeWeaver;
import org.springframework.jmx.export.notification.NotificationPublisher;
import org.springframework.jmx.export.notification.NotificationPublisherAware;
import org.springframework.util.StringValueResolver;

public class LifeCycleDemo implements BeanNameAware, BeanClassLoaderAware,BeanFactoryAware, 
ApplicationContextAware, ApplicationEventPublisherAware, 
ApplicationStartupAware, 
EmbeddedValueResolverAware, EnvironmentAware, 
ImportAware, LoadTimeWeaverAware, 
MessageSourceAware, NotificationPublisherAware, 
ResourceLoaderAware{

	@Override
	public void setResourceLoader(ResourceLoader resourceLoader) {
		// TODO Auto-generated method stub
		System.out.println("ResourceLoaderAware called");
		
	}

	@Override
	public void setNotificationPublisher(NotificationPublisher notificationPublisher) {
		// TODO Auto-generated method stub
		System.out.println("NotificationPublisherAware called");
	}

	@Override
	public void setMessageSource(MessageSource messageSource) {
		// TODO Auto-generated method stub
		System.out.println("MessageSourceAware called");
	}

	@Override
	public void setLoadTimeWeaver(LoadTimeWeaver loadTimeWeaver) {
		// TODO Auto-generated method stub
		System.out.println("LoadTimeWeaver called");
	}

	@Override
	public void setImportMetadata(AnnotationMetadata importMetadata) {
		// TODO Auto-generated method stub
		System.out.println("ImportAware called");
		
	}

	@Override
	public void setEnvironment(Environment environment) {
		// TODO Auto-generated method stub
		System.out.println("EnvironmentAware called");
		
	}

	@Override
	public void setEmbeddedValueResolver(StringValueResolver resolver) {
		// TODO Auto-generated method stub
		System.out.println("EmbededValueResolverAware called");
	}

	@Override
	public void setApplicationStartup(ApplicationStartup applicationStartup) {
		// TODO Auto-generated method stub
		System.out.println("ApplicationStartupAware called");
	}

	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
		// TODO Auto-generated method stub
		System.out.println("ApplicationEventPublisherAware called");
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("setApplicationContext called");
		System.out.println("setApplicationContext:: Bean Definition Names="+ Arrays.toString(applicationContext.getBeanDefinitionNames()));
		
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("setBeanFactory called");
		System.out.println("setBeanFactory:: employee bean singleton="+ beanFactory.isSingleton("lifeCycleDemo"));
		
	}

	@Override
	public void setBeanClassLoader(ClassLoader classLoader) {
		// TODO Auto-generated method stub
		System.out.println("setBeanClassLoader called");
		System.out.println("setBeanClassLoader:: ClassLoader Name="+ classLoader.getClass().getName());
		
	}

	@Override
	public void setBeanName(String name) {
		// TODO Auto-generated method stub
		System.out.println("setBeanName called");
		System.out.println("setBeanName:: Bean Name defined in context="+ name);
	}
	public LifeCycleDemo() {
		// TODO Auto-generated constructor stub
		System.out.println("Constructor called");
	}
	private void start() {
		System.out.println("bean initialized");
	}

}
