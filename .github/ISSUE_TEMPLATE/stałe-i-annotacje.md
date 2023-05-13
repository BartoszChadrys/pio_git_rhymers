---
name: Stałe i annotacje
about: info
title: ''
labels: ''
assignees: JakGin

---

• Sklonuj repozytorium do którego zostałeś dodany i utwórz nowy branch poleceniem
(polecenie git checkout -b constants)
6. Przejrzyj kod w poszukiwaniu literałów (napisy, liczby), które można by zastąpić
deklaracjami stałych (np. w klasie DefaultCountingOutRhymer liczby -1 i 12). Wygeneruj
odpowiednie stałe używając opcji Refactor → Extract Constant.
7. Ustaw modyfikator final przy niemutowalnych (nie zmieniających wartości) atrybutach
klas.
8. Użyj annotacji @Override przy metodach tam gdzie jest to możliwe.
• Prześlij zmiany do zdalnego repozytorium (właściciela) – polecenie git push origin
constants.
• Przejdź na główną stronę repozytorium i wybierz opcję New pull request.
• Jako base repository wybierz repozytorium właściciela i branch master, a jako head
repository wybierz branch na którym pracowałeś, po czym kliknij Create pull request.
• Przejdź do strony z nowo utworzonym pull requestem i z kliknij zębatkę przy liście
Reviewers, wybierz właściciela repozytorium jako recenzenta kodu (reviewer).
• Na tej samej stronie powiąż pull request z Issue (opcja Development panelu bocznego po
prawej stronie).
