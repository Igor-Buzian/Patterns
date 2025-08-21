# Creational Design Patterns

Навигация | Navigation:  
[🇷🇺 Русский](#ru-русский) | [🇬🇧 English](#en-english)

---

## RU Русский

**Порождающие паттерны** помогают управлять процессом создания объектов, делая код гибким и независимым от конкретных классов.  

### Паттерны

- **Abstract Factory (Абстрактная фабрика)**
  
  Создаёт целые семейства взаимосвязанных объектов без указания конкретных классов.  
  **Когда использовать:** несколько семейств объектов, которые должны работать вместе, или когда требуется легко менять реализацию семейства.  
  *Пример:* кроссплатформенный UI (Windows / MacOS).

- **Builder (Строитель)**
  
  Позволяет создавать сложные объекты пошагово, отделяя процесс сборки от представления.  
  **Когда использовать:** объект имеет много опциональных параметров или нужно создавать сложные объекты по шагам.  
  *Пример реализации:*
  
 `CarBuilder` и `CarManualBuilder`, которые создают соответственно объект автомобиля и его инструкцию. `Director` управляет процессом сборки. Клиент вызывает `constructSportsCar(builder)` у директора, после чего получает готовый объект:  

  - Для автомобиля: `Car car = builder.getResult();`  
  - Для инструкции: `Manual carManual = manualBuilder.getResult();`  

  Это показывает, как один и тот же процесс строительства может создавать разные представления объекта (продукт и его документацию).

- **Factory Method (Фабричный метод)**
  
  Делегирует создание объектов подклассам, предоставляя интерфейс для создания объекта.  
  **Когда использовать:** код не должен зависеть от конкретных классов объектов, и нужно легко добавлять новые типы.  
  *Пример реализации:*
  
 `ButtonFactory`, с конкретными реализациями `WindowsButtonFactory` и `HtmlButtonFactory`. В зависимости от операционной системы (`os.name`) выбирается нужная фабрика. Клиент вызывает `factory.info()`, и получаем кнопку нужного типа без привязки к конкретному классу.  

- **Prototype (Прототип)**  
  Позволяет создавать новые объекты копированием существующего.  
  **Когда использовать:** создание объекта «с нуля» дорого или нужно клонировать объект с готовыми параметрами.

- **Singleton (Одиночка)**
  
  Гарантирует, что класс имеет только один экземпляр и предоставляет глобальную точку доступа.  
  **Когда использовать:** один объект для управления состоянием или ресурсами, например логгер или соединение с базой данных.

---

## EN English


**Creational design patterns** help manage the process of object creation, making code flexible and independent of concrete classes.  

### Patterns

- **Abstract Factory**  

  Creates entire families of related objects without specifying their concrete classes.  
  **When to use:** when there are multiple families of objects that need to work together, or when you want to easily switch between implementations.  
  *Example:* cross-platform UI (Windows / MacOS).

- **Builder**  

  Allows constructing complex objects step by step, separating the construction process from the final representation.  
  **When to use:** when an object has many optional parameters or needs to be built step by step.  
  *Example implementation:*  

  `CarBuilder` and `CarManualBuilder` create a car and its manual, respectively. The `Director` manages the construction process. The client calls `constructSportsCar(builder)` on the director and then receives the finished object:  

  - For the car: `Car car = builder.getResult();`  
  - For the manual: `Manual carManual = manualBuilder.getResult();`  

  This demonstrates how the same construction process can produce different representations of an object (the product and its documentation).

- **Factory Method**  

  Delegates object creation to subclasses, providing an interface for creating an object.  
  **When to use:** when the code should not depend on concrete classes and new types may need to be added easily.  
  *Example implementation:*  

  `ButtonFactory` has concrete implementations `WindowsButtonFactory` and `HtmlButtonFactory`. Depending on the operating system (`os.name`), the correct factory is chosen. The client calls `factory.info()` and receives the correct type of button without coupling to a specific class.

- **Prototype**  

  Allows creating new objects by copying an existing instance.  
  **When to use:** when creating an object from scratch is expensive or when you need to clone an object with predefined settings.

- **Singleton**  

  Ensures a class has only one instance and provides a global access point to it.  
  **When to use:** when a single object should manage state or resources, e.g., a logger or a database connection.

