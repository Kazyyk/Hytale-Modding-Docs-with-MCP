---
title: "DisabledFluidResource"
kind: "class"
package: "com.hypixel.hytale.builtin.fluid"
fqcn: "com.hypixel.hytale.builtin.fluid.DisabledFluidResource"
api_surface: false
extends: ~
implements: 
  - "Resource"
generator_version: "2.0.0"
generated_at: "2026-03-22T20:55:01Z"
tags:
  - "fluid"
---

**Package:** `com.hypixel.hytale.builtin.fluid`

```java
public class DisabledFluidResource implements Resource
```

Chunk store resource that caches the set of disabled fluid IDs based on the world configuration's disabled fluid ticker tags. Lazily resolves fluid IDs from tag names and invalidates when the configuration changes.
