package spring.mvc.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

/**
 * Created by άC���� on 2017/1/24.
 */
public class CeshiController extends AbstractController {
    @Override
    protected ModelAndView handleRequestInternal(javax.servlet.http.HttpServletRequest request,
                                                 javax.servlet.http.HttpServletResponse response) throws Exception {

        System.out.println(request.getRequestURI());  // ��ȡController�����ƣ�����ַ

        return new ModelAndView("index");  // �߼���
    }
}

