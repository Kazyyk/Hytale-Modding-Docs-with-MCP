---
title: "Label"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.interaction.interaction.operation"
fqcn: "com.hypixel.hytale.server.core.modules.interaction.interaction.operation.Label"
api_surface: true
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "interaction"
---

**Package:** `com.hypixel.hytale.server.core.modules.interaction.interaction.operation`

```java
public class Label
```

Represents a named position (index) within an operation sequence built by [OperationsBuilder](OperationsBuilder.md). Used by jump operations to implement branching control flow in interaction pipelines.

## Fields

| Field | Type | Description |
|---|---|---|
| `index` | `int` | The position index in the operation array. Set to `Integer.MIN_VALUE` when unresolved. |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `getIndex()` | `int` | Returns the label's index position. |
| `toString()` | `String` | Returns a debug string representation. |
