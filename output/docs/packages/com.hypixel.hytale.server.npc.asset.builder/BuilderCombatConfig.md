---
title: "BuilderCombatConfig"
kind: "class"
package: "com.hypixel.hytale.server.npc.asset.builder"
fqcn: "com.hypixel.hytale.server.npc.asset.builder.BuilderCombatConfig"
api_surface: false
extends: "BuilderCodecObjectHelper<String>"
implements: ~
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "npc"
  - "asset"
  - "builder"
---

**Package:** `com.hypixel.hytale.server.npc.asset.builder`

```java
public class BuilderCombatConfig extends BuilderCodecObjectHelper<String>
```

A codec object helper specialized for NPC combat configuration. Reads a combat config reference (either inline JSON object or a string reference to a `BalanceAsset`) and supports runtime override via `ExecutionContext.getCombatConfig()`.

## Fields

| Field | Type | Description |
|---|---|---|
| `inline` | `boolean` | Whether the config was provided as an inline JSON object rather than a string reference. |

## Constructor

```java
public BuilderCombatConfig(Codec<String> codec, Validator<String> validator)
```

## Methods

### build

```java
public String build()
```

Throws `UnsupportedOperationException`. Use `build(ExecutionContext)` instead.

```java
@Nullable
public String build(@Nonnull ExecutionContext context)
```

Returns the combat config string. If the execution context provides an override via `getCombatConfig()`, that value is used; otherwise the value read from JSON is returned.

### readConfig

```java
@Override
public void readConfig(@Nonnull JsonElement data, @Nonnull ExtraInfo extraInfo)
```

Records whether the config is inline, then delegates to the parent codec reader.

### validate

```java
public boolean validate(String configName, NPCLoadTimeValidationHelper loadTimeValidationHelper, @Nonnull ExecutionContext context, @Nonnull List<String> errors)
```

Validates that any override combat config string refers to an existing `BalanceAsset`.

## Related Types

- [BuilderCodecObjectHelper](BuilderCodecObjectHelper.md) -- parent class
- [BuilderModifier](BuilderModifier.md) -- can provide `_CombatConfig` overrides
