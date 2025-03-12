### Запуск тестов:
* `mvn clean test` - запустить все тесты
* `mvn clean test -Dbrowser=browsername` - запуск тестов на конкретном браузере поддержаны браузеры:
  - chrome (значение по умолчанию);
  - firefox;
  - opera;

### В проекте используется: ###
![Linkedin-url](https://img.shields.io/badge/Java-_17-red)
#### Библиотеки: ####
![Linkedin-url](https://img.shields.io/badge/Maven-version_3.9.3-blue)
![Linkedin-url](https://img.shields.io/badge/JUnit_5-version_5.8.1-blue)
![Linkedin-url](https://img.shields.io/badge/Selenium-version_3.141.59-blue)
![Linkedin-url](https://img.shields.io/badge/WebDriverManager-version_5.6.3-blue)
![Linkedin-url](https://img.shields.io/badge/Lombok-version_1.18.28-blue)

---

### Домашнее задание №1

**Цель:**
Реализовать на практике полученные знания, с использованием Actions и своих ожиданий.

**Описание/Пошаговая инструкция выполнения домашнего задания:**

Необходимо создать проект в Maven'e и реализовать:

* Фабрику (WebDriverFactory), которая будет получать значение из окружения и запускать соответствующий браузер
Браузеры: Chrome, Firefox, Opera

* Реализовать подсветку элементов перед нажатием, после нажатия вернуть данные в исходное состояние

* На главно странице Otus'a снизу найти список курсов(популярные курсы, специализации, рекомендации) и реализовать:
  * Метод фильтр по названию курса
  + Метод выбора курса, стартующего раньше всех/позже всех (при совпадении дат - выбрать любой) при помощи reduce

* Реализовать движение мыши при помощи и выбор курса при помощи библиотеки Actions
