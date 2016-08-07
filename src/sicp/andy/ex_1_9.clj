(ns sicp.andy.ex-1-9)

(def 문제
	"다음 두 프로시저는 모두 0보다 큰 정수 두개를 더하는 일을 하는데, 인자에 1을 더하는 inc프로시저와 인자에서 1을 빼는 dec 프로시저를 가져다 쓴다.")

(defn + [a b]
 (cond
  (= a 0) b
  :else (inc (+ (dec a) b))))
;;(inc (+ 4 5))
;;(inc (inc (+ 3 5)))
;;(inc (inc (inc (+ 2 5))))
;;(inc (inc (inc (inc (+ 1 5)))))
;;(inc (inc (inc (inc 5)))))
;;(inc (inc (inc 6)))
;;(inc (inc 7))
;;(inc 8)
;;9

(defn + [a b]
 (cond
  (= a 0) b
  :else
  (+ (dec a) (inc b))))
;;(+ 3 6)
;;(+ 2 7)
;;(+ 1 8)
;;9

;; 맞바꿈 계산법에 따라 두 프로시저가 (+ 4 5)를 계산하는 프로세스를 밝혀라. 이프로세스는 반복하는가? 아니면 되도는가?

(def 답1-9-1 "프로세스가 바로 연산하지 않고 미루고 있기 때문에 되돈다!!")
(def 답1-9-2 "프로세스가 늘거나 줄지 않고 있기 때문에 반복이다!!")
