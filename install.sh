aws s3 cp s3://codepipeline-us-east-1-155306203874/tomcat-cicd/target/FrontControllerDemo.war /tmp
sudo mv /tmp/FrontControllerDemo.war /usr/share/tomcat/webapps/FrontControllerDemo.war
sudo service tomcat restart