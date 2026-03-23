---
title: "InternalContainerUtilResource"
kind: "class"
package: "com.hypixel.hytale.server.core.inventory.container"
fqcn: "com.hypixel.hytale.server.core.inventory.container.InternalContainerUtilResource"
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
public class InternalContainerUtilResource
```

Internal utility class that implements resource-based removal from item containers. Converts resource quantities to item quantities using `ItemResourceType.quantity` ratios, rounding up via `MathUtil.ceil`.

Supports all-or-nothing and exact-amount semantics.
