---
title: "ItemContainerSystems.OnAddedOrRemoved"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.block.system"
fqcn: "com.hypixel.hytale.server.core.modules.block.system.ItemContainerSystems.OnAddedOrRemoved"
api_surface: false
extends: "RefSystem<ChunkStore>"
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
public static class ItemContainerSystems.OnAddedOrRemoved extends RefSystem<ChunkStore>
```

Handles block entity add and remove lifecycle. On add: adjusts item container capacity to match the block type config, registers change events for save tracking, and drops overflow items as item entities. On remove (not unload): closes all windows, drops all items as item entities.

## Relationships

- Inner class of [ItemContainerSystems](ItemContainerSystems.md)
- Operates on [ItemContainerBlock](../com.hypixel.hytale.server.core.modules.block.components/ItemContainerBlock.md)
