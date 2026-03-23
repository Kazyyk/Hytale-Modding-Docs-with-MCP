# EventSystemType

Type: abstract class | Package: com.hypixel.hytale.component.event

public abstract class EventSystemType<ECS_TYPE, Event extends EcsEvent, SYSTEM_TYPE extends EventSystem<Event> & ISystem<ECS_TYPE>>

ECS event dispatched through the entity component system.

## Accessors

- getEventClass() | Class<Event> | Accessor method.
- isType(ISystem<ECS_TYPE> system) | boolean | Boolean accessor.

Known subclasses: EntityEventType, WorldEventType

Also in this package: EntityEventType, WorldEventType

Complete API:
  public Class<Event> getEventClass()
  public boolean isType(ISystem<ECS_TYPE> system)

Fields:
private final Class<Event> eClass
