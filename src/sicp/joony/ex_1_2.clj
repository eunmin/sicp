(ns sicp.joony.ex-1-2)

(def 문제
  "아래식을 앞가지 쓰기 꼴로 고쳐 써 보자")

(def 답
  (/ (+ 5 4 (- 2 (- 3 (+ 6 (/ 4 5)))))
    (* (- 6 2) (- 2 7))));;==> 37/50


;; 참고 : 다음 둘은 같음

(/ 4 5)
4/5
  ;; 이렇게도 쓸 수 있고 더 축약할 수도 있지만, 문제가 의도한것은 위으 것일거 같음

(/ (+ 5 4 (- 2 (- 3 (+ 6 4/5))))
  (* (- 6 2) (- 2 7)));;==> 37/50



