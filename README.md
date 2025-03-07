# Object Validation

## Автор

- [Скоробогатов Ігор Віталійович](https://t.me/thundergodswrath)
- Група ІО-25

## Опис проєкту

Цей проєкт демонструє реалізацію системи валідації полів об’єктів у Java з використанням кастомних
анотацій та рефлексії.

- Валідація полів об'єкта за критеріями, заданими через анотації (наприклад, перевірка на `null`,
  обмеження довжини лайнів).
- Автоматичне визначення типів полів та перевірка на відповідність анотаціям. У випадку помилкової
  конфігурації система видає відповідну помилку.


## Основні класи

### `NotNull`

Анотація для перевірки, що поле не `null`.

### `StringLength`

Анотація для перевірки довжини String. Приймає параметри:

- `min` — мінімальна довжина рядка (за замовчуванням `0`).
- `max` — максимальна довжина рядка (за замовчуванням `Integer.MAX_VALUE`).

### `MaxValue`

Анотація для перевірки, що значення числового поля не перевищує певного максимуму. Приймає параметр:

- `value` — максимальне значення.

### `MinValue`

Анотація для перевірки, що значення числового поля не менше певного мінімуму. Приймає параметр:

- `value` — мінімальне значення.

### `Validator`

Клас, що реалізує валідацію об'єктів через рефлексію.

### Демонстраційні класи

1. **`Relic`**  
   Поля:
    - `name`
    - `age`

2. **`ProjectTask`**  
   Поля:
    - `title`
    - `description`

3. **`God`** (без рефлексії)  
   Поля:
    - `name`
    - `ability`
    - `powerPoints`


## Очікувані результати

Зростаючі витрати на продуктивність (та у послідуючому - зростання часу виконання) при використанні рефлексії у порівнянні зі статичною
валідацією.