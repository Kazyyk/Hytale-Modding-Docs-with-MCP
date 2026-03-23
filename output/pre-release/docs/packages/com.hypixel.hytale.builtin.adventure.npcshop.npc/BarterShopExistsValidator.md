---
title: "BarterShopExistsValidator"
kind: "class"
package: "com.hypixel.hytale.builtin.adventure.npcshop.npc"
fqcn: "com.hypixel.hytale.builtin.adventure.npcshop.npc.BarterShopExistsValidator"
api_surface: false
extends: "AssetValidator"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "builtin"
  - "adventure"
  - "npcshop"
  - "npc"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.adventure.npcshop.npc`

```java
public class BarterShopExistsValidator extends AssetValidator
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private static final` | `BarterShopExistsValidator` | `DEFAULT_INSTANCE` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull @Override public` | `String` | `getDomain()` |
| `@Override public` | `boolean` | `test(String marker)` |
| `@Nonnull @Override public` | `String` | `errorMessage(String marker, String attributeName)` |
| `@Nonnull @Override public` | `String` | `getAssetName()` |
| `public static` | `BarterShopExistsValidator` | `required()` |
| `@Nonnull public static` | `BarterShopExistsValidator` | `withConfig(EnumSet<AssetValidator.Config> config)` |
