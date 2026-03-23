---
title: "ItemContainerSystems.OnReplacedHolder"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.block.system"
fqcn: "com.hypixel.hytale.server.core.modules.block.system.ItemContainerSystems.OnReplacedHolder"
api_surface: false
extends: "EntityHolderEventSystem<ChunkStore, BlockReplaceEvent>"
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
public static class ItemContainerSystems.OnReplacedHolder extends EntityHolderEventSystem<ChunkStore, BlockReplaceEvent>
```

Handles `BlockReplaceEvent` for block entity holders (not yet added to the store). Moves all items from the old holder's item container to the new entity's item container.

## Relationships

- Inner class of [ItemContainerSystems](ItemContainerSystems.md)
- Operates on [ItemContainerBlock](../com.hypixel.hytale.server.core.modules.block.components/ItemContainerBlock.md)
