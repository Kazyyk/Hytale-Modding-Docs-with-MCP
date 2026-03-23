# ComponentAccessor

Type: interface | Package: com.hypixel.hytale.component

public interface ComponentAccessor<ECS_TYPE>

Unified interface for reading and mutating entity data and dispatching ECS events. Both Store and CommandBuffer implement this interface, allowing systems to operate on either without knowing which one they are using.

## Type Parameters

- `ECS_TYPE` -- the store type parameter

## Methods


@Nullable
<T extends Component<ECS_TYPE>> T getComponent(@Nonnull Ref<ECS_TYPE> ref, @Nonnull ComponentType<ECS_TYPE, T> componentType)


@Nonnull
<T extends Component<ECS_TYPE>> T ensureAndGetComponent(@Nonnull Ref<ECS_TYPE> ref, @Nonnull ComponentType<ECS_TYPE, T> componentType)


@Nonnull
Archetype<ECS_TYPE> getArchetype(@Nonnull Ref<ECS_TYPE> ref)


@Nonnull
<T extends Resource<ECS_TYPE>> T getResource(@Nonnull ResourceType<ECS_TYPE, T> resourceType)


@Nonnull
ECS_TYPE getExternalData()


<T extends Component<ECS_TYPE>> void putComponent(@Nonnull Ref<ECS_TYPE> ref, @Nonnull ComponentType<ECS_TYPE, T> componentType, @Nonnull T component)


<T extends Component<ECS_TYPE>> void addComponent(@Nonnull Ref<ECS_TYPE> ref, @Nonnull ComponentType<ECS_TYPE, T> componentType, @Nonnull T component)


<T extends Component<ECS_TYPE>> T addComponent(@Nonnull Ref<ECS_TYPE> ref, @Nonnull ComponentType<ECS_TYPE, T> componentType)


Ref<ECS_TYPE>[] addEntities(@Nonnull Holder<ECS_TYPE>[] holders, @Nonnull AddReason reason)


@Nullable
Ref<ECS_TYPE> addEntity(@Nonnull Holder<ECS_TYPE> holder, @Nonnull AddReason reason)


@Nonnull
Holder<ECS_TYPE> removeEntity(@Nonnull Ref<ECS_TYPE> ref, @Nonnull Holder<ECS_TYPE> target, @Nonnull RemoveReason reason)


<T extends Component<ECS_TYPE>> void removeComponent(@Nonnull Ref<ECS_TYPE> ref, @Nonnull ComponentType<ECS_TYPE, T> componentType)


<T extends Component<ECS_TYPE>> void tryRemoveComponent(@Nonnull Ref<ECS_TYPE> ref, @Nonnull ComponentType<ECS_TYPE, T> componentType)


<Event extends EcsEvent> void invoke(@Nonnull Ref<ECS_TYPE> ref, @Nonnull Event event)

Dispatches an entity-scoped ECS event.


<Event extends EcsEvent> void invoke(@Nonnull EntityEventType<ECS_TYPE, Event> systemType, @Nonnull Ref<ECS_TYPE> ref, @Nonnull Event event)

Dispatches an entity-scoped event to a specific event type.


<Event extends EcsEvent> void invoke(@Nonnull Event event)

Dispatches a world-scoped ECS event.


<Event extends EcsEvent> void invoke(@Nonnull WorldEventType<ECS_TYPE, Event> systemType, @Nonnull Event event)

Dispatches a world-scoped event to a specific event type.

## Related Types

- Store -- concrete implementation for direct store access
- CommandBuffer -- concrete implementation for deferred commands
