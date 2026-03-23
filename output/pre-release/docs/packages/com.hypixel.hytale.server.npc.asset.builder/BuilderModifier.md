---
title: "BuilderModifier"
kind: "class"
package: "com.hypixel.hytale.server.npc.asset.builder"
fqcn: "com.hypixel.hytale.server.npc.asset.builder.BuilderModifier"
api_surface: false
extends: ~
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
public class BuilderModifier
```

Represents a `"Modify"` block in NPC JSON configuration that overrides parameters, exports state mappings, provides combat config overrides, and supplies interaction variables when referencing a component. The modifier creates a new expression scope that merges parameter overrides with the referenced builder's parameters.

## Constants

| Constant | Type | Value |
|---|---|---|
| `KEY_MODIFY` | `String` | `"Modify"` |
| `KEY_EXPORT_STATES` | `String` | `"_ExportStates"` |
| `KEY_INTERFACE_PARAMETERS` | `String` | `"_InterfaceParameters"` |
| `KEY_COMBAT_CONFIG` | `String` | `"_CombatConfig"` |
| `KEY_INTERACTION_VARS` | `String` | `"_InteractionVars"` |

## Constructor

```java
protected BuilderModifier(Object2ObjectMap<String, ExpressionHolder> builderExpressionMap, StatePair[] exportedStateIndexes, StateMappingHelper stateHelper, String combatConfig, Map<String, String> interactionVars)
```

## Methods

### getCombatConfig / getInteractionVars

```java
public String getCombatConfig()
public Map<String, String> getInteractionVars()
```

### isEmpty

```java
public boolean isEmpty()
```

Returns `true` if no parameter overrides are defined.

### exportedStateCount

```java
public int exportedStateCount()
```

Returns the number of exported state pairs.

### applyComponentStateMap / popComponentStateMap

```java
public void applyComponentStateMap(@Nonnull BuilderSupport support)
public void popComponentStateMap(@Nonnull BuilderSupport support)
```

Pushes and pops state mapping overrides on the [BuilderSupport](BuilderSupport.md).

### createScope

```java
@Nonnull
public Scope createScope(@Nonnull BuilderSupport builderSupport, @Nonnull BuilderParameters builderParameters, Scope globalScope)
```

Creates a merged expression scope containing parameter overrides.

### fromJSON (static)

```java
@Nonnull
public static BuilderModifier fromJSON(@Nonnull JsonObject jsonObject, @Nonnull BuilderParameters builderParameters, @Nonnull StateMappingHelper helper, @Nonnull ExtraInfo extraInfo)
```

Parses a `"Modify"` JSON block. Returns [EmptyBuilderModifier](EmptyBuilderModifier.md) if the block is absent or empty.

### readModifierObject (static)

```java
public static void readModifierObject(@Nonnull JsonObject jsonObject, @Nonnull BuilderParameters builderParameters, @Nonnull StringHolder holder, @Nonnull Consumer<StringHolder> referenceConsumer, @Nonnull Consumer<BuilderModifier> builderModifierConsumer, @Nonnull StateMappingHelper helper, @Nonnull ExtraInfo extraInfo)
```

Reads a JSON object containing both a `"Reference"` and a `"Modify"` block.

## Inner Types

### ExpressionHolder (private class)

Holds a default expression and optional interface-mapped expressions for parameter overrides.

### SchemaGenerator (private class)

Generates the JSON Schema for the modifier block.

## Related Types

- [EmptyBuilderModifier](EmptyBuilderModifier.md) -- singleton empty modifier
- [BuilderObjectReferenceHelper](BuilderObjectReferenceHelper.md) -- uses modifiers when resolving references
- [BuilderParameters](BuilderParameters.md) -- the parameter scope being overridden
- [StatePair](StatePair.md) -- exported state pairs
- [StateMappingHelper](StateMappingHelper.md) -- state index management
