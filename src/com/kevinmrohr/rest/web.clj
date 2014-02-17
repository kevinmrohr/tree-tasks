(ns com.kevinmrohr.rest.web
  (:use compojure.core
        net.cgrand.moustache
        net.cgrand.enlive-html)
  (:require [compojure.route :as route]))


(deftemplate home "home.html" [])

(defroutes site-routes
  (GET "/home" [ ] (home)))