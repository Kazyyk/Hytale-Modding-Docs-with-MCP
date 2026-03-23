# Holder

Type: class | Package: com.hypixel.hytale.component | Extends: java.lang.Object

public class Holder<ECS_TYPE>

A portable container for entity data. Holders are used when entities are added to or removed from a Store, and during serialization/deserialization. They hold an Archetype and an array of Component instances, protected by a `StampedLock` for thread safety.

Holders are pooled and reused by the registry via `newHolder()`.

## Type Parameters

- `ECS_TYPE` -- the store type parameter

## Methods


public Archetype<ECS_TYPE> getArchetype()


@Nullable
public <T extends Component<ECS_TYPE>> T getComponent(@Nonnull ComponentType<ECS_TYPE, T> componentType)


public <T extends Component<ECS_TYPE>> void addComponent(@Nonnull ComponentType<ECS_TYPE, T> componentType, @Nonnull T component)


public <T extends Component<ECS_TYPE>> void replaceComponent(@Nonnull ComponentType<ECS_TYPE, T> componentType, @Nonnull T component)


public <T extends Component<ECS_TYPE>> void putComponent(@Nonnull ComponentType<ECS_TYPE, T> componentType, @Nonnull T component)


public <T extends Component<ECS_TYPE>> void removeComponent(@Nonnull ComponentType<ECS_TYPE, T> componentType)


public <T extends Component<ECS_TYPE>> void ensureComponent(@Nonnull ComponentType<ECS_TYPE, T> componentType)


@Nonnull
public Holder<ECS_TYPE> clone()

Deep-clones all components.


public Holder<ECS_TYPE> cloneSerializable(@Nonnull ComponentRegistry.Data<ECS_TYPE> data)

Clones only serializable components, excluding `NonSerialized` entities.


public boolean hasSerializableComponents(@Nonnull ComponentRegistry.Data<ECS_TYPE> data)

## Related Types

- Ref -- the in-store reference returned after adding a Holder
- Store -- `addEntity()` and `removeEntity()` operate on Holders
- Archetype -- defines the component shape of the Holder
