---
title: "AmbienceFXMusic"
kind: "class"
package: "com.hypixel.hytale.server.core.asset.type.ambiencefx.config"
fqcn: "com.hypixel.hytale.server.core.asset.type.ambiencefx.config.AmbienceFXMusic"
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
public class AmbienceFXMusic implements NetworkSerializable<com.hypixel.hytale.protocol.AmbienceFXMusic>
```

Implements `NetworkSerializable`.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected` | `String[]` | `tracks` |
| `protected` | `float` | `decibels` |
| `protected` | `transient float` | `volume` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public` | `com.hypixel.hytale.protocol.AmbienceFXMusic` | `toPacket()` |
| `` | `public String[]` | `getTracks()` |
| `` | `public float` | `getDecibels()` |
| `` | `public float` | `getVolume()` |
| `` | `protected void` | `processConfig()` |
| `@Override public` | `String` | `toString()` |
