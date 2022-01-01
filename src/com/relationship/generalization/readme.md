# 泛化关系

即类的继承，是依赖关系的特例

```plantuml
@startuml
class DaoSupport{
    save(Object entity): void
    delete(Object id): void
}
DaoSupport<|--PersonServiceBean
@enduml
```
