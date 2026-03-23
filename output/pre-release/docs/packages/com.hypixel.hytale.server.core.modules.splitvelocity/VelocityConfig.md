---
title: "VelocityConfig"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.splitvelocity"
fqcn: "com.hypixel.hytale.server.core.modules.splitvelocity.VelocityConfig"
api_surface: true
extends: null
implements: ["NetworkSerializable"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "core"
  - "modules"
  - "splitvelocity"
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.modules.splitvelocity`

```java
public class VelocityConfig implements NetworkSerializable
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static` | `BuilderCodec<VelocityConfig>` | `CODEC` |
| `private` | `float` | `groundResistance` |
| `private` | `float` | `groundResistanceMax` |
| `private` | `float` | `airResistance` |
| `private` | `float` | `airResistanceMax` |
| `private` | `float` | `threshold` |
| `private` | `VelocityThresholdStyle` | `style` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `float` | `getGroundResistance()` |
| `public` | `float` | `getAirResistance()` |
| `public` | `float` | `getGroundResistanceMax()` |
| `public` | `float` | `getAirResistanceMax()` |
| `public` | `float` | `getThreshold()` |
| `public` | `VelocityThresholdStyle` | `getStyle()` |
| `@Nonnull public` | `com.hypixel.hytale.protocol.VelocityConfig` | `toPacket()` |
