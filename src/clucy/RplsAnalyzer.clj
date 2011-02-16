
(ns clucy.RplsAnalyzer
  (:gen-class
   :state env
   :init init
   :extends org.apache.lucene.analysis.snowball.SnowballAnalyzer))

(defn -toString [this] "RplsAnalyzer with state")

(defn -init [version lang]
  [[version lang] (atom {})])