	
Budapest Kupa (Java)
A Budapest Kupát a Teljesítménytúrázók Társasága írta ki. Elnyerésének feltétele, hogy a 2017-re meghirdetett 144 túrából
legalább 10 túrán vegyen részt az ember, és igazoltan teljesítse is azt. Az ön feladata egy olyan program írása, 
amely az ebben a sorozatban szereplő túrák adatait dolgozza fel.
A standard bemenet első sorában a feldolgozandó túrák darabszáma szerepel (N). A következő N sor egy-egy túra adatait tartalmazza
a következő formában: év;hónap;nap;túra_neve;túra_távja
Az év, a hónap és a nap az év egy napjának leírására szolgál: az év az évszámot, a hónap a hónap éven belüli sorszámát,
a nap pedig a túra napját írja le az adott hónapon belül. Az év, hónap, nap adatok mindig egy valódi, létező dátumot jelölnek.
A túra_neve egy sztring, a túra_távja pedig egy pozitív egész szám. Az említett adatokat pontosvessző karakterek választják el 
egymástól egy soron belül. A pontosvessző karakter nem szerepel egyik túra nevében sem.
A programjának a standard kimenetre kell írnia a túrák adatait dátum szerint növekvő sorrendben! 
Ha két túrát is ugyanazon a napon rendeznének meg, akkor ezeket a túrákat a nevük alapján állítsa lexikografikusan növekvő sorrendbe! 
Ha lennének olyan túrák, amelyeknek a dátuma és a neve is megegyezne, de többféle távon is megrendezik, akkor ezeket a túrákat a távok
hossza szerint tegye növekvő sorrendbe! A rendezett adatokat a példa bemenetben és kimenetben látható formában
írja a programja a standard kimenetre!

Példa bemenet:
12
2017;02;04;Kitaibel Pal emlektura;35
2017;01;21;Toldi Miklos emlektura;50
2017;04;01;Baba;22
2017;01;21;Toldi Miklos emlektura;40
2017;02;04;Kitaibel Pal emlektura;25
2017;01;21;Toldi Miklos emlektura;30
2017;02;04;Kitaibel Pal emlektura;10
2017;01;21;Toldi Miklos emlektura;20
2017;04;01;Pipi;12
2017;01;21;Toldi Miklos emlektura;10
2017;02;04;Kitaibel Pal emlektura;18
2017;01;21;Toldi Miklos emlektura;5

A példa bemenethez tartozó kimenet:
2017;01;21;Toldi Miklos emlektura;5
2017;01;21;Toldi Miklos emlektura;10
2017;01;21;Toldi Miklos emlektura;20
2017;01;21;Toldi Miklos emlektura;30
2017;01;21;Toldi Miklos emlektura;40
2017;01;21;Toldi Miklos emlektura;50
2017;02;04;Kitaibel Pal emlektura;10
2017;02;04;Kitaibel Pal emlektura;18
2017;02;04;Kitaibel Pal emlektura;25
2017;02;04;Kitaibel Pal emlektura;35
2017;04;01;Baba;22
2017;04;01;Pipi;12
