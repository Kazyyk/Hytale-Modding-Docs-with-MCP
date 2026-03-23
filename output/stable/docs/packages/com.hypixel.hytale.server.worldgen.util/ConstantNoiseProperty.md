---
title: "ConstantNoiseProperty"
kind: "class"
package: "com.hypixel.hytale.server.worldgen.util"
fqcn: "com.hypixel.hytale.server.worldgen.util.ConstantNoiseProperty"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "worldgen"
  - "util"
---

**Package:** `com.hypixel.hytale.server.worldgen.util`

```java
public final class ConstantNoiseProperty
```

Provides ConstantNoiseProperty functionality within the util subsystem.

## Constants

| Modifier | Type | Name | Value |
|---|---|---|---|
| `private static final` | `ConstantNoise` | `DEFAULT_ZERO_NOISE` | `new ConstantNoise(0.0)` |
| `public static final` | `NoiseProperty` | `DEFAULT_ZERO` | `new SingleNoiseProperty(0, DEFAULT_ZERO_NOISE)` |
| `private static final` | `ConstantNoise` | `DEFAULT_ONE_NOISE` | `new ConstantNoise(1.0)` |
| `public static final` | `NoiseProperty` | `DEFAULT_ONE` | `new SingleNoiseProperty(0, DEFAULT_ONE_NOISE)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `private` | | `ConstantNoiseProperty()` |
