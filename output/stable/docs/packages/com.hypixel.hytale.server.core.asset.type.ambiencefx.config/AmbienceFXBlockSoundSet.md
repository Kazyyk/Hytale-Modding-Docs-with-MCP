---
title: "AmbienceFXBlockSoundSet"
kind: "class"
package: "com.hypixel.hytale.server.core.asset.type.ambiencefx.config"
fqcn: "com.hypixel.hytale.server.core.asset.type.ambiencefx.config.AmbienceFXBlockSoundSet"
api_surface: false
extends: null
implements:
  - "NetworkSerializable"
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "type"
  - "ambiencefx"
  - "config"
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.asset.type.ambiencefx.config`

```java
public class AmbienceFXBlockSoundSet implements NetworkSerializable<com.hypixel.hytale.protocol.AmbienceFXBlockSoundSet>
```

Implements `NetworkSerializable`.

## Constants

| Modifier | Type | Name | Value |
|---|---|---|---|
| `public static final` | `Rangef` | `DEFAULT_PERCENT` | `new Rangef(0.0F, 0.0F)` |

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected` | `String` | `blockSoundSetId` |
| `protected` | `transient int` | `blockSoundSetIndex` |
| `protected` | `Rangef` | `percent` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public` | `com.hypixel.hytale.protocol.AmbienceFXBlockSoundSet` | `toPacket()` |
| `` | `public String` | `getBlockSoundSetId()` |
| `` | `public Rangef` | `getPercent()` |
| `` | `protected void` | `processConfig()` |
| `@Override public` | `String` | `toString()` |
