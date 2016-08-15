(ns sicp.lester.ex-1-3)

(def 문제
  "세 숫자를 인자로 받아 그 가운데 큰 숫자 두 개를 제곱한 다음 그 두 값을 덧셈하여 내놓는 프로시저를 정의하라.")

(declare ssort)

(defn answer [a b c]
  (let [top-two (take 2 (ssort a b c))]
    (reduce + (map (fn [x] (* x x)) top-two))))

(defn- ssort [& coll]
  "simple sort fn"
  (loop [cnt (count coll)
         result coll]
    (if (pos? cnt)
      (recur (dec cnt)
             (loop [c (first result)
                    r (rest result)
                    l []]
               (if (empty? r)
                 (conj l c)
                 (let [ordered (#(if (> %1 %2) [%1 %2] [%2 %1]) c (first r))]
                   (recur (last ordered) (rest r) (conj l (first ordered)))))))
      result)))