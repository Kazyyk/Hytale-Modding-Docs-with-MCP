---
title: "ResourceType"
kind: "class"
package: "com.hypixel.hytale.component"
fqcn: "com.hypixel.hytale.component.ResourceType"
api_surface: true
extends: "java.lang.Object"
implements:
  - "Comparable<ResourceType<ECS_TYPE, ?>>"
generator_version: "2.0.0"
generated_at: "2026-03-21T02:46:37Z"
tags:
  - "ecs"
  - "component"
---

**Package:** `com.hypixel.hytale.component`

```java
public class ResourceType<ECS_TYPE, T extends Resource<ECS_TYPE>> implements Comparable<ResourceType<ECS_TYPE, ?>>
```

A typed handle representing a registered resource in the ECS. Obtained from [IComponentRegistry.registerResource()](IComponentRegistry.md). Used to access per-store singleton data via `Store.getResource()`.

## Type Parameters

- `ECS_TYPE` -- the store type parameter
- `T` -- the concrete resource class

## Fields

```java
@Nonnull
public static final ResourceType[] EMPTY_ARRAY = new ResourceType[0];
```

## Methods

```java
@Nonnull
public ComponentRegistry<ECS_TYPE> getRegistry()
```

```java
@Nonnull
public Class<? super T> getTypeClass()
```

```java
public int getIndex()
```

```java
public void validateRegistry(@Nonnull ComponentRegistry<ECS_TYPE> registry)
```

```java
public void validate()
```

## Related Types

- [Resource](Resource.md) -- the interface all resources implement
- [ResourceRegistration](ResourceRegistration.md) -- the full registration record
- [Store](Store.md) -- uses ResourceType to access resources
- [IResourceStorage](IResourceStorage.md) -- loads and saves resources by type
