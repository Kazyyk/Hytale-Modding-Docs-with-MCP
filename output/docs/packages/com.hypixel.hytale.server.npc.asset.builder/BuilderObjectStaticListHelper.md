---
title: "BuilderObjectStaticListHelper"
kind: "class"
package: "com.hypixel.hytale.server.npc.asset.builder"
fqcn: "com.hypixel.hytale.server.npc.asset.builder.BuilderObjectStaticListHelper"
api_surface: false
extends: "BuilderObjectListHelper<T>"
implements: ~
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "npc"
  - "asset"
  - "builder"
---

**Package:** `com.hypixel.hytale.server.npc.asset.builder`

```java
public class BuilderObjectStaticListHelper<T> extends BuilderObjectListHelper<T>
```

A list helper variant that uses [BuilderObjectStaticHelper](BuilderObjectStaticHelper.md) for each element, enforcing that all elements are inline (no references). Provides a `staticBuild` method that builds without entity context.

## Methods

### createReferenceHelper

```java
@Nonnull
@Override
protected BuilderObjectReferenceHelper<T> createReferenceHelper()
```

Returns a new [BuilderObjectStaticHelper](BuilderObjectStaticHelper.md).

### staticBuild

```java
@Nullable
public List<T> staticBuild(@Nonnull BuilderManager manager)
```

Builds all elements using `BuilderObjectStaticHelper.staticBuild()`.

## Related Types

- [BuilderObjectListHelper](BuilderObjectListHelper.md) -- parent class
- [BuilderObjectStaticHelper](BuilderObjectStaticHelper.md) -- per-element helper
