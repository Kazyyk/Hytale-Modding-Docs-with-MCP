---
title: "InternalContainerUtilTag"
kind: "class"
package: "com.hypixel.hytale.server.core.inventory.container"
fqcn: "com.hypixel.hytale.server.core.inventory.container.InternalContainerUtilTag"
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
public class InternalContainerUtilTag
```

Internal utility class that implements tag-based removal from item containers. Matches items whose `Item.getData().getExpandedTagIndexes()` contains the specified tag index.

Supports all-or-nothing semantics.
