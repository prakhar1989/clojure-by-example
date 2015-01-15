Variables
=======

```clojure
(ns clojure-by-example)

(defn say-hello [msg]
  (str "Hello, " msg )

(defn -main [& args]
  (println (say-hello "World"))
```
