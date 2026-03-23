---
title: "FluidPlugin"
kind: "class"
package: "com.hypixel.hytale.builtin.fluid"
fqcn: "com.hypixel.hytale.builtin.fluid.FluidPlugin"
api_surface: false
extends: "JavaPlugin"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-22T20:55:01Z"
tags:
  - "fluid"
---

**Package:** `com.hypixel.hytale.builtin.fluid`

```java
public class FluidPlugin extends JavaPlugin
```

Plugin that implements the fluid simulation system. Registers fluid tickers (`DefaultFluidTicker`, `FiniteFluidTicker`, `FireFluidTicker`), the disabled fluid resource, and chunk pre-load processing for fluid propagation.
