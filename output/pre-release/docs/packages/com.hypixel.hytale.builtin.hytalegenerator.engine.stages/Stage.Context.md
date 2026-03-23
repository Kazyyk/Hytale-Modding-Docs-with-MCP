---
title: "Stage.Context"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.engine.stages"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.engine.stages.Stage.Context"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-22T12:00:00Z"
tags:
  - "builtin"
  - "hytalegenerator"
  - "engine"
  - "stages"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator.engine.stages`

```java
public static final class Stage.Context
```

Execution context passed to `Stage.run`. Provides a map of `BufferType` to `BufferBundle.Access.View` for reading inputs and writing outputs, and a `WorkerIndexer.Id` identifying the current worker thread.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `@Nonnull public` | `Map<BufferType, BufferBundle.Access.View>` | `bufferAccess` |
| `@Nonnull public` | `WorkerIndexer.Id` | `workerId` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `Context(@Nonnull Map<BufferType, BufferBundle.Access.View> bufferAccess, @Nonnull WorkerIndexer.Id workerId)` |
