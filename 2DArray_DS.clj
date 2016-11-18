(use '[clojure.string :only (split triml)])

(defn sumhourglass
    [A x y]
    (let [a (reduce + (take 3 (drop y (nth A x))))
          b (nth (nth A (+ x 1)) (+ 1 y))
          c (reduce + (take 3 (drop y (nth A (+ x 2)))))
         ]
    (+ a b c)
    )
)


(
        let [
          arr (for [arr_temp (range 6)]  (map #(Integer/parseInt %) (split (read-line) #"\s+") )  )
          xy (for [x [0 1 2 3] y [0 1 2 3]] (vector x y))
        ]
        (print (apply max (map #(sumhourglass arr (get % 0) (get % 1)) xy)))
)
