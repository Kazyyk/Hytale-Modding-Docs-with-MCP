---
title: "NPCMemoryProvider"
kind: "class"
package: "com.hypixel.hytale.builtin.adventure.memories.memories.npc"
fqcn: "com.hypixel.hytale.builtin.adventure.memories.memories.npc.NPCMemoryProvider"
api_surface: false
extends: "MemoryProvider"
implements:
  []
generator_version: "2.0.0"
generated_at: "2026-03-21T06:16:36Z"
tags:
  - "builtin"
  - "npc"
---
**Package:** `com.hypixel.hytale.builtin.adventure.memories.memories.npc`

```java
public class NPCMemoryProvider extends MemoryProvider<NPCMemory>
```

## Constants

| Modifier | Type | Name | Value |
|---|---|---|---|
| `public static final` | `double` | `DEFAULT_RADIUS` | `10.0` |

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `double` | `DEFAULT_RADIUS` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `` | `NPCMemoryProvider()` |
| `public` | `Map<String, Set<Memory>>` | `getAllMemories()` |
| `private static` | `String` | `getCategory(@Nonnull Builder<?> builder)` |
| `private static` | `boolean` | `isMemory(@Nonnull Builder<?> builder)` |
| `private static` | `String` | `getMemoriesNameOverride(@Nonnull Builder<?> builder)` |
| `private static` | `String` | `getNPCNameTranslationKey(@Nonnull Builder<?> builder)` |
