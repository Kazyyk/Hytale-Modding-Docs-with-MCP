# ComponentRegistration

Type: record | Package: com.hypixel.hytale.component | Extends: java.lang.Record

public record ComponentRegistration<ECS_TYPE, T extends Component<ECS_TYPE>>(
    @Nonnull Class<? super T> typeClass,
    @Nullable String id,
    @Nullable BuilderCodec<T> codec,
    @Nonnull Supplier<T> supplier,
    @Nonnull ComponentType<ECS_TYPE, T> componentType
)

Immutable record holding all metadata for a registered component type. Created internally by ComponentRegistry during registration.

## Record Components

- `typeClass` -- the registered component class
- `id` -- the serialization ID (null for non-serialized components)
- `codec` -- the serialization codec (null for non-serialized components)
- `supplier` -- factory for creating default component instances
- `componentType` -- the ComponentType handle

## Related Types

- ComponentType -- the typed handle for accessing the component
- ResourceRegistration -- the equivalent record for resources

Also in this package: AddReason, Archetype, ArchetypeChunk, CommandBuffer, Component, ComponentAccessor, ComponentRegistry, ComponentRegistryProxy, ComponentType, Data, DisableProcessingAssert, EmptyResourceStorage, Holder, IComponentRegistry, IResourceStorage, NonSerialized, NonTicking, ProcessingCounter, ReadWriteQuery, Ref (and 8 more)
