(defproject selmer "1.12.15"
  :description "Django style templates for Clojure"
  :url "https://github.com/yogthos/Selmer"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [commons-codec "1.11"]
                 [json-html "0.4.7"]
                 [cheshire "5.8.1"]
                 [criterium "0.4.4" :scope "test"]]

  :aot [selmer.node]
  :javac-options ["-target" "1.6"]

  :test-selectors {:default (complement :benchmark)
                   :benchmark :benchmark
                   :all (constantly true)}
  :profiles {:dev {:global-vars {*warn-on-reflection* true}
                   :repl-options {:port 10123}
                   :plugins [[lein-marginalia "0.9.0"]]
                   :dependencies [[environ "1.1.0"]]}})
