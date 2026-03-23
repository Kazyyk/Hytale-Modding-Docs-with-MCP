---
title: "IResourceStorage"
kind: "interface"
package: "com.hypixel.hytale.component"
fqcn: "com.hypixel.hytale.component.IResourceStorage"
api_surface: true
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T02:46:37Z"
tags:
  - "ecs"
  - "component"
---

**Package:** `com.hypixel.hytale.component`

```java
public interface IResourceStorage
```

Interface for loading, saving, and removing per-store resources. Implementations provide the persistence backend for [Resource](Resource.md) instances. Each [Store](Store.md) is created with an IResourceStorage that handles resource lifecycle.

## Methods

```java
@Nonnull
<T extends Resource<ECS_TYPE>, ECS_TYPE> CompletableFuture<T> load(@Nonnull Store<ECS_TYPE> store, @Nonnull ComponentRegistry.Data<ECS_TYPE> data, @Nonnull ResourceType<ECS_TYPE, T> resourceType)
```

Loads a resource for the given store. Returns a completed future with a default instance if no persisted data exists.

```java
@Nonnull
<T extends Resource<ECS_TYPE>, ECS_TYPE> CompletableFuture<Void> save(@Nonnull Store<ECS_TYPE> store, @Nonnull ComponentRegistry.Data<ECS_TYPE> data, @Nonnull ResourceType<ECS_TYPE, T> resourceType, T resource)
```

Saves a resource to persistent storage.

```java
@Nonnull
<T extends Resource<ECS_TYPE>, ECS_TYPE> CompletableFuture<Void> remove(@Nonnull Store<ECS_TYPE> store, @Nonnull ComponentRegistry.Data<ECS_TYPE> data, @Nonnull ResourceType<ECS_TYPE, T> resourceType)
```

Removes a persisted resource.

## Related Types

- [EmptyResourceStorage](EmptyResourceStorage.md) -- no-op implementation
- [Resource](Resource.md) -- the interface for resource data
- [Store](Store.md) -- uses IResourceStorage for resource persistence
