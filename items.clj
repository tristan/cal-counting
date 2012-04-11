; http://nutritiondata.self.com/facts/
; http://www.acaloriecounter.com/

(def *foods*
     {:avocado
      {:serve-size 150 ; cup
       :fat 22
       :carbs 3
       :protein 3
       :cals 240}
      :cherry-tomato
      {:serve-size 149 ; cup
       :carbs 4
       :protein 1
       :cals 26.8}
      :capsicum-raw
      {:serve-size 149 ; cup
       :cals 46
       :carbs 6
       :protein 1}
      :onion-cooked
      {:serve-size 87 ; cup
       :cals 115
       :carbs 6
       :fat 9
       :protein 1}
      :olive-oil
      {:serve-size 100
       :cals 819
       :fat 91}
      :spanish-olive
      {:serve-size 100
       :cals 148
       :fat 13.9
       :carbs 1.7
       :protein 0.9}
      :penne
      {:serve-size 100
       :cals 350
       :protein 13
       :fat 1.5
       :carbs 71}
      :egg
      {:serve-size 136 ; cup
       :cals 221
       :protein 17
       :fat 14
       :carbs 2}
      :emmentaler
      {:serve-size 100
       :cals 383
       :protein 218
       :fat 29
       :carbs 2.4}
      :ground-beef
      {:serve-size 100
       :cals 220
       :protein 19
       :fat 16}
      :chicken-breast
      {:serve-size 100
       :cals 114
       :protein 24
       :fat 2}
      :banana
      {:serve-size 150 ; cup
       :cals 133
       :carbs 34
       :protein 2}
      :apple
      {:serve-size 125 ; cup
       :cals 65
       :carbs 14}
      :cottage-cheese
      {:serve-size 100
       :cals 102
       :protein 13.2
       :carbs 2
       :fat 4.6}
      :tortilla
      {:serve-size 72
       :cals 226
       :protein 6.9
       :carbs 35.4
       :fat 5.9}
      :bread-crumbs
      {:serve-size 100
       :cals 355
       :carbs 69
       :protein 13.6
       :fat 1.5}
      :carrot-raw
      {:serve-size 128
       :cals 52
       :carbs 8
       :protein 1}
      :pork-ribs
      {:serve-size 100
       :cals 208
       :protein 16
       :fat 16}
      :frozen-peas-carrots-corn
      {:serve-size 100
       :cals 64
       :protein 3.2
       :carbs 10.9
       :fat 0.8}
      :wine
      {:serve-size 50 ; ml
       :cals 41.397
       :carbs 1.356
       :protein 0.035
       }
      :chocolate-70pct
      {:serve-size 100
       :cals 530
       :protein 8
       :carbs 33
       :fat 40}
      :bcaa
      {:serve-size 10
       :cals 40
       :protein 10}
      :cucumber
      {:serve-size 52 ;g (1 cup)x
       :cals 16.64
       :fat 0.114
       :carbs 3.776
       :protein 0.676
       }
      :feta-cheese
      {:serve-size 100
       :cals 268
       :fat 22.5
       :protein 18.4
       :carbs 0.45}
      :joghurt-kraeuter-dressing
      {:serve-size 100
       :protein 1.4
       :cals 150
       :fat 11
       :carbs 11}
      :turkey-fillet
      {:serve-size 100
       :cals 114
       :protein 24
       :fat 2}
      :joghurt-mild-0.1pct-fett
      {:serve-size 100
       :cals 53
       :protein 5.5
       :carbs 6.9
       :fat 0.1}
      :lettuce
      {:serve-size 72 ; cup
       :cals 10.08
       :fat 0.101
       :carbs 2.138
       :protein 0.648}
      :radish-raw
      {:serve-size 116 ;cup
       :cals 18.56
       :fat 0.116
       :carbs 3.944
       :protein 0.789}
      :white-bread
      {:serve 45 ; cup
       :cals 119.7
       :fat 1.481
       :carbs 22.775
       :protein 3.438}
      :butter
      {:serve 227 ; cup
       :cals 1627.59
       :fat 184.12
       :carbs 0.136
       :protein 1.93}
      :garlic
      {:serve 136 ; cup
       :cals 202.64
       :fat 0.68
       :carbs 44.926
       :protein 8.65}
      :mustard
      {:serve 100
       :cals 66
       :fat 4.02
       :carbs 5.34
       :protein 4.38}
      :fried-potato
      {:serve 100
       :cals 128
       :fat 4
       :carbs 20
       :protein 3}
      :beetroot
      {:serve 100
       :cals 47
       :carbs 8.8
       :protein 1
       :fat 0.1}
      :chili-sauce
      {:serve 100
       :cals 119
       :carbs 28.7
       :protein 0.2
       :fat 0.0}
      :mashed-potato-fraunhofer ; http://www.acaloriecounter.com/food/potatoes-mashed-dehydrated-prepared-from-flakes-without-milk-whole-milk-and-butter-added
      {:serve 210 ; cup
       :cals 203.7
       :fat 10.773
       :carbs 22.701
       :protein 3.759}
      :sauerkraut
      {:serve 100
       :cals 78
       :carbs 4.3
       :fat 0.14
       :protein 0.9}
      :bauernbratwurst
      {:serve 100 ; g
       :cals 305
       :carbs 0.2
       :fat 25.6
       :protein 20.2}
      :schweinbratwurst
      {:serve 100
       :cals 301
       :carbs 0
       :fat 28.7
       :protein 9.9}
     })