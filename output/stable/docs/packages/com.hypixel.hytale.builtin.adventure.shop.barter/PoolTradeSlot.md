---
title: "PoolTradeSlot"
kind: "class"
package: "com.hypixel.hytale.builtin.adventure.shop.barter"
fqcn: "com.hypixel.hytale.builtin.adventure.shop.barter.PoolTradeSlot"
api_surface: false
extends: "TradeSlot"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T05:46:00Z"
tags:
  - "adventure"
  - "shop"
  - "barter"
---

**Package:** `com.hypixel.hytale.builtin.adventure.shop.barter`

```java
public class PoolTradeSlot extends TradeSlot
```

A trade slot that randomly selects its current trade from a weighted pool of `WeightedTrade` entries. On each refresh cycle, a new trade is drawn from the pool. Used for rotating or randomized shop inventories.
