# WeakComponentReference

Type: class | Package: com.hypixel.hytale.component | Extends: java.lang.Object

public class WeakComponentReference<ECS_TYPE, T extends Component<ECS_TYPE>>

A weak reference to a specific component on a specific entity. Caches the component instance via a `WeakReference` for fast access, falling back to a full store lookup if the cached reference has been garbage collected. Automatically invalidated when the owning entity is removed.

## Methods


@Nullable
public T get()

Returns the component, or `null` if the entity has been removed.


@Nonnull
public Store<ECS_TYPE> getStore()


@Nonnull
public ComponentType<ECS_TYPE, T> getType()


@Nullable
public Ref<ECS_TYPE> getEntityReference()

## Related Types

- Ref -- the entity reference this wraps
- ComponentType -- the component type being referenced

Also in this package: AddReason, Archetype, ArchetypeChunk, CommandBuffer, Component, ComponentAccessor, ComponentRegistration, ComponentRegistry, ComponentRegistryProxy, ComponentType, Data, DisableProcessingAssert, EmptyResourceStorage, Holder, IComponentRegistry, IResourceStorage, NonSerialized, NonTicking, ProcessingCounter, ReadWriteQuery (and 8 more)

Complete API:
  public T get()
  public Store<ECS_TYPE> getStore()
  public ComponentType<ECS_TYPE,T> getType()
  public Ref<ECS_TYPE> getEntityReference()
  void invalidate()
  public boolean equals(Object o)
  public int hashCode()
  public String toString()

Fields:
private final Store<ECS_TYPE> store
private final ComponentType<ECS_TYPE,T> type
private Ref<ECS_TYPE> ref
private WeakReference<T> reference
