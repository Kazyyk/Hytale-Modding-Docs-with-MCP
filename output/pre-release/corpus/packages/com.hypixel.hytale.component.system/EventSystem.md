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
