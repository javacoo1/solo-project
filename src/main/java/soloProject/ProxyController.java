package com.example.project.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ProxyController {

    @GetMapping("/proxy")
    public ResponseEntity<String> proxyRequest() {
        // 외부 API 호출 (예: Kakao 지도 API)
        String externalApiUrl = "https://external-api.com/resource"; // 외부 API URL로 변경
        RestTemplate restTemplate = new RestTemplate();

        // 외부 API 호출 결과를 받아 클라이언트로 전달
        String result = restTemplate.getForObject(externalApiUrl, String.class);
        return ResponseEntity.ok(result);
    }
}
