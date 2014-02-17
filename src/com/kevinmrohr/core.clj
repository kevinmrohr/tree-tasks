(ns com.kevinmrohr.core
  (:gen-class)
  (:use compojure.core
        ring.middleware.json
        com.kevinmrohr.rest.jsonutil)
  (:require [compojure.route :as route]
            [compojure.handler :as handler]
            [com.kevinmrohr.rest.web :as web]
            [com.kevinmrohr.rest.api :as api]))

(defroutes combined-routes
  api/api-routes   ; rest api endpoints - return json
  web/site-routes
  (route/resources "/")) ; rest webapp endpoints - return HTML

(def webapp (handler/site combined-routes))