---
title: "MemoriesWindow"
kind: "class"
package: "com.hypixel.hytale.builtin.adventure.memories.window"
fqcn: "com.hypixel.hytale.builtin.adventure.memories.window.MemoriesWindow"
api_surface: false
extends: "Window"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "builtin"
  - "adventure"
  - "memories"
  - "window"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.adventure.memories.window`

```java
public class MemoriesWindow extends Window
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `JsonObject` | `windowData` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull @Override public` | `JsonObject` | `getData()` |
| `@Override public` | `boolean` | `onOpen0(Ref<EntityStore> ref, Store<EntityStore> store)` |
| `@Nullable private static` | `String` | `GetCategoryIconPathForMemory(Memory memory)` |
| `@Override public` | `void` | `onClose0(Ref<EntityStore> ref, ComponentAccessor<EntityStore> componentAccessor)` |
