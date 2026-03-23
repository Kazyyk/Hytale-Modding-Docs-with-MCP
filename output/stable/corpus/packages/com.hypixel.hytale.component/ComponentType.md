# ComponentType

Type: class | Package: com.hypixel.hytale.component | Extends: java.lang.Object | Implements: Comparable<ComponentType<ECS_TYPE, ?>>, Query<ECS_TYPE>

public class ComponentType<ECS_TYPE, T extends Component<ECS_TYPE>> implements Comparable<ComponentType<ECS_TYPE, ?>>, Query<ECS_TYPE>

A typed handle representing a registered component in the ECS. Obtained from IComponentRegistry.registerComponent(). ComponentType serves dual purpose: it is used to access components on entities, and it implements `Query` so it can be used directly as an archetype filter (matching any entity that has this component).

## Type Parameters

- `ECS_TYPE` -- the store type parameter
- `T` -- the concrete component class

## Fields


@Nonnull
public static final ComponentType[] EMPTY_ARRAY = new ComponentType[0];

## Methods


@Nonnull
public ComponentRegistry<ECS_TYPE> getRegistry()

Returns the owning registry.


@Nonnull
public Class<? super T> getTypeClass()

Returns the registered class for this component type.


public int getIndex()

Returns the internal index used for array-based lookups in ArchetypeChunk.


public boolean test(@Nonnull Archetype<ECS_TYPE> archetype)

Query implementation: returns `true` if the archetype contains this component type.


public void validateRegistry(@Nonnull ComponentRegistry<ECS_TYPE> registry)

Throws `IllegalArgumentException` if this type belongs to a different registry.


public void validate()

Throws `IllegalStateException` if this type has been invalidated (unregistered).

## Related Types

- Component -- the interface all components implement
- ComponentRegistration -- the full registration record
- Archetype -- a set of ComponentTypes defining an entity shape
- Store -- uses ComponentType for all component access

Also in this package: AddReason, Archetype, ArchetypeChunk, CommandBuffer, Component, ComponentAccessor, ComponentRegistration, ComponentRegistry, ComponentRegistryProxy, Data, DisableProcessingAssert, EmptyResourceStorage, Holder, IComponentRegistry, IResourceStorage, NonSerialized, NonTicking, ProcessingCounter, ReadWriteQuery, Ref (and 8 more)

Complete API:
  void init(ComponentRegistry<ECS_TYPE> registry, Class<? super T> tClass, int index)
  public ComponentRegistry<ECS_TYPE> getRegistry()
  public Class<? super T> getTypeClass()
  public int getIndex()
  void invalidate()
  boolean isValid()
  public boolean test(Archetype<ECS_TYPE> archetype)
  public boolean requiresComponentType(ComponentType<ECS_TYPE,?> componentType)
  public void validateRegistry(ComponentRegistry<ECS_TYPE> registry)
  public void validate()
  public int compareTo(ComponentType<ECS_TYPE,?> o)
  public boolean equals(Object o)
  public int hashCode()
  public String toString()

Fields:
public static final ComponentType[] EMPTY_ARRAY
private ComponentRegistry<ECS_TYPE> registry
private Class<? super T> tClass
private int index
private boolean invalid
