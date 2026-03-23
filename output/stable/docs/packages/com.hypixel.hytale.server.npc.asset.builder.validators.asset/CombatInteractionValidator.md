---
title: "CombatInteractionValidator"
kind: "class"
package: "com.hypixel.hytale.server.npc.asset.builder.validators.asset"
fqcn: "com.hypixel.hytale.server.npc.asset.builder.validators.asset.CombatInteractionValidator"
api_surface: false
extends: "AssetValidator"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T16:20:05Z"
tags:
  - "server"
  - "npc"
  - "asset"
  - "builder"
  - "validators"
  - "class"
---

**Package:** `com.hypixel.hytale.server.npc.asset.builder.validators.asset`

```java
public class CombatInteractionValidator extends AssetValidator
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `List<String>` | `disallowedInteractions` |
| `private` | `boolean` | `assetExists` |
| `private` | `boolean` | `attackTag` |
| `private` | `boolean` | `onlyOneAttackType` |
| `private` | `boolean` | `onlyOneAimingReference` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override @Nonnull public` | `String` | `getDomain()` |
| `@Override public` | `boolean` | `test(String value)` |
| `@Override @Nonnull public` | `String` | `errorMessage(String value, String attribute)` |
| `@Override @Nonnull public` | `String` | `getAssetName()` |
| `public static` | `boolean` | `testAttackTag(@Nonnull RootInteraction interaction)` |
| `public static` | `boolean` | `testOnlyOneAttackType(@Nonnull RootInteraction interaction)` |
| `@Nonnull public static` | `CombatInteractionValidator` | `required()` |
| `@Nonnull public static` | `CombatInteractionValidator` | `withConfig(EnumSet<AssetValidator.Config> config)` |
