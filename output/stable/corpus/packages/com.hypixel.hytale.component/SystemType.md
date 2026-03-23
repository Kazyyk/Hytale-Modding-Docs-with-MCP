# SystemType

Type: class | Package: com.hypixel.hytale.component | Extends: java.lang.Object | Implements: Comparable<SystemType<ECS_TYPE, ?>>

public class SystemType<ECS_TYPE, T extends ISystem<ECS_TYPE>> implements Comparable<SystemType<ECS_TYPE, ?>>

A typed handle representing a category of ECS systems. The registry pre-registers system types for the built-in system base classes (`TickingSystem`, `RefSystem`, `HolderSystem`, etc.). Systems are grouped by their SystemType for iteration -- for example, the store iterates all systems of the `TickingSystem` type each tick.

## Type Parameters

- `ECS_TYPE` -- the store type parameter
- `T` -- the system interface or base class

## Fields


@Nonnull
public static final SystemType[] EMPTY_ARRAY = new SystemType[0];

## Methods


@Nonnull
public ComponentRegistry<ECS_TYPE> getRegistry()


public Class<? super T> getTypeClass()


public boolean isType(@Nonnull ISystem<ECS_TYPE> system)

Returns `true` if the given system is an instance of this type's class.


public int getIndex()


public void validateRegistry(@Nonnull ComponentRegistry<ECS_TYPE> registry)


public void validate()

## Related Types

- ComponentRegistry -- registers system types and provides accessors for built-in types
- SystemGroup -- groups systems for dependency ordering

Known subclasses: EventSystemType

Also in this package: AddReason, Archetype, ArchetypeChunk, CommandBuffer, Component, ComponentAccessor, ComponentRegistration, ComponentRegistry, ComponentRegistryProxy, ComponentType, Data, DisableProcessingAssert, EmptyResourceStorage, Holder, IComponentRegistry, IResourceStorage, NonSerialized, NonTicking, ProcessingCounter, ReadWriteQuery (and 8 more)

Complete API:
  public ComponentRegistry<ECS_TYPE> getRegistry()
  public Class<? super T> getTypeClass()
  public boolean isType(ISystem<ECS_TYPE> system)
  public int getIndex()
  public void validateRegistry(ComponentRegistry<ECS_TYPE> registry)
  public void validate()
  protected void invalidate()
  protected boolean isValid()
  public int compareTo(SystemType<ECS_TYPE,?> o)
  public boolean equals(Object o)
  public int hashCode()
  public String toString()

Fields:
public static final SystemType[] EMPTY_ARRAY
private final ComponentRegistry<ECS_TYPE> registry
private final Class<? super T> tClass
private final int index
private boolean invalidated
