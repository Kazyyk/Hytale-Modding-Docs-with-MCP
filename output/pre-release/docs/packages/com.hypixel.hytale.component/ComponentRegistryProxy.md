---
title: "ComponentRegistryProxy"
kind: "class"
package: "com.hypixel.hytale.component"
fqcn: "com.hypixel.hytale.component.ComponentRegistryProxy"
api_surface: true
extends: "java.lang.Object"
implements:
  - "IComponentRegistry<ECS_TYPE>"
generator_version: "2.0.0"
generated_at: "2026-03-21T02:46:37Z"
tags:
  - "ecs"
  - "component"
---

**Package:** `com.hypixel.hytale.component`

```java
public class ComponentRegistryProxy<ECS_TYPE> implements IComponentRegistry<ECS_TYPE>
```

A plugin-scoped proxy around [ComponentRegistry](ComponentRegistry.md). All registrations made through a proxy are tracked, and when the owning plugin shuts down (without a full server shutdown), those registrations are automatically unregistered. This prevents plugins from leaking component types, resources, systems, and event types.

Plugins obtain a proxy via `JavaPlugin.getEntityStoreRegistry()` and `JavaPlugin.getChunkStoreRegistry()`.

## Type Parameters

- `ECS_TYPE` -- the store type parameter

## Constructor

```java
public ComponentRegistryProxy(List<BooleanConsumer> registrations, ComponentRegistry<ECS_TYPE> registry)
```

## Methods

All methods from [IComponentRegistry](IComponentRegistry.md) are delegated to the underlying registry, with unregistration callbacks recorded in the `registrations` list.

```java
@Deprecated(forRemoval = true)
@Nonnull
public <T extends Component<ECS_TYPE>> ComponentType<ECS_TYPE, T> registerComponent(@Nonnull Class<? super T> tClass, @Nonnull String id, @Nonnull BuilderCodec<T> codec, boolean skipValidation)
```

Deprecated variant that allows skipping codec validation.

```java
@Deprecated(forRemoval = true)
public void registerSystem(@Nonnull ISystem<ECS_TYPE> system, boolean bypassClassCheck)
```

Deprecated variant that bypasses the one-system-per-class uniqueness check.

## Related Types

- [IComponentRegistry](IComponentRegistry.md) -- the interface this proxy implements
- [ComponentRegistry](ComponentRegistry.md) -- the concrete registry being proxied
