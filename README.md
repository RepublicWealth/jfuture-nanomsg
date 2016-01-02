# JFuture Nanomsg
[![Build Status](https://snap-ci.com/RepublicWealth/jfuture-nanomsg/branch/master/build_image)](https://snap-ci.com/RepublicWealth/jfuture-nanomsg/branch/master)
[ ![Download](https://api.bintray.com/packages/republicwealth/nanomsg/jfuture-nanomsg/images/download.svg) ](https://bintray.com/republicwealth/nanomsg/jfuture-nanomsg/_latestVersion)
<a href='https://bintray.com/republicwealth/nanomsg/jfuture-nanomsg/view?source=watch' alt='Get automatic notifications about new "jfuture-nanomsg" versions'><img src='https://www.bintray.com/docs/images/bintray_badge_color.png'></a>

A fork of [jnanomsg](http://niwinz.github.io/jnanomsg/) that focuses only on the Java bindings for nanomsg 
(build on top of JNA). Basically:
 
   - remove Clojure code DONE
   - replace Leiningen with Gradle DONE
   - add JUnit tests. DOING
   - use Java8 CompletableFutures or NIO (which wraps epoll under the hood for Linux) for Aysnc Sockets. NOT STARTED

(http://nanomsg.org/)

- Documentation: available via unit tests
