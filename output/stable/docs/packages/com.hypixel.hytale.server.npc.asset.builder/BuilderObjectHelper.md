---
title: "BuilderObjectHelper"
kind: "abstract class"
package: "com.hypixel.hytale.server.npc.asset.builder"
fqcn: "com.hypixel.hytale.server.npc.asset.builder.BuilderObjectHelper"
api_surface: false
extends: ~
implements:
  - "BuilderContext"
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "npc"
  - "asset"
  - "builder"
---

**Package:** `com.hypixel.hytale.server.npc.asset.builder`

```java
public abstract class BuilderObjectHelper<T> implements BuilderContext
```

Abstract base for helper classes that read a JSON element and produce a typed runtime object. Implements [BuilderContext](BuilderContext.md) for breadcrumb navigation. Concrete subclasses include [BuilderObjectReferenceHelper](BuilderObjectReferenceHelper.md) (single object) and [BuilderObjectArrayHelper](BuilderObjectArrayHelper.md) (arrays).

## Type Parameters

| Parameter | Description |
|---|---|
| `T` | The runtime type produced by `build()`. |

## Fields

| Field | Type | Description |
|---|---|---|
| `classType` | `Class<?>` | The expected class type. |
| `builderParameters` | [BuilderParameters](BuilderParameters.md) | Parameters set during `readConfig`. |
| `owner` | [BuilderContext](BuilderContext.md) | The parent context. |

## Constructor

```java
protected BuilderObjectHelper(Class<?> classType, BuilderContext owner)
```

## Abstract Methods

```java
@Nullable
public abstract T build(BuilderSupport var1);
public abstract boolean validate(String var1, NPCLoadTimeValidationHelper var2, BuilderManager var3, ExecutionContext var4, Scope var5, List<String> var6);
public abstract boolean isPresent();
```

## Methods

### getOwner

```java
@Override
public BuilderContext getOwner()
```

### getClassType

```java
public final Class<?> getClassType()
```

### readConfig

```java
public void readConfig(JsonElement data, BuilderManager builderManager, BuilderParameters builderParameters, BuilderValidationHelper builderValidationHelper)
```

Stores the builder parameters. Subclasses override to perform actual reading.

## Related Types

- [BuilderContext](BuilderContext.md) -- implemented interface
- [BuilderObjectReferenceHelper](BuilderObjectReferenceHelper.md) -- single object subclass
- [BuilderObjectArrayHelper](BuilderObjectArrayHelper.md) -- array subclass
