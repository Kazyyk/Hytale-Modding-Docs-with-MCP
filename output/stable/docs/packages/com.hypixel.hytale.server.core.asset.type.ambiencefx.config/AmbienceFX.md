---
title: "AmbienceFX"
kind: "class"
package: "com.hypixel.hytale.server.core.asset.type.ambiencefx.config"
fqcn: "com.hypixel.hytale.server.core.asset.type.ambiencefx.config.AmbienceFX"
api_surface: false
extends: null
implements:
  - "JsonAssetWithMap"
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
public class AmbienceFX implements JsonAssetWithMap<String, IndexedAssetMap<String, AmbienceFX>>, NetworkSerializable<com.hypixel.hytale.protocol.AmbienceFX>
```

Implements `JsonAssetWithMap`, `NetworkSerializable`.

## Constants

| Modifier | Type | Name | Value |
|---|---|---|---|
| `public static final` | `int` | `EMPTY_ID` | `0` |
| `public static final` | `AmbienceFX` | `EMPTY` | `new AmbienceFX() {
        {
            this.id = "Empty"` |

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected` | `AssetExtraInfo.Data` | `data` |
| `protected` | `String` | `id` |
| `protected` | `AmbienceFXConditions` | `conditions` |
| `protected` | `AmbienceFXSound[]` | `sounds` |
| `protected` | `AmbienceFXMusic` | `music` |
| `protected` | `AmbienceFXAmbientBed` | `ambientBed` |
| `protected` | `AmbienceFXSoundEffect` | `soundEffect` |
| `protected` | `int` | `priority` |
| `protected` | `String[]` | `blockedAmbienceFxIds` |
| `@Nullable protected` | `String` | `audioCategoryId` |
| `protected` | `transient int` | `audioCategoryIndex` |
| `private` | `SoftReference<com.hypixel.hytale.protocol.AmbienceFX>` | `cachedPacket` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `` | `public static AssetStore<String, AmbienceFX, IndexedAssetMap<String, AmbienceFX>>` | `getAssetStore()` |
| `` | `public static IndexedAssetMap<String, AmbienceFX>` | `getAssetMap()` |
| `@Nonnull public` | `com.hypixel.hytale.protocol.AmbienceFX` | `toPacket()` |
| `` | `public String` | `getId()` |
| `` | `public AmbienceFXConditions` | `getConditions()` |
| `` | `public AmbienceFXSound[]` | `getSounds()` |
| `` | `public AmbienceFXMusic` | `getMusic()` |
| `` | `public AmbienceFXAmbientBed` | `getAmbientBed()` |
| `` | `public AmbienceFXSoundEffect` | `getSoundEffect()` |
| `` | `public int` | `getPriority()` |
| `` | `public String[]` | `getBlockedAmbienceFxIds()` |
| `@Override public` | `String` | `toString()` |
