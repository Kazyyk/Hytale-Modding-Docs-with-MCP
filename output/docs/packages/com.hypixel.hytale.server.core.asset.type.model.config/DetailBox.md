---
title: "DetailBox"
kind: "class"
package: "com.hypixel.hytale.server.core.asset.type.model.config"
fqcn: "com.hypixel.hytale.server.core.asset.type.model.config.DetailBox"
api_surface: true
extends: null
implements:
  - "com.hypixel.hytale.server.core.io.NetworkSerializable"
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "model"
  - "hitbox"
---

**Package:** `com.hypixel.hytale.server.core.asset.type.model.config`

```java
public class DetailBox implements NetworkSerializable<com.hypixel.hytale.protocol.DetailBox>
```

A named bounding box region with a positional offset, used for detail hitbox areas on entity models (e.g., head, body segments). Supports scaling and network serialization.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected` | `Vector3d` | `offset` |
| `protected` | `Box` | `box` |

## Constructors

```java
public DetailBox()
public DetailBox(Vector3d offset, Box box)
public DetailBox(DetailBox other)
```

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `Vector3d` | `getOffset()` |
| `public` | `Box` | `getBox()` |
| `public` | `DetailBox` | `scaled(float scale)` |
| `@Nonnull public` | `com.hypixel.hytale.protocol.DetailBox` | `toPacket()` |
