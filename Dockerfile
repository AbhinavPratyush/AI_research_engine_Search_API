FROM ubuntu:latest
LABEL authors="abhin"

ENTRYPOINT ["top", "-b"]