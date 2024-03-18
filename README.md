### Задачи по JDK
 * Seminar_1

1. Реализовать клиент-серверное приложение. Начало его можно увидеть в презентации к первому уроку, а можно ориентироваться на скриншоты. Результат можно увидеть на скриншотах, которые также можно найти в материалах к уроку
2. Клиентское приложение должно отправлять сообщения из текстового поля сообщения в серверное приложение по нажатию кнопки или по нажатию клавиши Enter на поле ввода сообщения;
3. Продублировать импровизированный лог (историю) чата в файле;
4. При запуске клиента чата заполнять поле истории из файла, если он существует. Обратите внимание, что чаще всего история сообщений хранится на сервере и заполнение истории чата лучше делать при соединении с сервером, а не при открытии окна клиента.
[Ссылка на задание 1](https://github.com/Kingofhell1/JavaDevelopmentKit/tree/main/src/JavaDEvelomentKitLessone1)

 * Seminar_2

 На семинаре мы разделили класс отвечающий за клиентское приложение на класс, отвечающий за логику приложения и за графическую часть приложения. А также создали слабую связь между ними с помощью интерфейса.
 Аналогичным образом вам надо преобразовать серверную часть приложения. Схема, которую требуется реализовать, также есть в материалах к уроку.
 Вы можете работать со своим проектом из первой домашки, а можете работать с проектом с семинара (ссылка в материалах к уроку).
 Требуется разделить класс серверного приложения на контроллер, GUI и репозиторий.
 Если вы работаете со своим проектом, то клиентскую часть также надо разделить на контроллер и GUI.
 Связь между составляющими проекта реализовать с помощью интерфейсов\
 [Ссылка на задание 2](https://github.com/Kingofhell1/JavaDevelopmentKit/tree/main/src/JavaDevelomentKitLesson2)
 
 * Seminar_3

1. Написать класс Калькулятор (необобщенный), который содержит обобщенные статические методы: sum(), multiply(), divide(), subtract(). Параметры этих методов – два числа разного типа, над которыми должна быть произведена операция. Методы должны возвращать результат своей работы.
[Ссылка на калькулятор](https://github.com/Kingofhell1/JavaDevelopmentKit/blob/main/src/JavaDelevomentKitLesson3/Calulator/Calculator.java)
2. Напишите обобщенный метод compareArrays(), который принимает два массива и возвращает true, если они одинаковые, и false в противном случае. Массивы могут быть любого типа данных, но должны иметь одинаковую длину и содержать элементы одного типа по парно по индексам.
[Ссылка на сравнение массивов](https://github.com/Kingofhell1/JavaDevelopmentKit/blob/main/src/JavaDelevomentKitLesson3/ArrayComparator/ArrayComparator.java)
3. Напишите обобщенный класс Pair, который представляет собой пару значений разного типа. Класс должен иметь методы getFirst(), getSecond() для получения значений каждого из составляющих пары, а также переопределение метода toString(), возвращающее строковое представление пары. Работу сдать в виде ссылки на гит репозиторий.
[Ссылка на Pair](https://github.com/Kingofhell1/JavaDevelopmentKit/blob/main/src/JavaDelevomentKitLesson3/Pair/Pair.java)

 * Seminar_4
   Создать справочник сотрудников
   Необходимо:
   Создать класс справочник сотрудников, который содержит внутри
   коллекцию сотрудников - каждый сотрудник должен иметь следующие атрибуты:
   Табельный номер
   Номер телефона
   Имя
   Стаж
   Добавить метод, который ищет сотрудника по стажу (может быть список)
   Добавить метод, который возвращает номер телефона сотрудника по имени (может быть список)
   Добавить метод, который ищет сотрудника по табельному номеру
   Добавить метод добавления нового сотрудника в справочник
[Ссылка на Справочник](https://github.com/Kingofhell1/JavaDevelopmentKit/tree/main/src/JavaDevelomentKitLesson4/HandBook)