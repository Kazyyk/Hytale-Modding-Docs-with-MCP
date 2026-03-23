---
title: "RoleUtils"
kind: "class"
package: "com.hypixel.hytale.server.npc.role"
fqcn: "com.hypixel.hytale.server.npc.role.RoleUtils"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "npc"
  - "role"
  - "inventory"
---

**Package:** `com.hypixel.hytale.server.npc.role`

```java
public class RoleUtils
```

Static utility methods for managing NPC inventory items during role initialization and runtime. Delegates to `InventoryHelper` for the actual item resolution and slot assignment. Logs warnings via `NPCPlugin` when item or armor resolution fails.

## Static Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public static` | `void` | `setHotbarItems(@Nonnull NPCEntity npcComponent, @Nonnull String[] hotbarItems)` |
| `public static` | `void` | `setOffHandItems(@Nonnull NPCEntity npcComponent, @Nonnull String[] offHandItems)` |
| `public static` | `void` | `setItemInHand(@Nonnull NPCEntity npcComponent, @Nullable String itemInHand)` |
| `public static` | `void` | `setArmor(@Nonnull NPCEntity npcComponent, @Nullable String armor)` |
