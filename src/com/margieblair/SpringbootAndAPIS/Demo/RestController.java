package com.margieblair.SpringbootAndAPIS.Demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/test")
    public String helloWord() {
        return "Hello World!";
    }

    @GetMapping("/jsonplaceholder/posts")
    public String getPosts() {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity = new HttpEntity<>(headers);
        return restTemplate.exchange("https://my-json-server.typicode.com/margueriteblair/demo/posts", HttpMethod.GET, entity, String.class).getBody();
    }

    @PostMapping("/jsonplaceholder/createPost")
    public Post createPost(@RequestBody Post post) {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<Post> entity = new HttpEntity<>(post, headers);
        return restTemplate.postForObject("https://my-json-server.typicode.com/margueriteblair/demo/posts", post, Post.class);
    }



}
