(defproject tree-tasks "0.0.1-SNAPSHOT"
  :description "Create projects that have simple tasks and task dependencies"
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/clojure-contrib "1.2.0"]
                 [compojure "1.1.1"]
                 [ring/ring-jetty-adapter "1.1.6"]
                 [ring/ring-devel "1.1.0"]
                 [ring-basic-authentication "1.0.1"]
                 [ring/ring-json "0.2.0"]
                 [environ "0.2.1"]
                 [com.cemerick/drawbridge "0.0.6"]
                 [org.clojure/java.jdbc "0.3.2"]
                 [postgresql "9.1-901.jdbc4"]
                 [org.clojure/tools.logging "0.2.6"]
                 [org.clojure/math.numeric-tower "0.0.1"]
                 [enlive "1.0.0-SNAPSHOT"]
                 [net.cgrand/moustache "1.0.0-SNAPSHOT"]]
  :dev-dependencies [[ring/ring-devel "0.3.7"]]
  :ring {:handler com.kevinmrohr.core/webapp}
  :uberjar-name "tree-tasks-standalone.jar"
  :min-lein-version "2.0.0"
  :plugins [[environ/environ.lein "0.2.1"]
            [lein-ring "0.8.10"]
            [uk.org.alienscience/leiningen-war "0.0.13"]]
  :hooks [environ.leiningen.hooks])