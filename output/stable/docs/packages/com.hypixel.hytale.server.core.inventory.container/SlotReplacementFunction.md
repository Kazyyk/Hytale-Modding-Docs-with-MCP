---
title: "SlotReplacementFunction"
kind: "interface"
package: "com.hypixel.hytale.server.core.inventory.container"
fqcn: "com.hypixel.hytale.server.core.inventory.container.SlotReplacementFunction"
api_surface: true
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T03:01:16Z"
tags:
  - "inventory"
  - "container"
  - "functional"
---

**Package:** `com.hypixel.hytale.server.core.inventory.container`

```java
public interface SlotReplacementFunction
```

Functional interface used by `ItemContainer.replaceAll(SlotReplacementFunction)` to transform item stacks during a bulk replacement operation.

## Methods

```java
ItemStack replace(short var1, ItemStack var2)
```

Given a slot index and the current item stack in that slot, returns the replacement item stack.
