---
title: "AmbienceFXAmbientBed"
kind: "class"
package: "com.hypixel.hytale.server.core.asset.type.ambiencefx.config"
fqcn: "com.hypixel.hytale.server.core.asset.type.ambiencefx.config.AmbienceFXAmbientBed"
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
public class AmbienceFXAmbientBed implements NetworkSerializable<com.hypixel.hytale.protocol.AmbienceFXAmbientBed>
```

Implements `NetworkSerializable`.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected` | `String` | `track` |
| `protected` | `float` | `decibels` |
| `protected` | `transient float` | `volume` |
| `protected` | `AmbienceTransitionSpeed` | `transitionSpeed` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public` | `com.hypixel.hytale.protocol.AmbienceFXAmbientBed` | `toPacket()` |
| `` | `public String` | `getTrack()` |
| `` | `public float` | `getDecibels()` |
| `` | `public float` | `getVolume()` |
| `` | `public AmbienceTransitionSpeed` | `getTransitionSpeed()` |
| `` | `protected void` | `processConfig()` |
| `@Override public` | `String` | `toString()` |
