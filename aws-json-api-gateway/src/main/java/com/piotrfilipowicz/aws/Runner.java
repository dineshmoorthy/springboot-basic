package com.piotrfilipowicz.aws;

import java.io.ByteArrayInputStream;
import java.net.URI;
import java.net.URISyntaxException;

import com.amazonaws.http.HttpMethodName;

public class Runner {
    static final String AWS_IAM_ACCESS_KEY = "accesskey";
    static final String AWS_IAM_SECRET_ACCESS_KEY = "secreaccesskey";
    static final String AWS_REGION = "eu-west-2"; //for example "eu-west-1"
    static final String AWS_API_GATEWAY_ENPOINT = "https://dnsname.execute-api.eu-west-2.amazonaws.com/dev"; //for example https://234n34k5678k.execute-api.eu-west-1.amazonaws.com/TEST

    static final String exampleJsonRequest = "{\n" +
            "  \"name\": \"dog\",\n" +
            "  \"id\": 249\n" +
            "}";

    public static void main(String... args) {
        try {
            JsonApiGatewayCaller caller = new JsonApiGatewayCaller(
                    AWS_IAM_ACCESS_KEY,
                    AWS_IAM_SECRET_ACCESS_KEY,
                    null,
                    AWS_REGION,
                    new URI(AWS_API_GATEWAY_ENPOINT)
            );

            ApiGatewayResponse response = caller.execute(HttpMethodName.POST, "/student", new ByteArrayInputStream(exampleJsonRequest.getBytes()));

            System.out.println(response.getBody());

        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }

}
