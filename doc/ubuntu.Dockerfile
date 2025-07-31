FROM ubuntu:latest

RUN apt-get update && \
    apt-get install -y --no-install-recommends apt-utils && \
    DEBIAN_FRONTEND=noninteractive apt-get install -y tzdata && \
    ln -fs /usr/share/zoneinfo/Asia/Shanghai /etc/localtime && \
    dpkg-reconfigure --frontend noninteractive tzdata && \
    apt-get clean

RUN apt-get update && \
    apt-get install -y --no-install-recommends netbase ca-certificates wget curl telnet iputils-ping dnsutils && \
    apt-get clean

RUN apt-get update && \
    apt-get install -y --no-install-recommends g++ gcc libc6-dev make pkg-config && \
    apt-get clean

RUN apt-get update && \
    apt-get install -y --no-install-recommends gnupg dirmngr mercurial openssh-client subversion procps && \
    apt-get clean

RUN apt-get update && \
    apt-get install -y --no-install-recommends git maven openjdk-21-jdk && \
    apt-get clean

RUN wget https://golang.google.cn/dl/go1.24.5.linux-amd64.tar.gz \
    && tar -C /usr/local -xzf go1.24.5.linux-amd64.tar.gz \
    && rm -rf go1.24.5.linux-amd64.tar.gz

ENV JAVA_HOME=/usr/lib/jvm/java-21-openjdk-amd64
ENV GOPATH=/root/go
ENV GOSUMDB=off
ENV GOPROXY=https://goproxy.woa.com,direct

ENV PATH="$PATH:/usr/local/go/bin"
ENTRYPOINT ["/bin/bash"]
