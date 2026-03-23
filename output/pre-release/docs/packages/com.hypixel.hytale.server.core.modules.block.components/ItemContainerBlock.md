---
title: "ItemContainerBlock"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.block.components"
fqcn: "com.hypixel.hytale.server.core.modules.block.components.ItemContainerBlock"
api_surface: false
extends: null
implements:
  - "Component<ChunkStore>"
generator_version: "2.0.0"
generated_at: "2026-03-22T21:20:59Z"
tags:
  - "block"
  - "component"
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.modules.block.components`

```java
public class ItemContainerBlock implements Component<ChunkStore>
```

Component attached to block entities that contain an item container (e.g., chests, barrels). Stores the `SimpleItemContainer`, its capacity, an optional droplist reference, and a map of currently open `ContainerBlockWindow` instances keyed by player UUID.

## Static Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `BuilderCodec<ItemContainerBlock>` | `CODEC` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public static` | `ComponentType<ChunkStore, ItemContainerBlock>` | `getComponentType()` |
| `public` | `SimpleItemContainer` | `getItemContainer()` |
| `public` | `void` | `setItemContainer(SimpleItemContainer itemContainer)` |
| `public` | `String` | `getDroplist()` |
| `public` | `void` | `setDroplist(String droplist)` |
| `public` | `Map<UUID, ContainerBlockWindow>` | `getWindows()` |
| `public` | `short` | `getCapacity()` |
| `public` | `Component<ChunkStore>` | `clone()` |

## Relationships

- Implements `Component<ChunkStore>`
- Managed by [BlockModule](../com.hypixel.hytale.server.core.modules.block/BlockModule.md)
- Systems: `ItemContainerSystems.OnAddedOrRemoved`, `ItemContainerSystems.OnReplaced`
