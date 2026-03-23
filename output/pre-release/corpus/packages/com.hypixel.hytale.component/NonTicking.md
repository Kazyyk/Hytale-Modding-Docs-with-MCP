# NonTicking

Type: class | Package: com.hypixel.hytale.component | Extends: java.lang.Object | Implements: Component<ECS_TYPE>

public class NonTicking<ECS_TYPE> implements Component<ECS_TYPE>

A marker component that excludes an entity from tick processing. When present in an entity's archetype, ticking systems skip the entity. The component is a singleton.

## Methods


public static <ECS_TYPE> NonTicking<ECS_TYPE> get()

Returns the singleton instance.

## Related Types

- NonSerialized -- the equivalent marker for disabling serialization
- ComponentRegistry -- registers the NonTicking type at construction

Also in this package: AddReason, Archetype, ArchetypeChunk, CommandBuffer, Component, ComponentAccessor, ComponentRegistration, ComponentRegistry, ComponentRegistryProxy, ComponentType, Data, DisableProcessingAssert, EmptyResourceStorage, Holder, IComponentRegistry, IResourceStorage, NonSerialized, ProcessingCounter, ReadWriteQuery, Ref (and 8 more)

Complete API:
  public static NonTicking<ECS_TYPE> get()
  public Component<ECS_TYPE> clone()

Fields:
private static final NonTicking<?> INSTANCE
