package com.javayongju.ex;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class ContextListenerEx
 *
 */
@WebListener
public class ContextListenerEx  implements ServletContextListener {

    /**
     * Default constructor. 
     */
    public ContextListenerEx() {
        // TODO Auto-generated constructor stub
    }
       
    /**
     * @see ServletContextEvent#ServletContextEvent(ServletContext)
     */
    public ContextListenerEx(ServletContext source) {
        //super(source);
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent sce)  { 
         // TODO Auto-generated method stub
    	System.out.println("contextDestroyed 메소드가 실행되었습니다.");
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent sce)  { 
         // TODO Auto-generated method stub
    	System.out.println("contextInitialized 메소드가 실행되었습니다.");
    }
	
}
