---
title: "ItemContext"
kind: "class"
package: "com.hypixel.hytale.server.core.inventory"
fqcn: "com.hypixel.hytale.server.core.inventory.ItemContext"
api_surface: true
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T05:44:26Z"
tags:
  - "inventory"
  - "class"
  - "api"
---

**Package:** `com.hypixel.hytale.server.core.inventory`

```java
public class ItemContext
```

Immutable context binding an [ItemStack](ItemStack.md) to its container and slot index. Used to pass item location context through inventory operations and interactions.

## Constructors

| Signature |
|---|
| `ItemContext(ItemContainer container, short slot, ItemStack itemStack)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `ItemContainer` | `getContainer()` |
| `public` | `short` | `getSlot()` |
| `public` | `ItemStack` | `getItemStack()` |
