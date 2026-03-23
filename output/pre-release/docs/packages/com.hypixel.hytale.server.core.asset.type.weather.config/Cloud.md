---
title: "Cloud"
kind: "class"
package: "com.hypixel.hytale.server.core.asset.type.weather.config"
fqcn: "com.hypixel.hytale.server.core.asset.type.weather.config.Cloud"
api_surface: false
extends: null
implements:
  []
generator_version: "2.0.0"
generated_at: "2026-03-21T06:16:36Z"
tags:
  - "server"
  - "weather"
---
**Package:** `com.hypixel.hytale.server.core.asset.type.weather.config`

```java
public class Cloud implements NetworkSerializable<com.hypixel.hytale.protocol.Cloud>
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected` | `String` | `texture` |
| `protected` | `TimeColorAlpha[]` | `colors` |
| `protected` | `TimeFloat[]` | `speeds` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `` | `Cloud(String texture, TimeColorAlpha[] colors, TimeFloat[] speeds)` |
| `protected` | `` | `Cloud()` |
| `public` | `com.hypixel.hytale.protocol.Cloud` | `toPacket()` |
| `public` | `String` | `getTexture()` |
| `public` | `TimeColorAlpha[]` | `getColors()` |
| `public` | `TimeFloat[]` | `getSpeeds()` |
| `public` | `String` | `toString()` |
