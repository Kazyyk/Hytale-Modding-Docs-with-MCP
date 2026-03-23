---
title: "FireFluidTicker.FlammabilityConfig"
kind: "class"
package: "com.hypixel.hytale.server.core.asset.type.fluid"
fqcn: "com.hypixel.hytale.server.core.asset.type.fluid.FireFluidTicker.FlammabilityConfig"
api_surface: false
extends: "java.lang.Object"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-22T21:11:06Z"
tags:
  - "asset"
  - "fluid"
  - "fire"
---

**Package:** `com.hypixel.hytale.server.core.asset.type.fluid`

```java
public static class FireFluidTicker.FlammabilityConfig
```

Inner class of `FireFluidTicker` that defines flammability behavior per tag pattern. Specifies which blocks (matched by `TagPattern`) can catch fire, with configurable ignite chance, burn duration, and burn chance. Used in the fire spreading simulation.

## Related Types

- `FireFluidTicker` -- parent class that uses this configuration
- `TagPattern` -- pattern matching for block tags
