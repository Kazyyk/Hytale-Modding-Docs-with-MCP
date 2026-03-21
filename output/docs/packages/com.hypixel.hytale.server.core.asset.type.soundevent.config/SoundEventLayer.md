---
title: "SoundEventLayer"
kind: "class"
package: "com.hypixel.hytale.server.core.asset.type.soundevent.config"
fqcn: "com.hypixel.hytale.server.core.asset.type.soundevent.config.SoundEventLayer"
api_surface: false
extends: ~
implements: ["NetworkSerializable<com.hypixel.hytale.protocol.SoundEventLayer>"]
generator_version: "2.0.0"
generated_at: "2026-03-21T16:20:05Z"
tags:
  - "server"
  - "core"
  - "asset"
  - "type"
  - "soundevent"
  - "config"
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.asset.type.soundevent.config`

```java
public class SoundEventLayer implements NetworkSerializable<com.hypixel.hytale.protocol.SoundEventLayer>
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected transient` | `float` | `volume` |
| `protected` | `float` | `startDelay` |
| `protected` | `boolean` | `looping` |
| `protected` | `int` | `probability` |
| `protected` | `float` | `probabilityRerollDelay` |
| `protected` | `SoundEventLayer.RandomSettings` | `randomSettings` |
| `protected` | `String[]` | `files` |
| `protected` | `int` | `roundRobinHistorySize` |
| `protected transient` | `int` | `highestNumberOfChannels` |
| `public static final` | `SoundEventLayer.RandomSettings` | `DEFAULT` |
| `protected transient` | `float` | `minVolume` |
| `protected transient` | `float` | `maxVolume` |
| `protected transient` | `float` | `minPitch` |
| `protected transient` | `float` | `maxPitch` |
| `protected` | `float` | `maxStartOffset` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `float` | `getVolume()` |
| `public` | `float` | `getStartDelay()` |
| `public` | `boolean` | `isLooping()` |
| `public` | `int` | `getProbability()` |
| `public` | `float` | `getProbabilityRerollDelay()` |
| `public` | `SoundEventLayer.RandomSettings` | `getRandomSettings()` |
| `public` | `String[]` | `getFiles()` |
| `public` | `int` | `getRoundRobinHistorySize()` |
| `public` | `int` | `getHighestNumberOfChannels()` |
| `@Nonnull public` | `com.hypixel.hytale.protocol.SoundEventLayer` | `toPacket()` |
| `@Override @Nonnull public` | `String` | `toString()` |
| `public` | `float` | `getMinVolume()` |
| `public` | `float` | `getMaxVolume()` |
| `public` | `float` | `getMinPitch()` |
| `public` | `float` | `getMaxPitch()` |
| `public` | `float` | `getMaxStartOffset()` |

## Inner Types

- `SoundEventLayer.RandomSettings`
