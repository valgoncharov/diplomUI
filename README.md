# Проект по автоматизации IBS


## 🚀: Содержание:

- [Технологии и инструменты](#earth_africa-технологии-и-инструменты)
- [Реализованные проверки](#earth_africa-Реализованные-проверки)
- [Сборка в Jenkins](#earth_africa-Jenkins-job)
- [Запуск из терминала](#earth_africa-Запуск-тестов-из-терминала)
- [Примеры использования](#earth_africa-Allure-отчет)
- [Allure отчет](#earth_africa-Allure-отчет)
- [Отчет в Telegram](#earth_africa-Уведомление-в-Telegram-при-помощи-бота)
- [Пример запуска теста в Selenoid](#earth_africa-Примеры-видео-о-прохождении-тестов)

## 🧰: Технологии и инструменты

<p align="center">
<a href="https://www.jetbrains.com/idea/"><img src="image/logo/Idea.svg" width="50" height="50"  alt="IDEA"/></a>
<a href="https://www.java.com/"><img src="image/logo/Java.svg" width="50" height="50"  alt="Java"/></a>
<a href="https://github.com/"><img src="image/logo/GitHub.svg" width="50" height="50"  alt="Github"/></a>
<a href="https://junit.org/junit5/"><img src="image/logo/Junit5.svg" width="50" height="50"  alt="JUnit 5"/></a>
<a href="https://gradle.org/"><img src="image/logo/Gradle.svg" width="50" height="50"  alt="Gradle"/></a>
<a href="https://selenide.org/"><img src="image/logo/Selenide.svg" width="50" height="50"  alt="Selenide"/></a>
<a href="https://aerokube.com/selenoid/"><img src="image/logo/Selenoid.svg" width="50" height="50"  alt="Selenoid"/></a>
<a href="https://github.com/allure-framework/allure2"><img src="image/logo/Allure.svg" width="50" height="50"  alt="Allure"/></a>
<a href="https://www.jenkins.io/"><img src="image/logo/Jenkins.svg" width="50" height="50"  alt="Jenkins"/></a>
</p>

## ⚓: Реализованные проверки

Тест 1
- ✓ Открыть русскую версию сайта ibs.ru
- ✓ Нажать на кнопку "Принять условия" (cookie)
Тест 2
- ✓ Нажать поиск
- ✓ Выбрать Импортозамещение
- ✓ Проверить что отображаются результаты

Тест 3
- ✓ Выполнить поиск компании IBS
- ✓ Проверить что в названии присутствует текст "IBS — ведущая российская IT-сервисная компания"


## <img src="image/logo/Jenkins.svg" width="25" height="25"  alt="Jenkins"/></a> Jenkins <a target="_blank" href="https://jenkins.autotests.cloud/job/ValGoncharovDiplomUI/"> job </a>
<p align="center">
<a href="https://jenkins.autotests.cloud/job/ValGoncharovDiplomUI/"> <img src="image/Jenkins01.png" alt="Jenkins"/></a>
</p>


## 🧙: Сборка в Jenkins:

- Browser (браузер, по умолчанию chrome)
- Version (версия браузера, по умолчанию 108.0)
- Browser_size (размер окна браузера, по умолчанию 1920x1080)



## 🏗️: Запуск тестов из терминала
Локальный запуск:
```
gradle clean test
```

Удаленный запуск:
```
clean
test
-Dbrowser=${BROWSER}
-Dversion=${VERSION}
-Dsize=${BROWSER_SIZE}
-Durl=${REMOTE_URL}
```

# Примеры использования

### Для запуска удаленных тестов необходимо заполнить remote.properties или передать значение:

* browser (default chrome)
* browserVersion (default 108.0)
* browserSize (default 1920x1080)
* remoteDriverUrl (url address from selenoid or grid)
* videoStorage (url address where you should get video)
* threads (number of threads)


Запускайте тесты с заполненным remote.properties:
```bash
gradle clean test
```

Запускайте тесты с незаполненным remote.properties:
```bash
gradle clean -DremoteDriverUrl=https://%s:%s@selenoid.autotests.cloud/wd/hub/ -DvideoStorage=https://selenoid.autotests.cloud/video/ -Dthreads=1 test
```

Выдать отчет:
```bash
allure serve build/allure-results
```
## <img src="image/logo/Allure.svg" width="25" height="25"  alt="Allure"/></a> Отчет в <a target="_blank" href="https://jenkins.autotests.cloud/job/ValGoncharovDiplomUI/allure/">Allure report</a>

## 🧪: Тесты
<p align="center">
<img title="Allure Tests" src="image/Test.png">
</p>

## ⛅: Основной отчет
<p align="center">
<img title="Allure Overview Dashboard" src="image/report.png">
</p>

## 💹: Графики
<p align="center">
<img title="Allure Tests" src="image/graff.png">
</p>

## <img width="4%" title="Selenoid" src="image/logo/Selenoid.svg"> Пример запуска теста в Selenoid

> Видео примеры запуска тестов
<p align="center">
  <img title="Selenoid Video" src="image/video/video.gif">
</p>
