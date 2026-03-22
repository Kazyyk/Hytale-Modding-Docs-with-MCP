---
title: "MovementEffects"
kind: "class"
package: "com.hypixel.hytale.server.core.asset.modifiers"
fqcn: "com.hypixel.hytale.server.core.asset.modifiers.MovementEffects"
api_surface: true
extends: null
implements: ["NetworkSerializable"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "core"
  - "asset"
  - "modifiers"
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.asset.modifiers`

```java
public class MovementEffects implements NetworkSerializable
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `BuilderCodec<MovementEffects>` | `CODEC` |
| `protected` | `boolean` | `disableAll` |
| `protected` | `boolean` | `disableForward` |
| `protected` | `boolean` | `disableBackward` |
| `protected` | `boolean` | `disableLeft` |
| `protected` | `boolean` | `disableRight` |
| `protected` | `boolean` | `disableSprint` |
| `protected` | `boolean` | `disableJump` |
| `protected` | `boolean` | `disableCrouch` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `boolean` | `isDisableAll()` |
| `@Nonnull public` | `com.hypixel.hytale.protocol.MovementEffects` | `toPacket()` |
| `@Nonnull @Override public` | `String` | `toString()` |
