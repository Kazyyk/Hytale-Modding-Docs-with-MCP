---
title: "FluidParticle"
kind: "class"
package: "com.hypixel.hytale.server.core.asset.type.fluidfx.config"
fqcn: "com.hypixel.hytale.server.core.asset.type.fluidfx.config.FluidParticle"
api_surface: false
extends: ~
implements: ["NetworkSerializable<com.hypixel.hytale.protocol.FluidParticle>"]
generator_version: "2.0.0"
generated_at: "2026-03-21T18:30:00Z"
tags:
  - "server"
  - "core"
  - "asset"
  - "type"
  - "fluidfx"
  - "config"
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.asset.type.fluidfx.config`

```java
public class FluidParticle implements NetworkSerializable<com.hypixel.hytale.protocol.FluidParticle>
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `BuilderCodec<FluidParticle>` | `CODEC` |
| `protected` | `String` | `systemId` |
| `protected` | `Color` | `color` |
| `protected` | `float` | `scale` |
| `private` | `SoftReference<com.hypixel.hytale.protocol.FluidParticle>` | `cachedPacket` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `FluidParticle(String systemId, Color color, float scale)` |
| `protected` | `FluidParticle()` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `String` | `getSystemId()` |
| `public` | `Color` | `getColor()` |
| `public` | `float` | `getScale()` |
| `@Nonnull public` | `com.hypixel.hytale.protocol.FluidParticle` | `toPacket()` |
| `@Nonnull @Override public` | `String` | `toString()` |
