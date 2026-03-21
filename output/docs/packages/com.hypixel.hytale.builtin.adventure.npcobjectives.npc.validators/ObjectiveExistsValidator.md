---
title: "ObjectiveExistsValidator"
kind: "class"
package: "com.hypixel.hytale.builtin.adventure.npcobjectives.npc.validators"
fqcn: "com.hypixel.hytale.builtin.adventure.npcobjectives.npc.validators.ObjectiveExistsValidator"
api_surface: false
extends: "AssetValidator"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "npcobjectives"
  - "npc"
  - "validators"
---

**Package:** `com.hypixel.hytale.builtin.adventure.npcobjectives.npc.validators`

```java
public class ObjectiveExistsValidator extends AssetValidator
```

Utility type in the `validators` subsystem.

## Static Methods

| Method | Returns | Description |
|---|---|---|
| `required()` | `ObjectiveExistsValidator` | Static utility method. |
| `withConfig(EnumSet<AssetValidator.Config> config)` | `ObjectiveExistsValidator` | Static utility method. |

## Accessors

| Method | Returns | Description |
|---|---|---|
| `getDomain()` | `String` | Accessor method. |
| `getAssetName()` | `String` | Accessor method. |

## Methods

| Method | Returns | Description |
|---|---|---|
| `test(String objective)` | `boolean` | Instance method. |
| `errorMessage(String objective, String attributeName)` | `String` | Instance method. |
