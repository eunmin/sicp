(ns sicp.amy.ex-1-7)

(def 문제
  "아주 작은 수나 큰 수의 제곱근을 구할 때 good-enough의 문제를 고쳐보라.")

(defn abs "절대값을 리턴한다" [a]
  (if (< a 0) (- a) a))

(defn squares "인자를 제곱한다" [a]
  (* a a))

(defn average "평균값 구한다" [a b]
  (float (/ (+ a b) 2)))

(defn good-enough "참 값에 충분히 가까운지" [guess x]
  (< (abs (- (squares guess) x)) 0.001))

(defn improve "참 제곱근에 더 까까운 값 구하기" [guess x]
  (average guess (/ x guess)))

(defn sqrt-iter "제곱근 구하기" [guess x]
  (if (good-enough guess x)
      guess
      (sqrt-iter (improve guess x)
                 x)))

(defn sqrt [x]
  (sqrt-iter 1.0 x))

(def 답
  "
  고정된 값 0.001 로 good-enough를 비교하기 때문에
  아주 작은 수나 큰 수의 제곱근을 구할 때 좀 더 세분화된 결과값을 구할 수 없다.
  그렇다면 good-enough를 어떻게 고쳐야 참값에 가까운 guess를 구할 수 있지?
  ")
