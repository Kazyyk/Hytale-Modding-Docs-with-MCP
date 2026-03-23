---
title: "System"
kind: "class"
package: "com.hypixel.hytale.component.system"
fqcn: "com.hypixel.hytale.component.system.System"
api_surface: true
extends: ~
implements: ["ISystem<ECS_TYPE>"]
generator_version: "2.0.0"
generated_at: "2026-03-21T18:30:00Z"
tags:
  - "component"
  - "system"
  - "class"
---

**Package:** `com.hypixel.hytale.component.system`

```java
public abstract class System<ECS_TYPE> implements ISystem<ECS_TYPE>
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `@Nonnull private final` | `ObjectList<ComponentRegistration<ECS_TYPE, ?>>` | `componentRegistrations` |
| `@Nonnull private final` | `ObjectList<ResourceRegistration<ECS_TYPE, ?>>` | `resourceRegistrations` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull protected` | `<T extends Component<ECS_TYPE>> ComponentType<ECS_TYPE, T>` | `registerComponent(@Nonnull Class<? super T> tClass, @Nonnull Supplier<T> supplier)` |
| `@Nonnull protected` | `<T extends Component<ECS_TYPE>> ComponentType<ECS_TYPE, T>` | `registerComponent(@Nonnull Class<? super T> tClass, @Nonnull String id, @Nonnull BuilderCodec<T> codec)` |
| `@Nonnull protected` | `<T extends Component<ECS_TYPE>> ComponentType<ECS_TYPE, T>` | `registerComponent(@Nonnull Class<? super T> tClass, @Nullable String id, @Nullable BuilderCodec<T> codec, @Nonnull Supplier<T> supplier)` |
| `@Nonnull public` | `<T extends Resource<ECS_TYPE>> ResourceType<ECS_TYPE, T>` | `registerResource(@Nonnull Class<? super T> tClass, @Nonnull Supplier<T> supplier)` |
| `@Nonnull public` | `<T extends Resource<ECS_TYPE>> ResourceType<ECS_TYPE, T>` | `registerResource(@Nonnull Class<? super T> tClass, @Nonnull String id, @Nonnull BuilderCodec<T> codec)` |
| `@Nonnull private` | `<T extends Resource<ECS_TYPE>> ResourceType<ECS_TYPE, T>` | `registerResource(@Nonnull Class<? super T> tClass, @Nullable String id, @Nullable BuilderCodec<T> codec, @Nonnull Supplier<T> supplier)` |
| `@Nonnull public` | `List<ComponentRegistration<ECS_TYPE, ?>>` | `getComponentRegistrations()` |
| `@Nonnull public` | `List<ResourceRegistration<ECS_TYPE, ?>>` | `getResourceRegistrations()` |
