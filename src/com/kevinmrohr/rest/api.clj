(ns com.kevinmrohr.rest.api
  (:use compojure.core, ring.middleware.json, com.kevinmrohr.rest.jsonutil))

(defroutes api-endpoints
  (GET "/project-list/:username" [username]
    (jsonbody
      [{:id 1, :name "Basement Remodel" :description "Remodel my basement. Forever." :progress "90"}
       {:id 2, :name "Learn Clojure" :description "Learn functional programming in Clojure, twitter bootstrap, AngularJS, everything." :progress "30"}])))

(defroutes api-routes
  (context "/api" [] (-> api-endpoints wrap-json-body wrap-json-params wrap-json-response)))