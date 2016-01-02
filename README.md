# JFuture Nanomsg
[ ![Download](https://api.bintray.com/packages/republicwealth/nanomsg/jfuture-nanomsg/images/download.svg) ](https://bintray.com/republicwealth/nanomsg/jfuture-nanomsg/_latestVersion)

A fork of [jnanomsg](http://niwinz.github.io/jnanomsg/) that focuses only on the Java bindings for nanomsg 
(build on top of JNA). Basically:
 
   - remove Clojure code DONE
   - replace Leiningen with Gradle DONE
   - add JUnit tests. DOING
   - use Java8 CompletableFutures or NIO (which wraps epoll under the hood for Linux) for Aysnc Sockets. NOT STARTED

(http://nanomsg.org/)

- Documentation: available via unit tests
