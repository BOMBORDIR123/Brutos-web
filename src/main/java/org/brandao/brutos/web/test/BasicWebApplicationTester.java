package org.brandao.brutos.web.test;

import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.brandao.brutos.web.ConfigurableWebApplicationContext;

import com.mockrunner.mock.web.MockHttpServletRequest;
import com.mockrunner.mock.web.MockHttpSession;
import com.mockrunner.mock.web.MockServletContext;

public class BasicWebApplicationTester 
	implements WebApplicationTester{

	public void prepareContext(MockServletContext servletContext) {
	}

	public void prepareRequest(MockHttpServletRequest request) {
	}

	public void prepareSession(MockHttpSession session) {
	}

	public void prepareContext(Map<String, String> parameters) {
	}

	public void prepareRequest(Map<String, String> parameters,
			Map<String, String> header, Map<String, Object> properties) {
	}

	public void prepareSession(Map<String, Object> parameters) {
	}

	public void checkException(Throwable e) {
	}

	public void checkResult(HttpServletRequest request,
			HttpServletResponse response, ServletContext context,
			ConfigurableWebApplicationContext applicationContext) {
	}

}
