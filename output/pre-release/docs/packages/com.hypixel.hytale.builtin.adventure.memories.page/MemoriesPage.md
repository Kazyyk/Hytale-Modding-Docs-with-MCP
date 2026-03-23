---
title: "MemoriesPage"
kind: "class"
package: "com.hypixel.hytale.builtin.adventure.memories.page"
fqcn: "com.hypixel.hytale.builtin.adventure.memories.page.MemoriesPage"
api_surface: false
extends: "InteractiveCustomUIPage<MemoriesPage.PageEventData>"
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
public class MemoriesPage extends InteractiveCustomUIPage<MemoriesPage.PageEventData>
```

Custom UI page for the memories collection system. Displays a category-based memories browser where players can view discovered and undiscovered memories organized by category, track overall progress via a progress bar, record newly gathered memories, and view individual memory details.

When no category is selected, builds the category panel showing all memory categories with progress counts and unlock indicators. When a category is selected, displays the memory grid for that category with selection support and a detail panel for the selected memory.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private` | `String` | `currentCategory` |
| `private` | `Memory` | `selectedMemory` |
| `private final` | `Vector3d` | `recordMemoriesParticlesPosition` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `MemoriesPage(@Nonnull PlayerRef playerRef, @Nonnull BlockPosition blockPosition)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `void` | `build(@Nonnull Ref<EntityStore> ref, @Nonnull UICommandBuilder commandBuilder, @Nonnull UIEventBuilder eventBuilder, @Nonnull Store<EntityStore> store)` |
| `private static` | `void` | `buildChestMarkers(@Nonnull UICommandBuilder commandBuilder, @Nonnull GameplayConfig gameplayConfig, int totalMemories)` |
| `public` | `void` | `handleDataEvent(@Nonnull Ref<EntityStore> ref, @Nonnull Store<EntityStore> store, @Nonnull MemoriesPage.PageEventData data)` |
| `private static` | `void` | `updateMemoryButtonSelection(@Nonnull UICommandBuilder commandBuilder, int index, @Nonnull Memory memory, boolean isSelected)` |
| `private static` | `void` | `updateMemoryDetailsPanel(@Nonnull UICommandBuilder commandBuilder, @Nonnull Memory memory)` |

## Inner Types

- [MemoriesPage.PageAction](MemoriesPage.PageAction.md) -- enum of UI actions (Record, ViewCategory, Back, MemoriesInfo, SelectMemory)
- [MemoriesPage.PageEventData](MemoriesPage.PageEventData.md) -- codec-backed event data carrying action, category, and memory ID
