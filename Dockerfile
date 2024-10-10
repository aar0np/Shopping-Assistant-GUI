FROM public.ecr.aws/amazonlinux/amazonlinux:latest

# install Java
RUN yum install -y openjdk-21-jdk

# get Shopping Assistant JAR file
RUN curl https://github.com/aar0np/Shopping-Assistant-GUI/blob/main/shoppingassistant.jar -o shoppingassistant.jar

# open port for http endpoint
EXPOSE 9090

java -jar shoppingassistant.jar
