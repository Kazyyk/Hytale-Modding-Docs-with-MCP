---
title: "ItemContainerSystems"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.block.system"
fqcn: "com.hypixel.hytale.server.core.modules.block.system.ItemContainerSystems"
api_surface: false
extends: null
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
public class ItemContainerSystems
```

Container for ECS systems managing `ItemContainerBlock` lifecycle events. Handles capacity adjustment and change event registration on add, item dropping on remove, and item migration when block entities are replaced.

## Inner Classes

| Class | Extends | Description |
|---|---|---|
| [ItemContainerSystems.OnAddedOrRemoved](ItemContainerSystems.OnAddedOrRemoved.md) | `RefSystem<ChunkStore>` | Adjusts capacity and drops items on add/remove |
| [ItemContainerSystems.OnReplaced](ItemContainerSystems.OnReplaced.md) | `EntityEventSystem<ChunkStore, BlockReplaceEvent>` | Migrates items from old to new block entity |
| [ItemContainerSystems.OnReplacedHolder](ItemContainerSystems.OnReplacedHolder.md) | `EntityHolderEventSystem<ChunkStore, BlockReplaceEvent>` | Migrates items from old holder to new block entity |
