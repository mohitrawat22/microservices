#Start with a base image containing Java runtime
FROM openjdk:17-jdk-slim

# Install curl
RUN apt-get -y update
RUN apt-get -y install curl

# MAINTAINER instruction is deprecated in favor of using label
# MAINTAINER mor
#Information around who maintains the image
LABEL "org.opencontainers.image.authors"="mor"

# Add the application's jar to the image
COPY target/eurekaserver-0.0.1-SNAPSHOT.jar eurekaserver-0.0.1-SNAPSHOT.jar

# execute the application
ENTRYPOINT ["java", "-jar", "eurekaserver-0.0.1-SNAPSHOT.jar"]