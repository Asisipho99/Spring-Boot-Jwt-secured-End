package com.asisipho.securedEnd.service;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.logout.LogoutHandler;

public interface LogoutService extends LogoutHandler {

  public void logout(HttpServletRequest request, HttpServletResponse response, Authentication authentication);
}