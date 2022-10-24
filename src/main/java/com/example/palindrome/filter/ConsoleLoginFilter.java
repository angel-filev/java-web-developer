package com.example.palindrome.filter;

import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class ConsoleLoginFilter implements Filter {

    @SuppressWarnings("SpellCheckingInspection")
    static final String ACCOUNT_NAME = "remoteUser";

    @SuppressWarnings("SpellCheckingInspection")
    static final String MEMBER_OF = "memberOf";

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterchain)
            throws IOException, ServletException {

        filterchain.doFilter(request, response);
    }

}
