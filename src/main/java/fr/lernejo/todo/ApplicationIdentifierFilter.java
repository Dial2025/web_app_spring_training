package fr.lernejo.todo;

import javax.servlet.*;
import org.springframework.stereotype.Component;
import java.util.UUID;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import java.io.IOException;


@Component
public class ApplicationIdentifierFilter implements Filter {

    private final String uuid;

    public ApplicationIdentifierFilter() {
        uuid = UUID.randomUUID().toString();
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws ServletException, IOException{
        HttpServletResponse rep = (HttpServletResponse) response;
        rep.setHeader("Instance-Id", this.uuid);
        filterChain.doFilter(request, rep);
    }

}
