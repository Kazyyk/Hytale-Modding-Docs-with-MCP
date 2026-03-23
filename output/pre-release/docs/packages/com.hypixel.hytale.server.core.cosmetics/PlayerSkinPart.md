---
title: "PlayerSkinPart"
kind: "class"
package: "com.hypixel.hytale.server.core.cosmetics"
fqcn: "com.hypixel.hytale.server.core.cosmetics.PlayerSkinPart"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "cosmetics"
---

**Package:** `com.hypixel.hytale.server.core.cosmetics`

```java
public class PlayerSkinPart
```

Represents a single part of a player skin (e.g., torso, limb).

## Enum Constants

- `Short`
- `Medium`
- `Long`

## Key Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `String` | `getId()` |
| `public` | `String` | `getName()` |
| `public` | `String` | `getModel()` |
| `public` | `Map<String, PlayerSkinPartTexture>` | `getTextures()` |
| `public` | `Map<String, PlayerSkinPart.Variant>` | `getVariants()` |
| `public` | `boolean` | `isDefaultAsset()` |
| `public` | `String[]` | `getTags()` |
| `public` | `PlayerSkinPart.HaircutType` | `getHairType()` |
| `public` | `boolean` | `doesRequireGenericHaircut()` |
| `public` | `PlayerSkinPart.HeadAccessoryType` | `getHeadAccessoryType()` |
| `public` | `String` | `getGreyscaleTexture()` |
| `public` | `String` | `getGradientSet()` |
| `public` | `String` | `toString()` |
