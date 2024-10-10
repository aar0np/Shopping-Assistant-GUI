FROM public.ecr.aws/amazonlinux/amazonlinux:latest

# install Java
RUN yum update -y && yum install -y java-21-openjdk

# get Shopping Assistant JAR file
ADD https://raw.githubusercontent.com/aar0np/Shopping-Assistant-GUI/refs/heads/main/shoppingassistant.jar

# open port for http endpoint
EXPOSE 9090

java -jar shoppingassistant.jar
