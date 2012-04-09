(def pwd "c:/Users/Tristan/Desktop/cal-stuff/")
(load-file (str pwd "items.clj"))
(load-file (str pwd "meals.clj"))

(defn harris-benedict [w h a ex]
  (let [w (* w 2.20462262) ; kgs->pounts
	h (* h 0.393700787)] ; cms->inches
    (* ex (- (+ 66 (* 6.23 w) (* 12.7 h)) (* 6.8 a)))))

(defn process [foods meals]
  (let [r
	(map (fn [meal]
	       (let [serves (or (meal :serves) 1)]
		 (apply
		  merge-with +
		  (map
		   (fn [a]
		     (apply
		      hash-map
		      (flatten
		       (map
			(fn [b]
			  [(key b) (* 1.0 serves (val a) (val b))])
			(dissoc (*foods* (key a)) :serve-size)))))
		   (dissoc meal :serves)))))
	     meals)]
    (doseq [a r]
      (println a))
    (apply merge-with + r)))

(let [r (harris-benedict 75, 172, (+ 29 7/12 1/24) 1.2)
      w (harris-benedict 75, 172, (+ 29 7/12 1/24) 1.55)
      f (process *foods* meals-today)]
  (println "total:" f)
  (println "rest day (allowed/left):" r (- r (f :cals)))
  (println "workout: (allowed/left):" w (- w (f :cals))))