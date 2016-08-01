(ns sicp.todd.ex-1-8)

(def 문제
  "세제곱근을 구하는 뉴튼법은, x의 세제곱근에 가까운 값을 y라고 할때 다음 식에 따라 y보다 더 가까운 값을
  계산하는 것이다. 
  (/ (+ (/ x (squre y)) (* 2 y)) 3) 
  제곱근 프로시저처럼, 이식을 써서 세제곱근 프로시저를 짜보자. (1.3.4절에서 제곱근과 세제곱근을 간추려,
  더 쓰임새가 넓은 뉴튼 방법을 어떻게 표현할 수 있는지 보게 된다.")

(defn abs [a]
  (if (< a 0)
    (- a)
    a))

(defn square [a]
  (* a a))

(defn cube [a]
  (* a a a))

(defn improve [guess x]
  (/ (+ (/ x (square guess)) (* 2 guess)) 3))

(defn good-enough? [guess x]
  (< (abs (- (cube guess) x))  0.001))

(defn cube-root-iter [guess x]
  (if (good-enough? guess x)
    guess
    (recur (improve guess x) x)))

(defn cube-root [x]
  (cube-root-iter 1.0 x))

(cube-root 4)
;; => 1.5874096961416333
