---
title: "PrioritisedProviderView"
kind: "class"
package: "com.hypixel.hytale.server.npc.blackboard.view"
fqcn: "com.hypixel.hytale.server.npc.blackboard.view.PrioritisedProviderView"
api_surface: false
extends: "IBlackboardView<ViewType>>"
implements: 
  - "IBlackboardView<ViewType>"
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags: 
  - "npc"
  - "blackboard"
---

**Package:** `com.hypixel.hytale.server.npc.blackboard.view`

```java
public abstract class PrioritisedProviderView<T, ViewType extends IBlackboardView<ViewType>> implements IBlackboardView<ViewType>
```

Implementation of `IBlackboardView<ViewType>`.

## Fields

| Field | Type | Description |
|---|---|---|
| `LOWEST_PRIORITY` | `int` | Static final int field. |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `registerProvider(int priority, T provider)` | `void` | public method. |
