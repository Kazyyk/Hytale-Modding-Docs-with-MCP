---
title: "NStage"
kind: "interface"
package: "com.hypixel.hytale.builtin.hytalegenerator.newsystem.stages"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.newsystem.stages.NStage"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "worldgen"
  - "pipeline"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator.newsystem.stages`

```java
public interface NStage
```

Contract for all generation pipeline stages. Each stage declares its input buffer types with spatial bounds, output buffer types, a human-readable name, and a `run` method that executes on a worker thread with access to typed buffer views.

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `void` | | `run(@Nonnull NStage.Context var1)` |
| `@Nonnull` | `Map<NBufferType, Bounds3i>` | `getInputTypesAndBounds_bufferGrid()` |
| `@Nonnull` | `List<NBufferType>` | `getOutputTypes()` |
| `@Nonnull` | `String` | `getName()` |

## Inner Types

### Context

```java
public static final class Context
```

| Modifier | Type | Name |
|---|---|---|
| `@Nonnull public` | `Map<NBufferType, NBufferBundle.Access.View>` | `bufferAccess` |
| `@Nonnull public` | `WorkerIndexer.Id` | `workerId` |

```java
public Context(@Nonnull Map<NBufferType, NBufferBundle.Access.View> bufferAccess, @Nonnull WorkerIndexer.Id workerId)
```
