---
title: "CommonAssetValidator"
kind: "class"
package: "com.hypixel.hytale.server.core.asset.common"
fqcn: "com.hypixel.hytale.server.core.asset.common.CommonAssetValidator"
api_surface: false
extends: null
implements: ["Validator<String>"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "asset"
  - "common"
---

**Package:** `com.hypixel.hytale.server.core.asset.common`

```java
public class CommonAssetValidator implements Validator<String>
```

Validates common asset references during asset loading. Checks that referenced assets exist in `CommonAssetRegistry`, have the required file extension, and reside within allowed root directories. Provides predefined validators for textures, models, animations, sounds, and icons.

## Predefined Validators

| Name | Extension | Roots |
|---|---|---|
| `TEXTURE_ITEM` | `png` | Blocks, BlockTextures, Items, NPC, Resources, VFX |
| `TEXTURE_CHARACTER` | `png` | Characters, NPC, Items, VFX |
| `MODEL_ITEM` | `blockymodel` | Blocks, Items, Resources, NPC, VFX, Consumable |
| `MODEL_CHARACTER` | `blockymodel` | Characters, NPC, Items, VFX |
| `ANIMATION_CHARACTER` | `blockyanim` | Characters, NPC, Equipment, VFX, Items |
| `MUSIC` | `ogg` | Music |
| `SOUNDS` | `ogg` | Sounds |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `void` | `accept(@Nullable String asset, @Nonnull ValidationResults results)` |
| `@Override public` | `void` | `updateSchema(SchemaContext context, @Nonnull Schema target)` |
