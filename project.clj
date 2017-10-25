(defproject domina-shipping-form "0.1.0"

  :description "porting a js shipping form over to cljs"
  :url ""

  :license {:name "ISC License"
            :url ""
            :distribution :repo}

  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/clojurescript "1.9.293"]
                 [domina "1.0.3"]
                 [cljsjs/moment "2.15.2-3"]]

  :plugins [[lein-cljsbuild "1.1.5"]]

  :source-paths ["src"]

  :clean-targets ["public/js/dev.js"
                  "public/js/prod.js"]

  :cljsbuild
    {:builds
      [{:id "dev"
        :source-paths ["src-cljs"]
        :compiler {:output-to "public/js/dev.js"
                   :optimizations :whitespace}}

       {:id "prod"
        :source-paths ["src-cljs"]
        :compiler {:output-to "public/js/prod.js"
                   :optimizations :advanced
                   :pretty-print false}}]})
