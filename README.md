### Hexlet tests and linter status:
[![Actions Status](https://github.com/Kagawan/java-project-78/actions/workflows/hexlet-check.yml/badge.svg)](https://github.com/Kagawan/java-project-78/actions)
[![Maintainability](https://api.codeclimate.com/v1/badges/3cc65fc60b1ffdce68ff/maintainability)](https://codeclimate.com/github/Kagawan/java-project-78/maintainability)
[![Test Coverage](https://api.codeclimate.com/v1/badges/3cc65fc60b1ffdce68ff/test_coverage)](https://codeclimate.com/github/Kagawan/java-project-78/test_coverage)
![Java CI](https://github.com/Kagawan/java-project-78/workflows/Java%20CI/badge.svg)

# Валидатор данных
**Описание:**
Валидатор данных – библиотека, с помощью которой можно проверять корректность любых данных. Подобных библиотек множество в каждом языке, так как практически все программы работают с внешними данными, которые нужно проверять на корректность. В первую очередь речь идет про данные форм заполняемых пользователями. За основу для проекта взята библиотека yup.

**Пример использования**

Для использования репозитория через JShell, вам нужно выполнить следующие шаги:
1.  **Запустить JShell:** Запустите интерпретатор JShell, который предоставляет интерактивную среду для выполнения кода на Java.
2.  **Импортировать классы:** Импортируйте необходимые классы из репозитория, чтобы использовать их функциональности в JShell. Например:

  import hexlet.code.Validator;  
  import hexlet.code.schemas.StringSchema;  
  import hexlet.code.schemas.NumberSchema;  
  import hexlet.code.schemas.MapSchema;  

3.  **Создать объект валидатора:** Создайте объект валидатора с помощью конструктора Validator()`:

Validator validator = new Validator();

2.  **Настроить схемы валидации:** Настройте схемы валидации, вызвав соответствующие методы объекта валидатора.

Для валидации строк:

    StringSchema stringSchema = validator.string().required().minLength(3);

Для валидации чисел:

    NumberSchema numberSchema = validator.number().required().positive().range(5, 10);

Для валидации объектов типа Map:

    MapSchema mapSchema = validator.map().required().sizeof(2);

5.  **Проверить данные:** Проверьте корректность данных, вызвав метод `isValid()` на соответствующей схеме валидации. 