# EventSystem

Type: class | Package: com.hypixel.hytale.component.system | Extends: EcsEvent>

public abstract class EventSystem<EventType extends EcsEvent>

## Fields

- @Nonnull private final Class<EventType> eventType

## Constructors

- protected EventSystem(@Nonnull Class<EventType> eventType)

## Methods

- protected boolean shouldProcessEvent(@Nonnull EventType event)
- @Nonnull public Class<EventType> getEventType()

Known subclasses: EntityEventSystem, WorldEventSystem

Also in this package: ArchetypeChunkSystem, CancellableEcsEvent, Data, DelayedSystem, EcsEvent, EntityEventSystem, HolderSystem, ICancellableEcsEvent, ISystem, MetricSystem, QuerySystem, RefChangeSystem, RefSystem, StoreSystem, System, WorldEventSystem

Complete API:
  protected boolean shouldProcessEvent(EventType event)
  public Class<EventType> getEventType()

Fields:
private final Class<EventType> eventType
