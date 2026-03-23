---
title: "BuilderObjectMapHelper"
kind: "class"
package: "com.hypixel.hytale.server.npc.asset.builder"
fqcn: "com.hypixel.hytale.server.npc.asset.builder.BuilderObjectMapHelper"
api_surface: false
extends: "BuilderObjectArrayHelper<Map<K, V>, V>"
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
public class BuilderObjectMapHelper<K, V> extends BuilderObjectArrayHelper<Map<K, V>, V>
```

Reads a JSON array of builder objects and produces a `Map<K, V>` at build time. Each element is built, and a key is extracted from the built value using a provided `Function<V, K>`. Throws if duplicate keys are encountered.

## Type Parameters

| Parameter | Description |
|---|---|
| `K` | The map key type. |
| `V` | The map value type (also the builder element type). |

## Constructor

```java
public BuilderObjectMapHelper(Class classType, Function<V, K> id, BuilderContext owner)
```

## Methods

### build

```java
@Nullable
public Map<K, V> build(@Nonnull BuilderSupport builderSupport)
```

Builds each non-excluded element, extracts a key via the `id` function, and inserts into an ordered map. Throws `IllegalArgumentException` on duplicate keys.

### testEach

```java
@Nullable
public <T, U> T testEach(@Nonnull BiFunction<Builder<V>, U, T> test, @Nonnull BuilderManager builderManager, ExecutionContext executionContext, U meta, T successResult, T emptyResult, Builder<?> parentSpawnable)
```

Iterates over elements, applying a test function to each resolved builder. Returns the first non-success result, or the success result if all pass.

## Related Types

- [BuilderObjectArrayHelper](BuilderObjectArrayHelper.md) -- parent class
