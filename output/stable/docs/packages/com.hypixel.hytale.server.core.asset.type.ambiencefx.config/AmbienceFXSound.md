---
title: "AmbienceFXSound"
kind: "class"
package: "com.hypixel.hytale.server.core.asset.type.ambiencefx.config"
fqcn: "com.hypixel.hytale.server.core.asset.type.ambiencefx.config.AmbienceFXSound"
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
public class AmbienceFXSound implements NetworkSerializable<com.hypixel.hytale.protocol.AmbienceFXSound>
```

Implements `NetworkSerializable`.

## Constants

| Modifier | Type | Name | Value |
|---|---|---|---|
| `public static final` | `Rangef` | `DEFAULT_FREQUENCY` | `new Rangef(1.0F, 10.0F)` |
| `public static final` | `Range` | `DEFAULT_RADIUS` | `new Range(0, 24)` |

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected` | `String` | `soundEventId` |
| `protected` | `transient int` | `soundEventIndex` |
| `protected` | `AmbienceFXSoundPlay3D` | `play3D` |
| `protected` | `String` | `blockSoundSetId` |
| `protected` | `transient int` | `blockSoundSetIndex` |
| `protected` | `AmbienceFXAltitude` | `altitude` |
| `protected` | `Rangef` | `frequency` |
| `protected` | `Range` | `radius` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public` | `com.hypixel.hytale.protocol.AmbienceFXSound` | `toPacket()` |
| `` | `public String` | `getSoundEventId()` |
| `` | `public int` | `getSoundEventIndex()` |
| `` | `public AmbienceFXSoundPlay3D` | `getPlay3D()` |
| `` | `public String` | `getBlockSoundSetId()` |
| `` | `public AmbienceFXAltitude` | `getAltitude()` |
| `` | `public Rangef` | `getFrequency()` |
| `` | `public Range` | `getRadius()` |
| `` | `protected void` | `processConfig()` |
| `@Override public` | `String` | `toString()` |
