
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
  ; made 11 from 500g ground beef
  {:ground-beef 5/11
   :onion-cooked 1/11
   :egg 1/22
   :emmentaler 1/22
   :olive-oil 1/110
   :bread-crumbs 1/44}
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
      {:turkey-fillet 101/75}
      ])

(def meals-today (var-get (ns-resolve *ns* (symbol (str "meals-" (.format (java.text.SimpleDateFormat. "yyyyMMdd") (java.util.Date.)))))))