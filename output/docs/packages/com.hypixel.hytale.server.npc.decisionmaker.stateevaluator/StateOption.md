---
title: "StateOption"
kind: "class"
package: "com.hypixel.hytale.server.npc.decisionmaker.stateevaluator"
fqcn: "com.hypixel.hytale.server.npc.decisionmaker.stateevaluator.StateOption"
api_surface: false
extends: "Option"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags: 
  - "npc"
---

**Package:** `com.hypixel.hytale.server.npc.decisionmaker.stateevaluator`

```java
public class StateOption extends Option
```

Concrete implementation extending `Option`.

## Fields

| Field | Type | Description |
|---|---|---|
| `state` | `String` | String field. |
| `subState` | `String` | String field. |
| `stateIndex` | `int` | int field. |
| `subStateIndex` | `int` | int field. |

## Constructors

| Constructor | Description |
|---|---|
| `StateOption()` | Creates a new StateOption instance. |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `getState()` | `String` | public method. |
| `getSubState()` | `String` | public method. |
| `getStateIndex()` | `int` | public method. |
| `getSubStateIndex()` | `int` | public method. |
| `setStateIndex(int stateIndex, int subStateIndex)` | `void` | public method. |
| `toString()` | `String` | public method. |
