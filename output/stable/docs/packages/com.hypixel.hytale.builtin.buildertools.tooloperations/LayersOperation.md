---
title: "LayersOperation"
kind: "class"
package: "com.hypixel.hytale.builtin.buildertools.tooloperations"
fqcn: "com.hypixel.hytale.builtin.buildertools.tooloperations.LayersOperation"
api_surface: false
extends: "ToolOperation"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "builtin"
  - "buildertools"
  - "tooloperations"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.buildertools.tooloperations`

```java
public class LayersOperation extends ToolOperation
```

A builder tool operation that applies modifications to terrain.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private` | `boolean` | `failed` |
| `private` | `List<Pair<Integer, String>>` | `layers` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `` | `` | `super(ref, packet, componentAccessor)` |
| `@Override` | `boolean` | `execute0(int x, int y, int z)` |
