---
title: "UseWateringCanInteraction"
kind: "class"
package: "com.hypixel.hytale.builtin.adventure.farming.interactions"
fqcn: "com.hypixel.hytale.builtin.adventure.farming.interactions.UseWateringCanInteraction"
api_surface: false
extends: "SimpleBlockInteraction"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T12:00:00Z"
tags:
  - "farming"
  - "interaction"
---

**Package:** `com.hypixel.hytale.builtin.adventure.farming.interactions`

```java
public class UseWateringCanInteraction extends SimpleBlockInteraction
```

Waters a [TilledSoilBlock](TilledSoilBlock.md) by setting `wateredUntil` to the current game time plus the configured `Duration` (in seconds). If the target is a crop, looks one block below for the soil. Schedules a tick at the watering expiry time.
