# Swimteam Combos Project (Still under development)
The combos project takes a Meet Manager .mdb database file and attempts to find girls/boys heats that can be combined into one heat.

### Dependencies
- [Java 8](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
- [Maven](https://maven.apache.org/download.cgi)
- [Serverless](http://serverless.com) 
- Recommended
  - [AWS CLI](http://docs.aws.amazon.com/cli/latest/userguide/installing.html)
  - [Configuring the AWS CLI](http://docs.aws.amazon.com/cli/latest/userguide/cli-chap-getting-started.html)

### How to deploy
The application runs using Amazon Web Services.
To deploy:
- clone this project
- Run "mvn package"
- Run "sls deploy -v --bucket=<bucketName>"

Once you run the deploy command above, the application will begin installing in your AWS account.  You can set AWS_PROFILE environment variable beforehand to indicate the AWS account to deploy into.  The first time the application is deployed, it will create the specified S3 bucket and connect a trigger to fire the lambda when files are created or modified.


