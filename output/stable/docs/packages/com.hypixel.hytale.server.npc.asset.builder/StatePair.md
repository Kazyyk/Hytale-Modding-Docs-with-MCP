---
title: "StatePair"
kind: "class"
package: "com.hypixel.hytale.server.npc.asset.builder"
fqcn: "com.hypixel.hytale.server.npc.asset.builder.StatePair"
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
public class StatePair
```

An immutable tuple holding a full state name string and its resolved main state and sub-state integer indices. Used by [BuilderModifier](BuilderModifier.md) for exported state mappings and by [BuilderSupport](BuilderSupport.md) for mapped state pair resolution.

## Constructor

```java
public StatePair(String fullStateName, int state, int subState)
```

## Methods

### getFullStateName

```java
public String getFullStateName()
```

Returns the original state name string (e.g., `"idle.Default"`).

### getState

```java
public int getState()
```

Returns the main state index.

### getSubState

```java
public int getSubState()
```

Returns the sub-state index.

## Related Types

- [BuilderModifier](BuilderModifier.md) -- creates state pairs from `_ExportStates`
- [BuilderSupport](BuilderSupport.md) -- resolves mapped state pairs
- [StateMappingHelper](StateMappingHelper.md) -- produces the indices
