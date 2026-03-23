---
title: "InternalContainerUtilItemStack"
kind: "class"
package: "com.hypixel.hytale.server.core.inventory.container"
fqcn: "com.hypixel.hytale.server.core.inventory.container.InternalContainerUtilItemStack"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T03:01:16Z"
tags:
  - "inventory"
  - "container"
  - "internal"
---

**Package:** `com.hypixel.hytale.server.core.inventory.container`

```java
public class InternalContainerUtilItemStack
```

Internal utility class that implements the core item-stack-based add, remove, and test operations for `ItemContainer`. All methods operate under the container's write lock (called by the container's `writeAction` methods).

Handles stacking logic, all-or-nothing semantics, filter checks, and quantity splitting across slots.

Not intended for direct use -- called by `ItemContainer` public methods.
