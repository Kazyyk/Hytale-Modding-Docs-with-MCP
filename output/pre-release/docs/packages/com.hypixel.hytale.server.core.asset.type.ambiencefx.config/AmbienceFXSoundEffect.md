---
title: "AmbienceFXSoundEffect"
kind: "class"
package: "com.hypixel.hytale.server.core.asset.type.ambiencefx.config"
fqcn: "com.hypixel.hytale.server.core.asset.type.ambiencefx.config.AmbienceFXSoundEffect"
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
public class AmbienceFXSoundEffect implements NetworkSerializable<com.hypixel.hytale.protocol.AmbienceFXSoundEffect>
```

Implements `NetworkSerializable`.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `@Nullable protected` | `String` | `reverbEffectId` |
| `protected` | `transient int` | `reverbEffectIndex` |
| `@Nullable protected` | `String` | `equalizerEffectId` |
| `protected` | `transient int` | `equalizerEffectIndex` |
| `protected` | `boolean` | `isInstant` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `` | `protected void` | `processConfig()` |
| `@Nonnull public` | `com.hypixel.hytale.protocol.AmbienceFXSoundEffect` | `toPacket()` |
| `@Nullable public` | `String` | `getReverbEffectId()` |
| `` | `public int` | `getReverbEffectIndex()` |
| `@Nullable public` | `String` | `getEqualizerEffectId()` |
| `` | `public int` | `getEqualizerEffectIndex()` |
| `` | `public boolean` | `isInstant()` |
| `@Override public` | `String` | `toString()` |
