FROM openjdk:11-alpine

COPY target/Food-Delivery-*.war/Food-Delivery.war

CMD ["java","-war","/Food-Delivery.war"]

