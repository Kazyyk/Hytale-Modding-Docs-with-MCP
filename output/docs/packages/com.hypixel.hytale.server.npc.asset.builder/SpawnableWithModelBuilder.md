---
title: "SpawnableWithModelBuilder"
kind: "abstract class"
package: "com.hypixel.hytale.server.npc.asset.builder"
fqcn: "com.hypixel.hytale.server.npc.asset.builder.SpawnableWithModelBuilder"
api_surface: false
extends: "BuilderBase<T>"
implements:
  - "ISpawnableWithModel"
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "npc"
  - "asset"
  - "builder"
---

**Package:** `com.hypixel.hytale.server.npc.asset.builder`

```java
public abstract class SpawnableWithModelBuilder<T> extends BuilderBase<T> implements ISpawnableWithModel
```

An abstract builder base for NPC types that can be spawned with a model (primarily role builders). Extends [BuilderBase](BuilderBase.md) with dynamic dependency tracking -- dependencies discovered at build time rather than at read time. Also marks the builder as spawnable.

## Type Parameters

| Parameter | Description |
|---|---|
| `T` | The runtime type this builder produces. |

## Methods

### hasDynamicDependencies

```java
@Override
public boolean hasDynamicDependencies()
```

Returns `true` if dynamic dependencies have been recorded.

### addDynamicDependency

```java
@Override
public void addDynamicDependency(int builderIndex)
```

Adds a builder index to the dynamic dependency set, creating it if needed.

### getDynamicDependencies

```java
@Override
public IntSet getDynamicDependencies()
```

Returns the dynamic dependency set, or `null` if none exist.

### clearDynamicDependencies

```java
@Override
public void clearDynamicDependencies()
```

Clears the dynamic dependency set.

### isSpawnable

```java
@Override
public boolean isSpawnable()
```

Returns `true`.

## Related Types

- [BuilderBase](BuilderBase.md) -- parent class
- [Builder](Builder.md) -- dynamic dependency default methods are overridden here
