---
title: "StateData"
kind: "class"
package: "com.hypixel.hytale.server.core.asset.type.blocktype.config"
fqcn: "com.hypixel.hytale.server.core.asset.type.blocktype.config.StateData"
api_surface: true
extends: "java.lang.Object"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-22T21:11:06Z"
tags:
  - "asset"
  - "blocktype"
  - "state"
---

**Package:** `com.hypixel.hytale.server.core.asset.type.blocktype.config`

```java
public class StateData
```

Maps between block state names and block type asset keys. Provides bidirectional lookups: state name to block key and block key to state name. The default state ID is `"default"`.

## Constants

| Constant | Value |
|---|---|
| `NULL_STATE_ID` | `"default"` |

## Methods

```java
@Nullable
public String getBlockForState(String state)
```

Returns the block type key for the given state name, or `null` if no mapping exists.

```java
@Nullable
public String getStateForBlock(String blockTypeKey)
```

Returns the state name for the given block type key, or `null` if no mapping exists.

```java
@Nullable
public Map<String, Integer> toPacket(@Nonnull BlockType current)
```

Converts the state mapping to a packet-ready map of state names to asset indices.

```java
public void copyFrom(@Nullable StateData state)
```

Copies state data from another instance if this instance has no mapping defined.

## Related Types

- [BlockType](BlockType.md) -- uses this for block state variants
