---
title: "Resource"
kind: "interface"
package: "com.hypixel.hytale.component"
fqcn: "com.hypixel.hytale.component.Resource"
api_surface: true
extends: "Cloneable"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T02:46:37Z"
tags:
  - "ecs"
  - "component"
---

**Package:** `com.hypixel.hytale.component`

```java
public interface Resource<ECS_TYPE> extends Cloneable
```

The root interface for all ECS resources. Resources are per-[Store](Store.md) singleton data -- unlike [Component](Component.md) which is per-entity, a resource exists once per store and is shared by all systems. Resources are registered via [IComponentRegistry.registerResource()](IComponentRegistry.md) and accessed via [ResourceType](ResourceType.md) handles.

Resources are loaded and saved through [IResourceStorage](IResourceStorage.md), enabling persistent store-level data.

## Type Parameters

- `ECS_TYPE` -- the store type parameter

## Fields

```java
Resource[] EMPTY_ARRAY = new Resource[0];
```

Shared empty array constant.

## Methods

```java
@Nullable
Resource<ECS_TYPE> clone();
```

Creates a deep copy of this resource. Returns `null` if the resource cannot be cloned.

## Related Types

- [ResourceType](ResourceType.md) -- typed handle for registering and accessing resources
- [ResourceRegistration](ResourceRegistration.md) -- registration record for a resource
- [IResourceStorage](IResourceStorage.md) -- persistence interface for loading/saving resources
- [Component](Component.md) -- the per-entity equivalent
- [Store](Store.md) -- holds resource instances and provides access via `getResource()`
