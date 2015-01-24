(ns tryclojure.server
  (:use compojure.core)
  (:require [compojure.route :as route]
            [noir.util.middleware :as nm]
            [ring.adapter.jetty :as jetty]
            [tryclojure.views.home :as home]
            [tryclojure.views.tutorial :as tutorial]
            [tryclojure.views.eval :as eval]))

(defn enable-cors
  "enables CORS on a response by adding relevant headers"
  [response]
  (-> response
      (assoc-in [:headers "Access-Control-Allow-Origin"] "*")
      (assoc-in [:headers "Access-Control-Allow-Methods"] "GET,POST,OPTIONS")
      (assoc-in [:headers "Access-Control-Allow-Headers"] "Origin, X-Requested-With, Content-Type, Accept")))

(def app-routes
  [(GET "/" [] (home/root-html))
   (GET "/about" [] (home/about-html))
   (GET "/links" [] (home/links-html))
   (POST "/tutorial" [:as {args :params}] 
         (tutorial/tutorial-html (args :page)))

   (POST "/eval.json" [:as {args :params}] 
         (let [response (eval/eval-json (args :expr) (args :jsonp))]
           (enable-cors response)))

   (GET "/eval.json" [:as {args :params}] 
        (let [response (eval/eval-json (args :expr) (args :jsonp))]
          (enable-cors response)))

   (route/resources "/")
   (route/not-found "Not Found")])

(def app (nm/app-handler app-routes))

(defn -main [port]
  (jetty/run-jetty app {:port (Long. port) :join? false}))
