FROM alpine/git as clone
WORKDIR /usr/src
RUN git clone https://github.com/Bibek-Sutradhar/RequestTravelPlanWebBFFServie.git


FROM maven:3.5-jdk-8-alpine as build
WORKDIR /app
COPY --from=clone /usr/src/RequestTravelPlanWebBFFServie/RequestTravelPlanWebBFF /app
RUN mvn install


FROM openjdk:8-jre-alpine
WORKDIR /app
EXPOSE 8891
COPY --from=build /app/target/RequestTravelPlanWebBFFServie-1.0.jar /app
CMD ["java", "-jar", "RequestTravelPlanWebBFFServie-1.0.jar"]
