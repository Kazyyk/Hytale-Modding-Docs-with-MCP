---
title: "MemoryProvider"
kind: "abstract class"
package: "com.hypixel.hytale.builtin.adventure.memories.memories"
fqcn: "com.hypixel.hytale.builtin.adventure.memories.memories.MemoryProvider"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "adventure"
  - "memories"
  - "memories"
---

**Package:** `com.hypixel.hytale.builtin.adventure.memories.memories`

```java
public abstract class MemoryProvider<T extends Memory>
```

Abstract base type in the MemoryProvider hierarchy.

## Accessors

| Method | Returns | Description |
|---|---|---|
| `getId()` | `String` | Accessor method. |
| `getCodec()` | `BuilderCodec<T>` | Accessor method. |
| `getCollectionRadius()` | `double` | Accessor method. |
| `getAllMemories()` | `abstract Map<String, Set<Memory>>` | Accessor method. |
