
(def
 *meals*
 {:chicken-burrito ; 475.76 kcal
  {:tortilla 1
   :chicken-breast 60/100
   :avocado 1/4
   :cherry-tomato 1/8
   :onion-cooked 1/8
   :capsicum-raw 1/8
   :olive-oil 1/20}
  :meat-balls ; ~169.5 kcal
  {:ground-beef 5/11 ; made 11 from 500g ground beef
   :onion-cooked 1/11
   :egg 1/22
   :emmentaler 1/22
   :olive-oil 1/110
   :bread-crumbs 1/44}
  :unique-salad
  {:lettuce 2
   :capsicum-raw 0.25
   :cherry-tomato 0.25
   :carrot-raw 0.25
   :raddish-raw 0.25
   :cucumber 0.25
   :joghurt-kraeuter-dressing 0.6} ; because it's not light (i assume)
  :frikadeller
  {:ground-beef 1.25
   :onion-cooked 0.46
   :egg 0.09
   :olive-oil 1/20
   :white-bread 1/3
   :butter 0.02
   :garlic 0.01
   :mustard 0.015}
  }
 )

(def meals-20120406
     [(assoc (*meals* :chicken-burrito) :serves 2)
      {:apple 1
       :banana 1}
      (assoc (*meals* :meat-balls)
	:serves 4
	:penne 1/4
	:cherry-tomato 1/16
	:spanish-olive 1/20
	:carrot-raw 1/8)
      {:apple 1
       :cottage-cheese 1}
      ]
     )

(def meals-20120407
     [{:bcaa 1}
      (assoc (*meals* :chicken-burrito) :serves 1)
      {:apple 1}
      {:serves 1
       :pork-ribs 5
       :frozen-peas-carrots-corn 0.5}
      {:apple 1
       :cottage-cheese 0.5
       }
      ]
     )

(def meals-20120408
     [{:bcaa 1}
      (assoc (*meals* :chicken-burrito) :serves 1.1)
      (assoc (*meals* :meat-balls) :serves 4)
      {:cherry-tomato 1/4
       :spanish-olive 1/6
       :cucumber 1/5
       :carrot-raw 1/2
       :capsicum-raw 1/2
       :feta-cheese 0.25
       :joghurt-kraeuter-dressing 0.3}
      {:wine 5}
      {:apple 1
       :cottage-cheese 0.5
       :chocolate-70pct 1/20
       }
      ]
     )

(def meals-20120409
     [{:bcaa 2}
      (assoc (*meals* :chicken-burrito)
        :serves 2
        :joghurt-mild-0.1pct-fett 0.25
        )
      {:apple 1
       :banana 1}
      (assoc (*meals* :meat-balls) :serves 3)
      {:cherry-tomato 1/4
       :spanish-olive 1/6
       :cucumber 1/5
       :carrot-raw 1/2
       :capsicum-raw 1/2
       :feta-cheese 0.25
       :joghurt-kraeuter-dressing 0.3}
      {:wine 3
       :cottage-cheese 0.5}
      ])

(def meals-20120410
     [
      {:bcaa 2}
      (*meals* :unique-salad)
      (assoc (*meals* :frikadeller) :serves 1.5)
      {:fried-potato 1}
      {:apple 1
       :banana 1}
      {:cherry-tomato 1/4
       :cucumber 1/5
       :carrot-raw 1/4
       :capsicum-raw 1/2
       :feta-cheese 0.25
       :joghurt-mild-0.1pct-fett 0.25
       :avocado 1/2
       :beetroot 1/5
       }
      {:chicken-breast (/ (/ 544 2) 100)
       :chili-sauce 0.2}
      {:wine 3
       :cottage-cheese 0.5}
      ])

(def meals-20120411
     [
      {:bcaa 2}
      {:schweinbratwurst 0.3
       :bauernbratwurst 0.4
       :mashed-potato-fraunhofer 1.5
       :sauerkraut 1.5}
      {:apple 1
       :banana 1}
      {:cherry-tomato 1/4
       :cucumber 1/5
       :carrot-raw 1/4
       :capsicum-raw 1/2
       :feta-cheese 0.25
       :spanish-olives 1/5
       :joghurt-kraeuter-dressing 0.3
       :avocado 1/2
       :beetroot 1/5
       }
      {:chicken-breast (/ (/ 544 2) 100)
       :chili-sauce 0.2}
      {:wine 5
       :cottage-cheese 1}
      ])

(def meals-20120412
  [
   {:bcaa 2}
   ])

(def meals-today (var-get (ns-resolve *ns* (symbol (str "meals-" (.format (java.text.SimpleDateFormat. "yyyyMMdd") (java.util.Date.)))))))