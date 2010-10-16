(use 'cascalog.playground)

(bootstrap)

(?<- (stdout) [?person ?person2 ?a ?g ?g2]
     (age ?person ?a)
     (age ?person2 ?a)
     (gender ?person ?g)
     (gender ?person2 ?g2)
     (> ?a 30))

(?<- (stdout) [!!x !!y !!z !!q !!g]
     (location !!x !!y !!z !!q)
     (gender !!x !!g))

