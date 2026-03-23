---
title: "ModelAttachment"
kind: "class"
package: "com.hypixel.hytale.server.core.asset.type.model.config"
fqcn: "com.hypixel.hytale.server.core.asset.type.model.config.ModelAttachment"
api_surface: true
extends: null
implements:
  - "com.hypixel.hytale.server.core.io.NetworkSerializable"
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "model"
  - "attachment"
---

**Package:** `com.hypixel.hytale.server.core.asset.type.model.config`

```java
public class ModelAttachment implements NetworkSerializable<com.hypixel.hytale.protocol.ModelAttachment>
```

Sub-model attachment defining a model path, texture path, gradient set/ID, and a selection weight for random attachment sets. Used for overlaying additional geometry on a base model (e.g., hair, armor, accessories).

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected` | `String` | `model` |
| `protected` | `String` | `texture` |
| `protected` | `String` | `gradientSet` |
| `protected` | `String` | `gradientId` |
| `protected` | `double` | `weight` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `String` | `getModel()` |
| `public` | `String` | `getTexture()` |
| `public` | `String` | `getGradientId()` |
| `public` | `String` | `getGradientSet()` |
| `public` | `double` | `getWeight()` |
| `@Nonnull public` | `com.hypixel.hytale.protocol.ModelAttachment` | `toPacket()` |
