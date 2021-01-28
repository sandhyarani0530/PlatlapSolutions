package com.platlap.filter;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;

@Component
public class LoginFilter implements Filter {
	private List<String> excludedUrls = Arrays.asList("/", "/idam-servlet/");

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		if (request instanceof HttpServletRequest) {
			HttpServletRequest httpRequest = (HttpServletRequest) request;
			HttpServletResponse httpResponse = (HttpServletResponse) response;
			try {
				String path = httpRequest.getServletPath();

				// exclude home page
				if (excludedUrls.contains(path)) {
					chain.doFilter(request, response);
					return;
				}
			} catch (Throwable exc) {
				httpResponse.setStatus(500);
				System.out.println(exc.getMessage());
				request.setAttribute("error", exc.getMessage());
				request.getRequestDispatcher("/error").forward(request, response);
				return;
			}
		}
		chain.doFilter(request, response);
	}

}
