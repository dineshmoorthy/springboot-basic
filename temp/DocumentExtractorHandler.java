package com.example;

import com.amazonaws.services.lambda.runtime.RequestHandler;

public class DocumentExtractorHandler implements RequestHandler<S3Event, String> {
    public String handleRequest(S3Event s3event, Context context) {
        try {
	    //http://docs.aws.amazon.com/lambda/latest/dg/java-wt-s3-log-event-data.html
            S3EventNotificationRecord record = s3event.getRecords().get(0);
 
            String srcBucket = record.getS3().getBucket().getName();
            // Object key may have spaces or unicode non-ASCII characters.
            String srcKey = record.getS3().getObject().getKey().replace('+', ' ');
            srcKey = URLDecoder.decode(srcKey, "UTF-8");
 
            System.out.println(srcBucket + " " + srcKey);
            return "Ok";
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
