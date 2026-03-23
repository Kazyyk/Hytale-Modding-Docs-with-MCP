# SystemGroup

Type: class | Package: com.hypixel.hytale.component | Extends: java.lang.Object | Implements: Comparable<SystemGroup<ECS_TYPE>>

public class SystemGroup<ECS_TYPE> implements Comparable<SystemGroup<ECS_TYPE>>

Groups systems for dependency-based execution ordering. Systems can declare a group via `getGroup()`, and groups can declare dependencies on other groups, system types, or individual systems. The ComponentRegistry uses these dependencies to compute a topological sort for system execution.

## Type Parameters

- `ECS_TYPE` -- the store type parameter

## Methods


@Nonnull
public ComponentRegistry<ECS_TYPE> getRegistry()


@Nonnull
public Set<Dependency<ECS_TYPE>> getDependencies()

Returns the set of dependencies declared for this group.


public int getIndex()


public void validateRegistry(@Nonnull ComponentRegistry<ECS_TYPE> registry)


public void validate()

## Related Types

- SystemType -- categorizes systems by base class
- `Dependency` -- expresses ordering constraints between groups, types, and systems

Also in this package: AddReason, Archetype, ArchetypeChunk, CommandBuffer, Component, ComponentAccessor, ComponentRegistration, ComponentRegistry, ComponentRegistryProxy, ComponentType, Data, DisableProcessingAssert, EmptyResourceStorage, Holder, IComponentRegistry, IResourceStorage, NonSerialized, NonTicking, ProcessingCounter, ReadWriteQuery (and 8 more)

Complete API:
  public ComponentRegistry<ECS_TYPE> getRegistry()
  public Set<Dependency<ECS_TYPE>> getDependencies()
  public int getIndex()
  public void validateRegistry(ComponentRegistry<ECS_TYPE> registry)
  public void validate()
  void invalidate()
  boolean isValid()
  public int compareTo(SystemGroup<ECS_TYPE> o)
  public boolean equals(Object o)
  public int hashCode()
  public String toString()

Fields:
private final ComponentRegistry<ECS_TYPE> registry
private final int index
private final Set<Dependency<ECS_TYPE>> dependencies
private boolean invalidated
