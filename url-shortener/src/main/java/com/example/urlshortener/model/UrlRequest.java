package com.example.urlshortener.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UrlRequest {
    String url;
    String clientName;
    String domain;
}
