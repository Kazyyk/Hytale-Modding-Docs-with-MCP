---
title: "MemoriesPlugin"
kind: "class"
package: "com.hypixel.hytale.builtin.adventure.memories"
fqcn: "com.hypixel.hytale.builtin.adventure.memories.MemoriesPlugin"
api_surface: false
extends: "JavaPlugin"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "memories"
  - "plugin"
  - "builtin"
---

**Package:** `com.hypixel.hytale.builtin.adventure.memories`

```java
public class MemoriesPlugin extends JavaPlugin
```

Main plugin for the memories collection system. Manages memory providers, recorded memories persistence, player memory components, and plugin lifecycle. On setup, registers custom UI page suppliers for `MemoriesPage` and `MemoriesUnlockedPage`, the `PlayerMemories` entity component, NPC memory gathering system, codec types for `Memory`, gameplay config codecs, and interaction codecs for `SetMemoriesCapacity` and `MemoriesCondition`.

Persists recorded memories to `memories.json` in the universe directory using thread-safe read/write locks.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `String` | `MEMORIES_JSON_PATH` |
| `private static` | `MemoriesPlugin` | `instance` |
| `private final` | `Config<MemoriesPlugin.MemoriesPluginConfig>` | `config` |
| `private final` | `List<MemoryProvider<?>>` | `providers` |
| `private final` | `Map<String, Set<Memory>>` | `allMemories` |
| `private` | `ComponentType<EntityStore, PlayerMemories>` | `playerMemoriesComponentType` |
| `private` | `MemoriesPlugin.RecordedMemories` | `recordedMemories` |
| `private` | `boolean` | `hasInitializedMemories` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public static` | `MemoriesPlugin` | `get()` |
| `public` | | `MemoriesPlugin(@Nonnull JavaPluginInit init)` |
| `protected` | `void` | `setup()` |
| `protected` | `void` | `start()` |
| `protected` | `void` | `shutdown()` |
| `public` | `MemoriesPlugin.MemoriesPluginConfig` | `getConfig()` |
| `public` | `ComponentType<EntityStore, PlayerMemories>` | `getPlayerMemoriesComponentType()` |
| `public` | `void` | `registerMemoryProvider(MemoryProvider<T> memoryProvider)` |
| `public` | `Map<String, Set<Memory>>` | `getAllMemories()` |
| `public` | `int` | `getMemoriesLevel(@Nonnull GameplayConfig gameplayConfig)` |
| `public` | `boolean` | `hasRecordedMemory(Memory memory)` |
| `public` | `boolean` | `recordPlayerMemories(@Nonnull PlayerMemories playerMemories)` |
| `public` | `Set<Memory>` | `getRecordedMemories()` |
| `public` | `void` | `clearRecordedMemories()` |
| `public` | `void` | `recordAllMemories()` |
| `public` | `int` | `setRecordedMemoriesCount(int count)` |

## Inner Types

- [MemoriesPlugin.MemoriesPluginConfig](MemoriesPlugin.MemoriesPluginConfig.md) -- codec config holding collection radius map
- [MemoriesPlugin.PlayerAddedSystem](MemoriesPlugin.PlayerAddedSystem.md) -- ECS system sending memories feature status on player add
