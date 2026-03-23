---
title: "ItemContainerSystems.OnReplaced"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.block.system"
fqcn: "com.hypixel.hytale.server.core.modules.block.system.ItemContainerSystems.OnReplaced"
api_surface: false
extends: "EntityEventSystem<ChunkStore, BlockReplaceEvent>"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-22T21:20:59Z"
tags:
  - "block"
  - "system"
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.modules.block.system`

```java
public static class ItemContainerSystems.OnReplaced extends EntityEventSystem<ChunkStore, BlockReplaceEvent>
```

Handles `BlockReplaceEvent` for existing block entity refs. Moves all items from the old entity's item container to the new entity's item container.

## Relationships

- Inner class of [ItemContainerSystems](ItemContainerSystems.md)
- Operates on [ItemContainerBlock](../com.hypixel.hytale.server.core.modules.block.components/ItemContainerBlock.md)
