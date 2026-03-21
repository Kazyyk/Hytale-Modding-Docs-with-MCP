---
title: "CameraShakeInteraction"
kind: "class"
package: "com.hypixel.hytale.builtin.adventure.camera.interaction"
fqcn: "com.hypixel.hytale.builtin.adventure.camera.interaction.CameraShakeInteraction"
api_surface: false
extends: "SimpleInstantInteraction"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "builtin"
  - "adventure"
  - "camera"
  - "interaction"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.adventure.camera.interaction`

```java
public class CameraShakeInteraction extends SimpleInstantInteraction
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `BuilderCodec<CameraShakeInteraction>` | `CODEC` |
| `protected` | `String` | `effectId` |
| `protected` | `int` | `effectIndex` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override protected` | `void` | `firstRun(InteractionType type, InteractionContext context, CooldownHandler cooldownHandler)` |
| `@Nonnull @Override public` | `String` | `toString()` |
