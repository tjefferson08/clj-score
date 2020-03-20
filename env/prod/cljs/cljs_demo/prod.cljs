(ns cljs-demo.prod
  (:require [cljs-demo.core :as core]))

;;ignore println statements in prod
(set! *print-fn* (fn [& _]))

(core/init!)
