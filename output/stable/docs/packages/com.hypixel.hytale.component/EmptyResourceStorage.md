---
title: "EmptyResourceStorage"
kind: "class"
package: "com.hypixel.hytale.component"
fqcn: "com.hypixel.hytale.component.EmptyResourceStorage"
api_surface: false
extends: "java.lang.Object"
implements:
  - "IResourceStorage"
generator_version: "2.0.0"
generated_at: "2026-03-21T02:46:37Z"
tags:
  - "ecs"
  - "component"
---

**Package:** `com.hypixel.hytale.component`

```java
public class EmptyResourceStorage implements IResourceStorage
```

A no-op implementation of [IResourceStorage](IResourceStorage.md). `load()` creates a default resource instance, `save()` and `remove()` are no-ops. Used for stores that do not require resource persistence. Singleton via `get()`.

## Methods

```java
public static EmptyResourceStorage get()
```

Returns the singleton instance.

## Related Types

- [IResourceStorage](IResourceStorage.md) -- the interface this implements
