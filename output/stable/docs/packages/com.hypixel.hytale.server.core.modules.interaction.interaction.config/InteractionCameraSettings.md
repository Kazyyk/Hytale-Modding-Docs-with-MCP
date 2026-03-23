---
title: "InteractionCameraSettings"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.interaction.interaction.config"
fqcn: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.InteractionCameraSettings"
api_surface: true
extends: ~
implements: ["NetworkSerializable<com.hypixel.hytale.protocol.InteractionCameraSettings>"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "interaction"
  - "config"
---

**Package:** `com.hypixel.hytale.server.core.modules.interaction.interaction.config`

```java
public class InteractionCameraSettings implements NetworkSerializable<com.hypixel.hytale.protocol.InteractionCameraSettings>
```

Configures first-person and third-person camera keyframe sequences during an interaction.

## Constants

| Type | Name |
|---|---|
| `BuilderCodec<InteractionCameraSettings>` | `CODEC` |
| `BuilderCodec<InteractionCameraSettings.InteractionCamera>` | `CODEC` |

## Key Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `com.hypixel.hytale.protocol.InteractionCameraSettings` | `toPacket()` |
| `public` | `String` | `toString()` |
