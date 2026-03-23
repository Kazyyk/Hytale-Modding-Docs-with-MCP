---
title: "MemoriesUnlockedPage"
kind: "class"
package: "com.hypixel.hytale.builtin.adventure.memories.page"
fqcn: "com.hypixel.hytale.builtin.adventure.memories.page.MemoriesUnlockedPage"
api_surface: false
extends: "InteractiveCustomUIPage<MemoriesUnlockedPage.PageEventData>"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "memories"
  - "ui"
  - "page"
---

**Package:** `com.hypixel.hytale.builtin.adventure.memories.page`

```java
public class MemoriesUnlockedPage extends InteractiveCustomUIPage<MemoriesUnlockedPage.PageEventData>
```

An informational UI page shown when accessing the memories system. Displays the `Pages/Memories/MemoriesUnlocked.ui` template and provides a button to navigate to the main [MemoriesPage](MemoriesPage.md).

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `BlockPosition` | `blockPosition` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `MemoriesUnlockedPage(@Nonnull PlayerRef playerRef, BlockPosition blockPosition)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `void` | `build(@Nonnull Ref<EntityStore> ref, @Nonnull UICommandBuilder commandBuilder, @Nonnull UIEventBuilder eventBuilder, @Nonnull Store<EntityStore> store)` |
| `public` | `void` | `handleDataEvent(@Nonnull Ref<EntityStore> ref, @Nonnull Store<EntityStore> store, @Nonnull MemoriesUnlockedPage.PageEventData data)` |

## Inner Types

- [MemoriesUnlockedPage.PageAction](MemoriesUnlockedPage.PageAction.md) -- enum with a single `DiscoverMemories` action
- [MemoriesUnlockedPage.PageEventData](MemoriesUnlockedPage.PageEventData.md) -- codec-backed event data carrying the action
