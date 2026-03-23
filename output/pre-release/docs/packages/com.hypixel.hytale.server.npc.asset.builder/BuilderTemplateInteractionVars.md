---
title: "BuilderTemplateInteractionVars"
kind: "class"
package: "com.hypixel.hytale.server.npc.asset.builder"
fqcn: "com.hypixel.hytale.server.npc.asset.builder.BuilderTemplateInteractionVars"
api_surface: false
extends: "BuilderCodecObjectHelper<Map<String, String>>"
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
public class BuilderTemplateInteractionVars extends BuilderCodecObjectHelper<Map<String, String>>
```

A codec object helper specialized for reading template interaction variable maps. Uses the `RootInteraction.CHILD_ASSET_CODEC_MAP` codec to decode a map of string-to-string interaction variables from JSON. Supports runtime override via `ExecutionContext.getInteractionVars()`.

## Constructor

```java
public BuilderTemplateInteractionVars()
```

Initializes with `RootInteraction.class` and `RootInteraction.CHILD_ASSET_CODEC_MAP`.

## Methods

### build

```java
public Map<String, String> build()
```

Throws `UnsupportedOperationException`. Use `build(ExecutionContext)` instead.

```java
@Nullable
public Map<String, String> build(@Nonnull ExecutionContext context)
```

Returns the interaction vars map. If the execution context provides an override, that value is used.

## Related Types

- [BuilderCodecObjectHelper](BuilderCodecObjectHelper.md) -- parent class
- [BuilderModifier](BuilderModifier.md) -- can provide `_InteractionVars` overrides
