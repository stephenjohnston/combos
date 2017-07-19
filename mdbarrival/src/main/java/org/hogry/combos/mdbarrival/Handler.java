package org.hogry.combos.mdbarrival;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.events.S3Event;

/**
 * Created by stephen on 7/18/17.
 */
public class Handler  implements RequestHandler<S3Event, String> {

    @Override
    public String handleRequest(S3Event s3Event, Context context) {
        System.out.println(s3Event.toJson());
        return s3Event.toJson();
    }
}
