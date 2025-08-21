# Structural Design Patterns

Навигация | Navigation:  
[🇷🇺 Русский](#ru-русский) | [en English](#en-english)

---

## RU Русский

**Структурные паттерны** описывают способы построения классов и объектов в более крупные структуры, обеспечивая гибкость и удобство работы с ними.  

### Паттерны

- **Adapter (Адаптер)**  

  Позволяет объектам с несовместимыми интерфейсами работать вместе.  
  **Когда использовать:** необходимо использовать существующий класс, интерфейс которого не совпадает с требуемым.  
  *Пример:* обертка вокруг старого API, чтобы использовать его с новым интерфейсом.

- **Bridge (Мост)**  

  Разделяет абстракцию и реализацию, чтобы их можно было изменять независимо.  
  **Когда использовать:** нужно часто менять как абстракции, так и реализации, не создавая множества подклассов.  
  *Пример:* GUI-виджеты, которые могут рендериться на разных платформах.

- **Composite (Компоновщик)**  

  Позволяет сгруппировать объекты в древовидную структуру и работать с отдельными объектами и их группами одинаково.  
  **Когда использовать:** иерархические структуры объектов, например файлы и папки.  
  *Пример:* структура меню, где элемент меню может быть как отдельным, так и содержать подменю.

- **Decorator (Декоратор)**  

  Динамически добавляет объектам новые обязанности, оборачивая их в другие объекты.  
  **Когда использовать:** нужно расширять функциональность объектов без изменения их кода.  
  *Пример:* добавление скроллинга и рамок к графическому элементу.

- **Facade (Фасад)**  

  Предоставляет упрощённый интерфейс к сложной системе классов.  
  **Когда использовать:** нужна простая точка взаимодействия с системой без раскрытия всей сложности.  
  *Пример:* библиотека для работы с видео, где фасад скрывает сложные детали кодирования и декодирования.

- **Flyweight (Приспособленец)**  

  Позволяет эффективно использовать большое количество похожих объектов, разделяя общие данные.  
  **Когда использовать:** когда множество объектов с одинаковыми данными создаёт нагрузку на память.  
  *Пример:* текстовый редактор, где одинаковые символы хранятся как один объект с разделяемыми свойствами.

- **Proxy (Заместитель)**  

  Предоставляет объект-заместитель, который контролирует доступ к другому объекту.  
  **Когда использовать:** нужно добавить контроль, кэширование или ленивую инициализацию при работе с объектом.  
  *Пример:* прокси для удалённого сервиса, проверяющий права доступа перед вызовом реального объекта.


## EN English

**Structural design patterns** describe ways to compose classes and objects into larger structures while keeping them flexible and easy to work with.  

### Patterns

- **Adapter**  

  Allows objects with incompatible interfaces to work together.  
  **When to use:** when you need to use an existing class but its interface does not match the one you need.  
  *Example:* a wrapper around a legacy API to make it compatible with a new interface.

- **Bridge**  

  Separates an abstraction from its implementation, allowing them to vary independently.  
  **When to use:** when both abstractions and implementations change frequently, avoiding a proliferation of subclasses.  
  *Example:* GUI widgets that can be rendered on multiple platforms.

- **Composite**  

  Lets you compose objects into tree structures and treat individual objects and compositions uniformly.  
  **When to use:** hierarchical object structures, such as files and folders.  
  *Example:* menu structures, where a menu item can be a single element or a group containing submenus.

- **Decorator**  

  Dynamically adds responsibilities to objects by wrapping them in other objects.  
  **When to use:** when you need to extend the functionality of objects without modifying their code.  
  *Example:* adding scrolling and borders to a graphical element.

- **Facade**  

  Provides a simplified interface to a complex subsystem.  
  **When to use:** when you need a simple entry point to a system without exposing all its complexity.  
  *Example:* a video library where the facade hides the details of encoding and decoding.

- **Flyweight**  

  Enables efficient sharing of many similar objects by storing common data externally.  
  **When to use:** when creating many objects with identical data would consume too much memory.  
  *Example:* a text editor storing identical characters as shared objects with shared properties.

- **Proxy**  

  Provides a surrogate or placeholder object to control access to another object.  
  **When to use:** when you want to add control, caching, or lazy initialization for an object.  
  *Example:* a proxy for a remote service that checks access rights before calling the real object.

---

