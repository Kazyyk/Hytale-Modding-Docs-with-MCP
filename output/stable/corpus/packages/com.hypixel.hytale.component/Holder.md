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

Also in this package: AddReason, Archetype, ArchetypeChunk, CommandBuffer, Component, ComponentAccessor, ComponentRegistration, ComponentRegistry, ComponentRegistryProxy, ComponentType, Data, DisableProcessingAssert, EmptyResourceStorage, IComponentRegistry, IResourceStorage, NonSerialized, NonTicking, ProcessingCounter, ReadWriteQuery, Ref (and 8 more)

Complete API:
  public static Holder<T>[] emptyArray()
  public Component<ECS_TYPE>[] ensureComponentsSize(int size)
  public void init(Archetype<ECS_TYPE> archetype, Component<ECS_TYPE>[] components)
  public void _internal_init(Archetype<ECS_TYPE> archetype, Component<ECS_TYPE>[] components, ComponentType<ECS_TYPE,UnknownComponents<ECS_TYPE>> unknownComponentType)
  public Archetype<ECS_TYPE> getArchetype()
  public void ensureComponent(ComponentType<ECS_TYPE,T> componentType)
  public T ensureAndGetComponent(ComponentType<ECS_TYPE,T> componentType)
  public void addComponent(ComponentType<ECS_TYPE,T> componentType, T component)
  private void addComponent0(ComponentType<ECS_TYPE,T> componentType, T component)
  public void replaceComponent(ComponentType<ECS_TYPE,T> componentType, T component)
  public void putComponent(ComponentType<ECS_TYPE,T> componentType, T component)
  public T getComponent(ComponentType<ECS_TYPE,T> componentType)
  public void removeComponent(ComponentType<ECS_TYPE,T> componentType)
  public boolean tryRemoveComponent(ComponentType<ECS_TYPE,T> componentType)
  public boolean hasSerializableComponents(ComponentRegistry.Data<ECS_TYPE> data)
  public void updateData(ComponentRegistry.Data<ECS_TYPE> oldData, ComponentRegistry.Data<ECS_TYPE> newData)
  public Holder<ECS_TYPE> clone()
  public Holder<ECS_TYPE> cloneSerializable(ComponentRegistry.Data<ECS_TYPE> data)
  void loadComponentsMap(ComponentRegistry.Data<ECS_TYPE> data, Map<String,Component<ECS_TYPE>> map)
  Map<String,Component<ECS_TYPE>> createComponentsMap(ComponentRegistry.Data<ECS_TYPE> data)
  public boolean equals(Object o)
  public int hashCode()
  public String toString()

Fields:
private static final Holder<?>[] EMPTY_ARRAY
private final ComponentRegistry<ECS_TYPE> registry
private final StampedLock lock
private Archetype<ECS_TYPE> archetype
private Component<ECS_TYPE>[] components
private boolean ensureValidComponents
