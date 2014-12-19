(ns caryandtodd.routes.home
  (:require [compojure.core :refer :all]
            [ring.util.response :as resp]
            [caryandtodd.views.layout :as layout]))

(defn home []
  (layout/common [:h1 "Hello World!"]))

(defn add-guest [guest]
  (println guest)
  (resp/redirect "http://www.caryandtodd.com"))

(defroutes home-routes
  (POST "/guests" {params :params} (add-guest params)))
