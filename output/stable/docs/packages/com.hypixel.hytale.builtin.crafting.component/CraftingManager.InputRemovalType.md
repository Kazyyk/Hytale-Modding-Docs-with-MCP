---
title: "CraftingManager.InputRemovalType"
kind: "enum"
package: "com.hypixel.hytale.builtin.crafting.component"
fqcn: "com.hypixel.hytale.builtin.crafting.component.CraftingManager.InputRemovalType"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "crafting"
  - "builtin"
---

**Package:** `com.hypixel.hytale.builtin.crafting.component`

```java
public static enum InputRemovalType
```

Controls how crafting input materials are removed from the player's inventory.

## Enum Constants

| Constant | Description |
|---|---|
| `NORMAL` | Standard material removal using `removeMaterials`. |
| `ORDERED` | Ordered material removal using `removeMaterialsOrdered`, preserving slot order. |
