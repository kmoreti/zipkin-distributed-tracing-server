package br.com.moreti.microservices.zipkindistributedtracingserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.sleuth.zipkin.stream.EnableZipkinStreamServer;

@SpringBootApplication
@EnableZipkinStreamServer
@EnableDiscoveryClient
public class ZipkinDistributedTracingServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZipkinDistributedTracingServerApplication.class, args);
    }
}

