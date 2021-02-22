package com.example.demo.config.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class Interceptor implements HandlerInterceptor {
    private Logger logger = LoggerFactory.getLogger(Interceptor.class);

    /**
     * 整个请求处理完毕回调方法，即在视图渲染完毕时回调
     * 在此处可以进行一些资源清理
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object obj, Exception ex)
            throws Exception {
        logger.debug("afterCompletion method is now running!");
    }

    /**
     * 后处理回调方法
     * 经过Controller处理之后执行
     * 在此处可以对模型数据进行处理或对视图进行处理
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object obj, ModelAndView mv)
            throws Exception {
        logger.debug("postHandle method is now running!");

    }

    /**
     * 预处理回调函数
     * 进入Controller之前执行
     * 如果返回 true，则进入下一个拦截器，所有拦截器全部通过，则进入 Controller 相应的方法
     * 如果返回 false，则请求被拦截。
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object obj) throws Exception {
        logger.debug("preHandle method is now running!");
        String uri = request.getRequestURI();
        logger.info("<-----------------------------------");
        logger.info("request uri: {}", uri);
        logger.info("----------------------------------->");
        return true;
    }
}
