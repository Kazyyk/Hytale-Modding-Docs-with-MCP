---
title: "PlayerMemories"
kind: "class"
package: "com.hypixel.hytale.builtin.adventure.memories.component"
fqcn: "com.hypixel.hytale.builtin.adventure.memories.component.PlayerMemories"
api_surface: false
extends: ~
implements: ['Component']
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "adventure"
  - "memories"
  - "component"
---

**Package:** `com.hypixel.hytale.builtin.adventure.memories.component`

```java
public class PlayerMemories implements Component<EntityStore>
```

ECS component stored in `EntityStore`. Serialized via `BuilderCodec`.

## Accessors

| Method | Returns | Description |
|---|---|---|
| `getComponentType()` | `ComponentType<EntityStore, PlayerMemories>` | Accessor method. |
| `getMemoriesCapacity()` | `int` | Accessor method. |
| `setMemoriesCapacity(int memoriesCapacity)` | `void` | Mutator method. |
| `hasMemories()` | `boolean` | Boolean accessor. |
| `getRecordedMemories()` | `Set<Memory>` | Accessor method. |

## Methods

| Method | Returns | Description |
|---|---|---|
| `recordMemory(Memory memory)` | `boolean` | Instance method. |
| `takeMemories(Set<Memory> outMemories)` | `boolean` | Instance method. |
