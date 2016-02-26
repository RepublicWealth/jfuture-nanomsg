(defproject jnanomsg "0.4.3"
  :description "Nanomsg library for Java & Clojure"
  :url "https://github.com/niwibe/jnanomsg"
  :license {:name "Apache 2.0"
            :url "http://www.apache.org/licenses/LICENSE-2.0.txt"}
  :plugins [[lein-junit "1.1.8"]]
  :dependencies [[org.clojure/clojure "1.7.0" :scope "provided"]
                 [funcool/octet "0.2.0" :scope "provided"]
                 [net.java.dev.jna/jna "4.2.1"]
                 [com.google.guava/guava "19.0"]]

  :jvm-opts ["-server" "-Xmx2g" "-XX:+UseG1GC"]
  :javac-options ["-target" "1.8" "-source" "1.8" "-Xlint:-options"]

  :source-paths ["src/clojure"]
  :test-paths ["test/clojure"]
  :java-source-paths ["src/java" "test/java"]
  :junit ["test/java"]

  :javadoc-opts {:output-dir "doc/api/java"
                 :package-names ["nanomsg" "nanomsg.jna" "nanomsg.pubsub" "nanomsg.exceptions"
                                 "nanomsg.reqrep" "nanomsg.bus" "nanomsg.pair" "nanomsg.pipeline"]}

  :codeina {:target "doc/api/clojure"
            :reader :clojure
            :src-uri "http://github.com/niwibe/jnanomsg/blob/master/"
            :src-uri-prefix "#L"
            :exclude [nanomsg.benchmark nanomsg.impl]}

  :profiles {:dev {:plugins [[lein-javadoc "0.1.1"]
                             [lein-ancient "0.6.7"]
                             [funcool/codeina "0.3.0"]]
                   :dependencies [[junit/junit "4.11"]]
                   :main nanomsg.benchmark}
             :uberjar {:aot :all}})

