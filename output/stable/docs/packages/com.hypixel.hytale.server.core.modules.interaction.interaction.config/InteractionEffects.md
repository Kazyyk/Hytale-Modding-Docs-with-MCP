---
title: "InteractionEffects"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.interaction.interaction.config"
fqcn: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.InteractionEffects"
api_surface: true
extends: ~
implements: ["NetworkSerializable<com.hypixel.hytale.protocol.InteractionEffects>"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "interaction"
  - "config"
---

**Package:** `com.hypixel.hytale.server.core.modules.interaction.interaction.config`

```java
public class InteractionEffects implements NetworkSerializable<com.hypixel.hytale.protocol.InteractionEffects>
```

Configures particles, sounds, trails, animations, camera effects, and movement effects applied during an interaction.

## Constants

| Type | Name |
|---|---|
| `BuilderCodec<InteractionEffects>` | `CODEC` |

## Key Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `com.hypixel.hytale.protocol.InteractionEffects` | `toPacket()` |
| `public` | `ModelParticle[]` | `getParticles()` |
| `public` | `String` | `getWorldSoundEventId()` |
| `public` | `int` | `getWorldSoundEventIndex()` |
| `public` | `String` | `getLocalSoundEventId()` |
| `public` | `int` | `getLocalSoundEventIndex()` |
| `public` | `ModelTrail[]` | `getTrails()` |
| `public` | `boolean` | `isWaitForAnimationToFinish()` |
| `public` | `String` | `getItemPlayerAnimationsId()` |
| `public` | `String` | `getItemAnimationId()` |
| `public` | `boolean` | `isClearAnimationOnFinish()` |
| `public` | `float` | `getStartDelay()` |
| `public` | `MovementEffects` | `getMovementEffects()` |
| `protected` | `void` | `processConfig()` |
| `public` | `String` | `toString()` |
