package com.app.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.*;

import java.util.Enumeration;
import java.util.Map;

@RestController
@RequestMapping("/log")
public class LogController {

    @PostMapping
    public void logRequest(HttpServletRequest request, @RequestBody Map<String, Object> requestBody) {

        // Get Request Method
        String method = request.getMethod();

        // Get Request URL
        String url = request.getRequestURL().toString();

        // Get Request Headers
        StringBuilder headers = new StringBuilder();
        Enumeration<String> headerNames = request.getHeaderNames();
        while (headerNames.hasMoreElements()) {
            String headerName = headerNames.nextElement();
            headers.append(headerName).append(": ").append(request.getHeader(headerName)).append("\n");
        }

        // Print the collected details + body
        System.out.println(String.format(
                "Method: %s\nURL: %s\nHeaders:\n%s\nBody:\n%s",
                method, url, headers, requestBody
        ));
    }
}
