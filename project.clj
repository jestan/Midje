(defproject org.clojars.hms/midje "1.3-alpha4"
  :description "A TDD library for Clojure, with an emphasis on mocks"
  :dependencies [[org.clojure/clojure "1.3.0"]
                 [org.clojure/math.combinatorics "0.0.1"]
                 [org.clojure/algo.monads "0.1.0"]
                 [org.clojure/core.unify "0.5.1"]]
  :dev-dependencies [[swank-clojure "1.3.2" :exclusions [org.clojure/clojure]]
                     [slamhound "1.1.1"]]

  :repositories {"releases" "http://192.168.0.7:8080/archiva/repository/internal/"
                 "snapshots" "http://192.168.0.7:8080/archiva/repository/snapshots/"})

