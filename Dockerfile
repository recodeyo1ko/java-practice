FROM openjdk:17-jdk-slim

RUN apt-get update && apt-get install -y build-essential

WORKDIR /root/server/src

CMD ["/bin/bash"]
