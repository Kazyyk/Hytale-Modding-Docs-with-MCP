---
title: "StateMappingHelper"
kind: "class"
package: "com.hypixel.hytale.server.npc.asset.builder"
fqcn: "com.hypixel.hytale.server.npc.asset.builder.StateMappingHelper"
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
public class StateMappingHelper
```

Manages the bidirectional mapping between state names and integer indices for the NPC state machine system. Supports a two-level hierarchy of main states and sub-states. Tracks which states are used by sensors, setters, and requirers to validate consistency. Also manages component-level local state machines and imported state mappings for component references.

## Constants

| Constant | Value |
|---|---|
| `DEFAULT_STATE` | `"start"` |
| `DEFAULT_SUB_STATE` | `"Default"` |
| `DEFAULT_STATE_PARAMETER` | `"DefaultState"` |
| `STATE_CHANGE_RESET_PARAMETER` | `"ResetOnStateChange"` |

## Key Methods

### getAndPutSensorIndex / getAndPutSetterIndex / getAndPutStateRequirerIndex

```java
public void getAndPutSensorIndex(String state, String subState, @Nonnull BiConsumer<Integer, Integer> setter)
public void getAndPutSetterIndex(String state, String subState, @Nonnull BiConsumer<Integer, Integer> setter)
public void getAndPutStateRequirerIndex(String state, String subState, @Nonnull BiConsumer<Integer, Integer> setter)
```

Register state usage by sensors, setters, or parameter requirers, and return the main and sub-state indices via the callback.

### validate

```java
public void validate(String configName, @Nonnull List<String> errors)
```

Validates that every sensor state has a corresponding setter and vice versa, and that required states exist.

### getStateIndex / getSubStateIndex / getStateName / getSubStateName

```java
public int getStateIndex(String state)
public int getSubStateIndex(int index, String subState)
public String getStateName(int index)
public String getSubStateName(int index, int subState)
```

### Component State Management

```java
public void setNotComponent()
public boolean isComponent()
public boolean hasComponentStates()
public void initialiseComponentState(@Nonnull BuilderSupport support)
public void popComponentState(@Nonnull BuilderSupport support)
public void readComponentDefaultLocalState(@Nonnull JsonObject data)
```

### State Import for Components

```java
public void setComponentImportStateMappings(@Nonnull JsonArray states)
public int getComponentImportStateIndex(String state)
public int importedStateCount()
```

### Depth Tracking

```java
public void increaseDepth()
public void decreaseDepth()
@Nullable
public String getCurrentParentState()
```

### optimise

```java
public void optimise()
```

Releases validation-only data structures after validation completes.

## Inner Types

### IStateMap (private interface)

Internal interface for state index mapping.

### StateMap (private class)

Full implementation tracking sensors, setters, and requirers via `BitSet`.

### SingletonStateMap (private class)

Optimized implementation for states with only one sub-state.

### StateDepth (private class)

Tracks the depth and state name for parent state resolution.

## Related Types

- [BuilderSupport](BuilderSupport.md) -- uses this for state machine setup
- [BuilderModifier](BuilderModifier.md) -- exports states via this helper
- [BuilderParameters](BuilderParameters.md) -- imports states via this helper
- [StatePair](StatePair.md) -- represents a main/sub-state pair
- [Builder](Builder.md) -- `getStateMappingHelper()` returns this type
