---
title: "BuilderObjectListHelper"
kind: "class"
package: "com.hypixel.hytale.server.npc.asset.builder"
fqcn: "com.hypixel.hytale.server.npc.asset.builder.BuilderObjectListHelper"
api_surface: false
extends: "BuilderObjectArrayHelper<List<T>, T>"
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
public class BuilderObjectListHelper<T> extends BuilderObjectArrayHelper<List<T>, T>
```

Reads a JSON array of builder objects and produces a `List<T>` at build time. Each element that is not excluded from regular build and does not build to `null` is included in the result list.

## Type Parameters

| Parameter | Description |
|---|---|
| `T` | The element type. |

## Constructor

```java
public BuilderObjectListHelper(Class<?> classType, BuilderContext owner)
```

## Methods

### build

```java
@Nullable
public List<T> build(@Nonnull BuilderSupport builderSupport)
```

Returns `null` if the array has no elements. Otherwise builds each non-excluded element and collects non-null results into a list.

## Related Types

- [BuilderObjectArrayHelper](BuilderObjectArrayHelper.md) -- parent class
- [BuilderObjectStaticListHelper](BuilderObjectStaticListHelper.md) -- variant for static builds
