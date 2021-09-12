FROM golang:1.16.8-alpine3.13

RUN mkdir /go/src/fullstack-practice

COPY go* /go/src/fullstack-practice
COPY *.go /go/src/fullstack-practice

WORKDIR /go/src/fullstack-practice

RUN go build .

ENTRYPOINT ["/bin/sh", "-c"]
CMD ["/go/src/fullstack-practice/fullstack-practice"]