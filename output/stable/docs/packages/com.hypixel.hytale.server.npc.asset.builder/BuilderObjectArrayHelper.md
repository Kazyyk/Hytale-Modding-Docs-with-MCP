---
title: "BuilderObjectArrayHelper"
kind: "abstract class"
package: "com.hypixel.hytale.server.npc.asset.builder"
fqcn: "com.hypixel.hytale.server.npc.asset.builder.BuilderObjectArrayHelper"
api_surface: false
extends: "BuilderObjectHelper<T>"
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
public abstract class BuilderObjectArrayHelper<T, U> extends BuilderObjectHelper<T>
```

Abstract base for helpers that read a JSON array of builder objects. Each array element is read into a [BuilderObjectReferenceHelper](BuilderObjectReferenceHelper.md). Concrete subclasses ([BuilderObjectListHelper](BuilderObjectListHelper.md), [BuilderObjectMapHelper](BuilderObjectMapHelper.md)) define how the array elements are assembled into the final collection.

## Type Parameters

| Parameter | Description |
|---|---|
| `T` | The collection type produced by `build()`. |
| `U` | The element type produced by each array entry's builder. |

## Fields

| Field | Type | Description |
|---|---|---|
| `builders` | `BuilderObjectReferenceHelper[]` | Array of reference helpers, one per JSON array element. |
| `label` | `String` | Label for breadcrumb reporting. |

## Methods

### readConfig

```java
@Override
public void readConfig(@Nonnull JsonElement data, @Nonnull BuilderManager builderManager, @Nonnull BuilderParameters builderParameters, @Nonnull BuilderValidationHelper builderValidationHelper)
```

Reads a JSON array, creating a [BuilderObjectReferenceHelper](BuilderObjectReferenceHelper.md) for each element. Throws if the element is not an array.

### validate

```java
@Override
public boolean validate(String configName, NPCLoadTimeValidationHelper loadTimeValidationHelper, @Nonnull BuilderManager manager, @Nonnull ExecutionContext context, Scope globalScope, @Nonnull List<String> errors)
```

Validates each element that is not excluded from regular build.

### isPresent / isEmpty / hasNoElements

```java
@Override
public boolean isPresent()
public boolean isEmpty()
public boolean hasNoElements()
```

### createReferenceHelper

```java
@Nonnull
protected BuilderObjectReferenceHelper<U> createReferenceHelper()
```

Creates a new reference helper. Overridable by subclasses (e.g., [BuilderObjectStaticListHelper](BuilderObjectStaticListHelper.md)).

## Related Types

- [BuilderObjectHelper](BuilderObjectHelper.md) -- parent class
- [BuilderObjectListHelper](BuilderObjectListHelper.md) -- produces a `List<T>`
- [BuilderObjectMapHelper](BuilderObjectMapHelper.md) -- produces a `Map<K, V>`
- [BuilderObjectReferenceHelper](BuilderObjectReferenceHelper.md) -- each array element
