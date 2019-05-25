package com.lojzes;

import com.lojzes.embedTomcat.HomeServlet;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.core.StandardContext;
import org.apache.catalina.startup.Tomcat;

/**
 * 嵌入式tomcat
 *
 */
public class EmbedTomcate
{

    private static final int port = 8080;

    private static final String contextPath = "/embedTomcat";

    private static final String baseDir = "d:/embedTomcat";

    public static void main( String[] args ) throws LifecycleException {
        //实例化tomcat 实例
        Tomcat tomcat = new Tomcat();
        tomcat.setBaseDir(baseDir);
        tomcat.setPort(port);
        tomcat.getHost().setAutoDeploy(false);

        //实例上下文
        StandardContext standardContext = new StandardContext();
        standardContext.setPath(contextPath);
        standardContext.addLifecycleListener(new Tomcat.FixContextListener());

        tomcat.getHost().addChild(standardContext);

        tomcat.addServlet(contextPath, "homeServlet", new HomeServlet());
        standardContext.addServletMappingDecoded("/home", "homeServlet");
        tomcat.start();

        System.out.println("tomcat 启动成功....");
        tomcat.getServer().await();
    }
}
