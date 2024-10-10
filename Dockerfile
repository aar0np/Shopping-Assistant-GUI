#FROM public.ecr.aws/amazonlinux/amazonlinux:latest
FROM amazoncorretto:21

# updates and wget
#RUN yum update -y && yum install wget -y

# install Java
#RUN wget https://builds.openlogic.com/downloadJDK/openlogic-openjdk/21.0.4+7/openlogic-openjdk-21.0.4+7-linux-x64-el.rpm
#RUN rpm openlogic-openjdk-21.0.4+7-linux-x64-el.rpm

# get Shopping Assistant JAR file
ADD https://raw.githubusercontent.com/aar0np/Shopping-Assistant-GUI/refs/heads/main/shoppingassistant.jar shoppingassistant.jar

# open port for http endpoint
EXPOSE 9090

#RUN java -jar shoppingassistant.jar
ENTRYPOINT java -jar shoppingassistant.jar
