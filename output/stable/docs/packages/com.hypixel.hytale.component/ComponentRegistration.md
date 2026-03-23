---
title: "ComponentRegistration"
kind: "record"
package: "com.hypixel.hytale.component"
fqcn: "com.hypixel.hytale.component.ComponentRegistration"
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
public record ComponentRegistration<ECS_TYPE, T extends Component<ECS_TYPE>>(
    @Nonnull Class<? super T> typeClass,
    @Nullable String id,
    @Nullable BuilderCodec<T> codec,
    @Nonnull Supplier<T> supplier,
    @Nonnull ComponentType<ECS_TYPE, T> componentType
)
```

Immutable record holding all metadata for a registered component type. Created internally by [ComponentRegistry](ComponentRegistry.md) during registration.

## Record Components

- `typeClass` -- the registered component class
- `id` -- the serialization ID (null for non-serialized components)
- `codec` -- the serialization codec (null for non-serialized components)
- `supplier` -- factory for creating default component instances
- `componentType` -- the [ComponentType](ComponentType.md) handle

## Related Types

- [ComponentType](ComponentType.md) -- the typed handle for accessing the component
- [ResourceRegistration](ResourceRegistration.md) -- the equivalent record for resources
