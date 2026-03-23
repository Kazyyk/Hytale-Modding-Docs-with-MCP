---
title: "BarterPage"
kind: "class"
package: "com.hypixel.hytale.builtin.adventure.shop.barter"
fqcn: "com.hypixel.hytale.builtin.adventure.shop.barter.BarterPage"
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
public class BarterPage
```

Manages a single page of trades within a barter shop UI. Handles page lifecycle (open, close, tick), trade slot rendering, stock refresh timing, and purchase transaction processing. Integrates with the custom UI system via `CustomPageLifetime` and event bindings.
