# ResourceRegistration

Type: record | Package: com.hypixel.hytale.component | Extends: java.lang.Record

public record ResourceRegistration<ECS_TYPE, T extends Resource<ECS_TYPE>>(
    @Nonnull Class<? super T> typeClass,
    @Nullable String id,
    @Nullable BuilderCodec<T> codec,
    @Nonnull Supplier<T> supplier,
    @Nonnull ResourceType<ECS_TYPE, T> resourceType
)

Immutable record holding all metadata for a registered resource type.

## Record Components

- `typeClass` -- the registered resource class
- `id` -- the serialization ID (null for non-serialized resources)
- `codec` -- the serialization codec (null for non-serialized resources)
- `supplier` -- factory for creating default resource instances
- `resourceType` -- the ResourceType handle

## Related Types

- ResourceType -- the typed handle for accessing the resource
- ComponentRegistration -- the equivalent record for components
