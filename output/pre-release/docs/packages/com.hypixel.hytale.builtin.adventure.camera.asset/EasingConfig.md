---
title: "EasingConfig"
kind: "class"
package: "com.hypixel.hytale.builtin.adventure.camera.asset"
fqcn: "com.hypixel.hytale.builtin.adventure.camera.asset.EasingConfig"
api_surface: false
extends: ~
implements: ["NetworkSerializable<com.hypixel.hytale.protocol.EasingConfig>"]
generator_version: "2.0.0"
generated_at: "2026-03-21T16:20:05Z"
tags:
  - "builtin"
  - "adventure"
  - "camera"
  - "asset"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.adventure.camera.asset`

```java
public class EasingConfig implements NetworkSerializable<com.hypixel.hytale.protocol.EasingConfig>
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `EasingConfig` | `NONE` |
| `protected` | `float` | `time` |
| `protected` | `EasingType` | `type` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public` | `com.hypixel.hytale.protocol.EasingConfig` | `toPacket()` |
| `@Override @Nonnull public` | `String` | `toString()` |
