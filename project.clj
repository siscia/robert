(defproject robert "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/core.contracts "0.0.5"]
                 [compojure "1.1.6"]
                 [bidi "1.10.2"]
                 [ring/ring-core "1.2.2"]
                 [ring/ring-json "0.3.1"]
                 [ring-basic-authentication "1.0.5"]
                 [com.novemberain/monger "2.0.0-rc1"]
                 [com.cemerick/friend "0.2.0"]
                 [clj-time "0.6.0"]
                 [lib-noir "0.8.1"]
                 [com.draines/postal "1.11.1"]
                 [liberator "0.11.0"]
                 [cheshire "5.3.1"]
                 [environ "0.5.0"]]
  :plugins [[lein-ring "0.8.10"]
            [lein-environ "0.5.0"]]
  :main robert.handler
  :ring {:handler robert.handler/app}
  :min-lein-version "2.0.0"
  :profiles
  {:dev {:dependencies [[javax.servlet/servlet-api "2.5"]
                        [ring-mock "0.1.5"]
                        [midje "1.6.2"]]}}
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"})
