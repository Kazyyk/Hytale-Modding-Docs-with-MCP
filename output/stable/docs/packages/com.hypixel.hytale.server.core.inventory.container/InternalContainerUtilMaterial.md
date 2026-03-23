---
title: "InternalContainerUtilMaterial"
kind: "class"
package: "com.hypixel.hytale.server.core.inventory.container"
fqcn: "com.hypixel.hytale.server.core.inventory.container.InternalContainerUtilMaterial"
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
public class InternalContainerUtilMaterial
```

Internal utility class that implements material-based removal operations for `ItemContainer`. Materials can be identified by item ID, tag index, or resource type. Delegates to `InternalContainerUtilItemStack`, `InternalContainerUtilTag`, or `InternalContainerUtilResource` depending on the `MaterialQuantity` type.

Supports all-or-nothing and exact-amount semantics.
