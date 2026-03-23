---
title: "BarterShopState"
kind: "class"
package: "com.hypixel.hytale.builtin.adventure.shop.barter"
fqcn: "com.hypixel.hytale.builtin.adventure.shop.barter.BarterShopState"
api_surface: false
extends: "java.lang.Object"
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
public class BarterShopState
```

Runtime state for an active barter shop instance. Tracks current stock levels, refresh timers, and per-player purchase limits. Each NPC with a shop creates its own `BarterShopState` that persists across player interactions.
