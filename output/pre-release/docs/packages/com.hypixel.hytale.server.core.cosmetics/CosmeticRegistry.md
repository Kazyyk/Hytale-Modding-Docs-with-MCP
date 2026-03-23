---
title: "CosmeticRegistry"
kind: "class"
package: "com.hypixel.hytale.server.core.cosmetics"
fqcn: "com.hypixel.hytale.server.core.cosmetics.CosmeticRegistry"
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
public class CosmeticRegistry
```

Registry that manages all cosmetic assets including skins, emotes, and body types.

## Constants

| Type | Name |
|---|---|
| `String` | `MODEL` |
| `String` | `SKIN_GRADIENTSET_ID` |

## Key Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `Map<String, Emote>` | `getEmotes()` |
| `public` | `Map<String, PlayerSkinTintColor>` | `getEyeColors()` |
| `public` | `Map<String, PlayerSkinGradientSet>` | `getGradientSets()` |
| `public` | `Map<String, PlayerSkinPart>` | `getBodyCharacteristics()` |
| `public` | `Map<String, PlayerSkinPart>` | `getUnderwear()` |
| `public` | `Map<String, PlayerSkinPart>` | `getEyebrows()` |
| `public` | `Map<String, PlayerSkinPart>` | `getEars()` |
| `public` | `Map<String, PlayerSkinPart>` | `getEyes()` |
| `public` | `Map<String, PlayerSkinPart>` | `getFaces()` |
| `public` | `Map<String, PlayerSkinPart>` | `getMouths()` |
| `public` | `Map<String, PlayerSkinPart>` | `getFacialHairs()` |
| `public` | `Map<String, PlayerSkinPart>` | `getPants()` |
| `public` | `Map<String, PlayerSkinPart>` | `getOverpants()` |
| `public` | `Map<String, PlayerSkinPart>` | `getUndertops()` |
| `public` | `Map<String, PlayerSkinPart>` | `getOvertops()` |
| `public` | `Map<String, PlayerSkinPart>` | `getHaircuts()` |
| `public` | `Map<String, PlayerSkinPart>` | `getShoes()` |
| `public` | `Map<String, PlayerSkinPart>` | `getHeadAccessories()` |
| `public` | `Map<String, PlayerSkinPart>` | `getFaceAccessories()` |
| `public` | `Map<String, PlayerSkinPart>` | `getEarAccessories()` |
| `public` | `Map<String, PlayerSkinPart>` | `getGloves()` |
| `public` | `Map<String, PlayerSkinPart>` | `getSkinFeatures()` |
| `public` | `Map<String, PlayerSkinPart>` | `getCapes()` |
| `public` | `Map<String, ?>` | `getByType(@Nonnull CosmeticType type)` |
