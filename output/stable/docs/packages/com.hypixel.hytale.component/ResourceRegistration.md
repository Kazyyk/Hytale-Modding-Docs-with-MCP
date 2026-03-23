---
title: "ResourceRegistration"
kind: "record"
package: "com.hypixel.hytale.component"
fqcn: "com.hypixel.hytale.component.ResourceRegistration"
api_surface: true
extends: "java.lang.Record"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T02:46:37Z"
tags:
  - "ecs"
  - "component"
---

**Package:** `com.hypixel.hytale.component`

```java
public record ResourceRegistration<ECS_TYPE, T extends Resource<ECS_TYPE>>(
    @Nonnull Class<? super T> typeClass,
    @Nullable String id,
    @Nullable BuilderCodec<T> codec,
    @Nonnull Supplier<T> supplier,
    @Nonnull ResourceType<ECS_TYPE, T> resourceType
)
```

Immutable record holding all metadata for a registered resource type.

## Record Components

- `typeClass` -- the registered resource class
- `id` -- the serialization ID (null for non-serialized resources)
- `codec` -- the serialization codec (null for non-serialized resources)
- `supplier` -- factory for creating default resource instances
- `resourceType` -- the [ResourceType](ResourceType.md) handle

## Related Types

- [ResourceType](ResourceType.md) -- the typed handle for accessing the resource
- [ComponentRegistration](ComponentRegistration.md) -- the equivalent record for components
