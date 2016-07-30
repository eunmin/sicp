(ns sicp.amy.ex-1-3)

(def 문제
  "세 숫자를 인자로 받아 그 가운데 큰 숫자 두 개를 제곱한 다음,
   그 두 값을 덧셈하여 내놓는 프로시저를 정의하라")

(defn squares "인자를 제곱한다" [a]
     (* a a))

(defn sum-of-squares "제곱한 두 수를 더한다" [a b]
  (+ (squares a) (squares b)))

(defn max-two "세 숫자중 큰 숫자 두 개를 리턴한다" [a b c]
  (cond (> a b) (if (> b c) [a b] [a c])
        (> b a) (if (> a c) [b a] [b c])
        (> c a) (if (> a b) [c a] [c b])))


(defn sum-and-square-max-two "세 숫자 중 큰 두개를 제곱하여 더한다"[a b c]
  (let [[x y] (max-two a b c)]
    (sum-of-squares x y)))


(def 답
  "
  sicp.amy.ex-1-3=> (sum-and-square-max-two 1 3 5)
  34
  sicp.amy.ex-1-3=> (sum-and-square-max-two 4 3 5)
  41
  sicp.amy.ex-1-3=> (sum-and-square-max-two 10 5 3)
  125
  ")
