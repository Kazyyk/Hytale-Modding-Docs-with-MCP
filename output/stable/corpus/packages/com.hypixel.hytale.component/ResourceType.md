# ResourceType

Type: class | Package: com.hypixel.hytale.component | Extends: java.lang.Object | Implements: Comparable<ResourceType<ECS_TYPE, ?>>

public class ResourceType<ECS_TYPE, T extends Resource<ECS_TYPE>> implements Comparable<ResourceType<ECS_TYPE, ?>>

A typed handle representing a registered resource in the ECS. Obtained from IComponentRegistry.registerResource(). Used to access per-store singleton data via `Store.getResource()`.

## Type Parameters

- `ECS_TYPE` -- the store type parameter
- `T` -- the concrete resource class

## Fields


@Nonnull
public static final ResourceType[] EMPTY_ARRAY = new ResourceType[0];

## Methods


@Nonnull
public ComponentRegistry<ECS_TYPE> getRegistry()


@Nonnull
public Class<? super T> getTypeClass()


public int getIndex()


public void validateRegistry(@Nonnull ComponentRegistry<ECS_TYPE> registry)


public void validate()

## Related Types

- Resource -- the interface all resources implement
- ResourceRegistration -- the full registration record
- Store -- uses ResourceType to access resources
- IResourceStorage -- loads and saves resources by type

Also in this package: AddReason, Archetype, ArchetypeChunk, CommandBuffer, Component, ComponentAccessor, ComponentRegistration, ComponentRegistry, ComponentRegistryProxy, ComponentType, Data, DisableProcessingAssert, EmptyResourceStorage, Holder, IComponentRegistry, IResourceStorage, NonSerialized, NonTicking, ProcessingCounter, ReadWriteQuery (and 8 more)

Complete API:
  void init(ComponentRegistry<ECS_TYPE> registry, Class<? super T> tClass, int index)
  public ComponentRegistry<ECS_TYPE> getRegistry()
  public Class<? super T> getTypeClass()
  public int getIndex()
  public void validateRegistry(ComponentRegistry<ECS_TYPE> registry)
  public void validate()
  void invalidate()
  boolean isValid()
  public int compareTo(ResourceType<ECS_TYPE,?> o)
  public boolean equals(Object o)
  public int hashCode()
  public String toString()

Fields:
public static final ResourceType[] EMPTY_ARRAY
private ComponentRegistry<ECS_TYPE> registry
private Class<? super T> tClass
private int index
private boolean invalid
